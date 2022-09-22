package com.vodafone.es.marketplace.shippingorder.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.querydsl.core.types.Predicate;
import com.vodafone.es.marketplace.shippingorder.constants.Constants;
import com.vodafone.es.marketplace.shippingorder.error.ApiException;
import com.vodafone.es.marketplace.shippingorder.error.BadRequestException;
import com.vodafone.es.marketplace.shippingorder.error.NotFoundException;
import com.vodafone.es.marketplace.shippingorder.model.QueryParamsDTO;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderCreate;
import com.vodafone.es.marketplace.shippingorder.service.ShippingOrderService;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")

@RestController
@CrossOrigin
public class ShippingOrderApiController implements ShippingOrderApi {

    private final ObjectMapper objectMapper;

    private ShippingOrderService shippingOrderService;

    @org.springframework.beans.factory.annotation.Autowired
    public ShippingOrderApiController(ObjectMapper objectMapper, HttpServletRequest request, RequestMappingHandlerMapping requestMappingHandlerMapping, ShippingOrderService shippingOrderService) {
        this.objectMapper = objectMapper;
        this.shippingOrderService = shippingOrderService;
    }

    public ResponseEntity<ShippingOrder> createShippingOrder(@ApiParam(value = "The ShippingOrder to be created", required = true) @Valid @RequestBody ShippingOrderCreate shippingOrder) throws BadRequestException {

        ShippingOrder createdOrder = shippingOrderService.createShippingOrder(shippingOrder);
        return new ResponseEntity<ShippingOrder>(createdOrder, HttpStatus.CREATED);
    }

    public ResponseEntity<List<ShippingOrder>> listShippingOrder(Predicate predicate, @ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields, @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset, @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        // TODO make this part configurable from app settings
        QueryParamsDTO queryParams = new QueryParamsDTO();
        queryParams.setFields(fields);
        queryParams.setLimit(Objects.isNull(limit) ? 150 : limit);
        queryParams.setOffset(Objects.isNull(offset) ? 0 : offset);

        Page<ShippingOrder> shippingOrders = shippingOrderService.listShippingOrders(predicate, queryParams);

        return ResponseEntity.ok().headers(prepareHeaders(shippingOrders, queryParams)).body(shippingOrders.getContent());

    }

    public ResponseEntity<ShippingOrder> patchShippingOrder(@ApiParam(value = "Identifier of the ShippingOrder", required = true) @PathVariable("id") String id, @ApiParam(value = "The ShippingOrder to be updated", required = true) @Valid @RequestBody JsonPatch jsonPatch) throws ApiException {

        ShippingOrder shippingOrder = shippingOrderService.patchShippingOrder(id, jsonPatch);
        return new ResponseEntity<ShippingOrder>(shippingOrder, HttpStatus.OK);
    }

    public ResponseEntity<ShippingOrder> retrieveShippingOrder(@ApiParam(value = "Identifier of the ShippingOrder", required = true) @PathVariable("id") String id, @ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) throws NotFoundException {
        String orderId = id;
        String filterFields = fields;
        ShippingOrder order = shippingOrderService.retrieveShippingOrder(id, fields);
        return new ResponseEntity<ShippingOrder>(order, HttpStatus.OK);
    }

    private HttpHeaders prepareHeaders(Page<ShippingOrder> orders, QueryParamsDTO queryParams) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(Constants.HEADER_X_TOTAL_COUNT, String.valueOf(orders.getTotalElements()));
        responseHeaders.set(Constants.HEADER_X_CURRENT_PAGE, String.valueOf(queryParams.getPage()));
        responseHeaders.set(Constants.HEADER_X_PAGE_SIZE, String.valueOf(queryParams.getLimit()));
        return responseHeaders;
    }

}
