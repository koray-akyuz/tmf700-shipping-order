package com.vodafone.es.marketplace.shippingorder.service;

import com.github.fge.jsonpatch.JsonPatch;
import com.querydsl.core.types.Predicate;
import com.vodafone.es.marketplace.shippingorder.error.ApiException;
import com.vodafone.es.marketplace.shippingorder.error.BadRequestException;
import com.vodafone.es.marketplace.shippingorder.error.NotFoundException;
import com.vodafone.es.marketplace.shippingorder.model.QueryParamsDTO;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderCreate;
import org.springframework.data.domain.Page;

public interface ShippingOrderService {

    Page<ShippingOrder> listShippingOrders(Predicate predicate, QueryParamsDTO queryParams);
    ShippingOrder createShippingOrder(ShippingOrderCreate shippingOrderCreate) throws BadRequestException;
    ShippingOrder retrieveShippingOrder(String id, String fields) throws NotFoundException;
    ShippingOrder patchShippingOrder(String id, JsonPatch jsonPatch) throws ApiException;
}
