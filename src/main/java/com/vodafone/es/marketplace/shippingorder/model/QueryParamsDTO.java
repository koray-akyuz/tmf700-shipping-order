package com.vodafone.es.marketplace.shippingorder.model;


import lombok.Data;

@Data
public class QueryParamsDTO {
    private Integer offset;
    private Integer limit;
    private Integer page;
    private String fields;


    public Integer getPage() {
        return limit == 0 ? 0 : offset/limit;
    }

}
