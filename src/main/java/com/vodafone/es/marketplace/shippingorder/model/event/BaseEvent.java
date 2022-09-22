package com.vodafone.es.marketplace.shippingorder.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BaseEvent {

    @JsonProperty("eventId")
    private String eventId = null;

    @JsonProperty("eventTime")
    private OffsetDateTime eventTime = null;

    @JsonProperty("eventType")
    private String eventType = null;

    @JsonProperty("correlationId")
    private String correlationId = null;

    @JsonProperty("domain")
    private String domain = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("priority")
    private String priority = null;

    @JsonProperty("timeOcurred")
    private OffsetDateTime timeOcurred = null;

}
