package com.vodafone.es.marketplace.shippingorder.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.querydsl.core.types.Predicate;
import com.vodafone.es.marketplace.shippingorder.constants.Constants;
import com.vodafone.es.marketplace.shippingorder.error.ApiException;
import com.vodafone.es.marketplace.shippingorder.error.BadRequestException;
import com.vodafone.es.marketplace.shippingorder.error.NotFoundException;
import com.vodafone.es.marketplace.shippingorder.model.QueryParamsDTO;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderCreate;
import com.vodafone.es.marketplace.shippingorder.model.event.ShippingOrderAttributeValueChangeEvent;
import com.vodafone.es.marketplace.shippingorder.model.event.ShippingOrderCreateEvent;
import com.vodafone.es.marketplace.shippingorder.model.event.ShippingOrderStateChangeEvent;
import com.vodafone.es.marketplace.shippingorder.repository.ShippingOrderRepository;
import com.vodafone.es.marketplace.shippingorder.util.ShippingOrderCreateMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.*;

@Slf4j
@Service
public class ShippingOrderServiceImpl implements ShippingOrderService {

    private final ShippingOrderRepository shippingOrderRepository;

    private final ShippingOrderCreateMapper mapper;

    private final ObjectMapper objectMapper;

    private final EventService eventService;

    @Value("${href.address}")
    private String serverAddress;


    public ShippingOrderServiceImpl(ShippingOrderRepository shippingOrderRepository, ShippingOrderCreateMapper mapper, MongoTemplate mongoTemplate, ObjectMapper objectMapper, EventService eventService) {
        this.shippingOrderRepository = shippingOrderRepository;
        this.mapper = mapper;
        this.objectMapper = objectMapper;
        this.eventService = eventService;
    }

    @Override
    public Page<ShippingOrder> listShippingOrders(Predicate predicate, QueryParamsDTO queryParams) {
        log.info("ShippingOrder.listShippingOrders is called with {} {}", predicate.toString(), queryParams.toString());
        PageRequest pager = PageRequest.of(queryParams.getPage(), queryParams.getLimit());
        return shippingOrderRepository.findAll(predicate, pager);
    }


    @Override
    public ShippingOrder createShippingOrder(ShippingOrderCreate shippingOrderCreate) throws BadRequestException {
        validateInputForCreate(shippingOrderCreate);
        ShippingOrder shippingOrder = mapper.map(shippingOrderCreate);
        shippingOrder.setCreationDate(OffsetDateTime.now());
        shippingOrder.setLastUpdateDate(OffsetDateTime.now());
        String id = UUID.randomUUID().toString();
        shippingOrder.setId(id);
        shippingOrder.setHref(serverAddress + id);
        ShippingOrder order = shippingOrderRepository.save(shippingOrder);
        ShippingOrderCreateEvent event = new ShippingOrderCreateEvent(order);
        eventService.sendMessage(event);
        return order;
    }

    @Override
    public ShippingOrder retrieveShippingOrder(String id, String fields) throws NotFoundException {
        log.info("ShippingOrder.retrieveShippingOrder is called with {} {}", id, fields);
        return shippingOrderRepository.findById(id).orElseThrow(() -> new NotFoundException(404, "No ShippingOrder found for id: " + id));
    }

    @Override
    public ShippingOrder patchShippingOrder(String id, JsonPatch jsonPatch) throws ApiException {
        ShippingOrder shippingOrder = retrieveShippingOrder(id, null);
        checkNonPatchableAttributes(jsonPatch);
        try {
            ShippingOrder newOrder = objectMapper.treeToValue(jsonPatch.apply(objectMapper.valueToTree(shippingOrder)), ShippingOrder.class);
            ShippingOrder order = shippingOrderRepository.save(newOrder);
            sendPatchMessage(shippingOrder, newOrder, jsonPatch);
            return order;
        } catch (JsonPatchException | JsonProcessingException e) {
            throw new ApiException(500, "Can not patch ShippingOrder with ID: " + id);
        }
    }

    private void checkNonPatchableAttributes(JsonPatch jsonPatch) throws BadRequestException {

        List<String> strings = Arrays.asList("/id", "/href", "/shippingOrderItem/id", "/shippingOrderItem/href", "/creationDate", "/lastUpdateDate");
        List<String> nonPatchableList = new ArrayList<>();

        JsonNode jsonNode = objectMapper.convertValue(jsonPatch, JsonNode.class);

        for (JsonNode node : jsonNode) {
            String path = node.get("path").asText();
            path = path.replaceAll("\\d", "");
            path = path.replace("//", "/");

            if (strings.contains(path))
                nonPatchableList.add(path);
        }
        if (!nonPatchableList.isEmpty()) {
            throw new BadRequestException(400, "Following fields can not be patched: " + nonPatchableList.toString());
        }
    }

    private void validateInputForCreate(ShippingOrderCreate shippingOrderCreate) throws BadRequestException {
        if (Objects.isNull(shippingOrderCreate.getShippingOrderItem()) || shippingOrderCreate.getShippingOrderItem().isEmpty())
            throw new BadRequestException(400, "Following fields can not be empty: " + Constants.PARAM_ORDER_ITEM);
        boolean hasMissingFields = shippingOrderCreate
                .getShippingOrderItem()
                .stream()
                .anyMatch(item -> (Objects.isNull(item.getAction()) || Objects.isNull(item.getId())));
        if (hasMissingFields)
            throw new BadRequestException(400, "Following fields can not be empty: [ " + Constants.PARAM_ORDER_ITEM_ID + "," + Constants.PARAM_ORDER_ITEM_ACTION + "]");

    }

    private void sendPatchMessage(ShippingOrder beforePatch, ShippingOrder afterPatch, JsonPatch jsonPatch) {
        if (isStatusHasPatched(jsonPatch)) {
            if (!Objects.equals(beforePatch.getStatus(), afterPatch.getStatus())) {
                ShippingOrderStateChangeEvent event = new ShippingOrderStateChangeEvent(afterPatch);
                eventService.sendMessage(event);
            }
        } else {
            ShippingOrderAttributeValueChangeEvent event = new ShippingOrderAttributeValueChangeEvent(afterPatch);
            eventService.sendMessage(event);
        }
    }

    private boolean isStatusHasPatched(JsonPatch jsonPatch) {
        JsonNode jsonNode = objectMapper.convertValue(jsonPatch, JsonNode.class);
        for (JsonNode node : jsonNode) {
            boolean statusChanged = Objects.equals(node.get("path").asText(), Constants.PATCH_FIELD_STATUS);
            if (statusChanged)
                return true;
        }
        return false;
    }
}
