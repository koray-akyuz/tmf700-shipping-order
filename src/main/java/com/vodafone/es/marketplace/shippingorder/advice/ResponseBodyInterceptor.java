package com.vodafone.es.marketplace.shippingorder.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bohnman.squiggly.Squiggly;
import com.github.bohnman.squiggly.util.SquigglyUtils;
import com.vodafone.es.marketplace.shippingorder.constants.Constants;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@ControllerAdvice
public class ResponseBodyInterceptor implements ResponseBodyAdvice<Object> {

    private final ObjectMapper objectMapper;

    public ResponseBodyInterceptor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    @SneakyThrows
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        HttpServletRequest httpServletRequest = ((ServletServerHttpRequest) request).getServletRequest();
        String fields = httpServletRequest.getParameter(Constants.FIELDS);
        if (Objects.nonNull(fields)) {
            boolean hasId = Arrays
                    .stream(fields.trim().split(","))
                    .anyMatch(str -> Objects.equals(str, Constants.PARAM_ID));
            if (!hasId)
                fields = fields +",id";
            boolean hasHref = Arrays
                    .stream(fields.trim().split(","))
                    .anyMatch(str -> Objects.equals(str, Constants.PARAM_HREF));
            if (!hasId)
                fields = fields +",href";
            String collect = Arrays
                    .stream(fields.trim().split(","))
                    .map(String::trim)
                    .collect(Collectors.joining(","));

            ObjectMapper customMapper = Squiggly.init(objectMapper, collect);
            return customMapper.readValue(SquigglyUtils.stringify(customMapper, body), Object.class);
        }
        return body;
    }
}
