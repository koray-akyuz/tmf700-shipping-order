package com.vodafone.es.marketplace.shippingorder.service;

import javax.servlet.http.HttpServletRequest;

public interface RequestResponseLoggerService {
    void logResponse();
    void logRequest(HttpServletRequest request, Object body);
}
