package com.vodafone.es.marketplace.shippingorder.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vodafone.es.marketplace.shippingorder.model.event.BaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
@Slf4j
public class EventServiceImp implements EventService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    private final ObjectMapper mapper;

    @Value(value = "${spring.kafka.topics.shipping-order}")
    private String topicName;

    public EventServiceImp(KafkaTemplate<String, Object> kafkaTemplate, ObjectMapper mapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapper = mapper;
    }

    @Override
    public void sendMessage(BaseEvent event) {
        try {
            //String message = mapper.writeValueAsString(event);
            kafkaTemplate.send(topicName, event);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Couldn't send event {} with id {} to kafka topic {}", event.getEventType(), event.getEventId(), topicName);
        }

    }

    @Override
    public BaseEvent receiveMessage() {
        return null;
    }
}
