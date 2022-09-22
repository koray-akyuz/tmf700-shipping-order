package com.vodafone.es.marketplace.shippingorder.service;

import com.vodafone.es.marketplace.shippingorder.model.event.BaseEvent;

public interface EventService {

    void sendMessage(BaseEvent event);

    BaseEvent receiveMessage();
}
