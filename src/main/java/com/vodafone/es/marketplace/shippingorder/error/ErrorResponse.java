package com.vodafone.es.marketplace.shippingorder.error;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {

    private String message;

    private List<String> details;

    private int code;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public ErrorResponse(String message, List<String> details, int code) {
        this.message = message;
        this.details = details;
        this.code = code;
    }

}
