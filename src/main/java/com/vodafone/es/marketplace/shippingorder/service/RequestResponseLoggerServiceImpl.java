package com.vodafone.es.marketplace.shippingorder.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class RequestResponseLoggerServiceImpl implements RequestResponseLoggerService{
    @Override
    public void logResponse() {

    }

    @Override
    public void logRequest(HttpServletRequest request, Object body) {
        log.debug("===========================request begin================================================");
        log.debug("URI         : {}", request.getRequestURI());
        log.debug("Method      : {}", request.getMethod());
        log.debug("Request body: {}", String.valueOf(body));
        log.debug("==========================request end================================================");
    }
}
