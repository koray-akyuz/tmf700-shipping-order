package com.vodafone.es.marketplace.shippingorder.error;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")

public class BadRequestException extends ApiException {
    private int code;
    public BadRequestException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
