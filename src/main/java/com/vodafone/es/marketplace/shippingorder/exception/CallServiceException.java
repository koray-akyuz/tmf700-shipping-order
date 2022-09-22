package com.vodafone.es.marketplace.shippingorder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class CallServiceException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public CallServiceException(String message) {
		super(message);
	}
	
	public CallServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
