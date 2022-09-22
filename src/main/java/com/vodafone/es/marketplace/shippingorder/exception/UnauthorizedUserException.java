package com.vodafone.es.marketplace.shippingorder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedUserException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public UnauthorizedUserException(String message) {
		super(message);
	}
}
