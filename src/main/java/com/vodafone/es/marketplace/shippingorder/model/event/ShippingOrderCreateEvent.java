package com.vodafone.es.marketplace.shippingorder.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")
public class ShippingOrderCreateEvent extends BaseEvent {
    @JsonProperty("event")
    private ShippingOrderCreateEventPayload event = null;

    public ShippingOrderCreateEvent(ShippingOrder order) {
        ShippingOrderCreateEventPayload payload = new ShippingOrderCreateEventPayload();
        payload.setShippingOrder(order);
        this.event = payload;
        this.setEventId(UUID.randomUUID().toString());
        this.setEventTime(OffsetDateTime.now());
        this.setEventType(this.getClass().getSimpleName());
    }
}

