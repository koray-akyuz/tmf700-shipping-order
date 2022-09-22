package com.vodafone.es.marketplace.shippingorder.util;

import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderCreate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShippingOrderCreateMapper {
    ShippingOrder map(ShippingOrderCreate create);
}
