package com.vodafone.es.marketplace.shippingorder.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


@Data
public class ShippingOrderAttributeValueChangeEvent extends BaseEvent {

    @JsonProperty("event")
    private ShippingOrderAttributeValueChangeEventPayload event = null;

    public ShippingOrderAttributeValueChangeEvent(ShippingOrder order) {
        ShippingOrderAttributeValueChangeEventPayload payload = new ShippingOrderAttributeValueChangeEventPayload();
        payload.setShippingOrder(order);
        this.event = payload;
        this.setEventId(UUID.randomUUID().toString());
        this.setEventTime(OffsetDateTime.now());
        this.setEventType(this.getClass().getSimpleName());
    }
}

