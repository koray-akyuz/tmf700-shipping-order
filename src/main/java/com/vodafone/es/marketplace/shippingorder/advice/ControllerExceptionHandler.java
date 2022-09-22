package com.vodafone.es.marketplace.shippingorder.advice;

import com.vodafone.es.marketplace.shippingorder.error.ApiException;
import com.vodafone.es.marketplace.shippingorder.error.BadRequestException;
import com.vodafone.es.marketplace.shippingorder.error.NotFoundException;
import com.vodafone.es.marketplace.shippingorder.error.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex, WebRequest request) {
        log.error("Unexpected error is occurred: " + ex.getMessage(), ex);
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), Collections.singletonList(ex.toString()), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> noSuchElementExceptionHandler(NoSuchElementException ex, NativeWebRequest request) {
        log.error("No such element: " + ex.getMessage(), ex);
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), Collections.singletonList(ex.toString()), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleNoDataFoundException(NotFoundException ex, NativeWebRequest request) {
        log.error("No Data Found!: " + ex.getMessage(), ex);
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), Collections.singletonList(ex.toString()), HttpStatus.NOT_FOUND.value()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorResponse> handleApiException(ApiException ex, NativeWebRequest request) {
        log.error("ApiException Error !: " + ex.getMessage(), ex);
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), Collections.singletonList(ex.toString()), HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handBadRequestApiException(BadRequestException ex, NativeWebRequest request) {
        log.error("ApiException Error !: " + ex.getMessage(), ex);
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), Collections.singletonList(ex.toString()), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(HttpMessageConversionException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> httpMessageConversionExceptionHandler(HttpMessageConversionException ex, WebRequest request) {
        log.error("Http message conversion error occurred: " + ex.getMessage(), ex);
        String message = "Required request body is missing";
        return new ResponseEntity<>(new ErrorResponse(message, Collections.singletonList(message), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> httpMessageConversionExceptionHandler(IllegalArgumentException ex, WebRequest request) {
        log.error("Illegal argument exception error occurred: " + ex.getMessage(), ex);
        String message = "Bad Request: Failed to convert value of type.";
        return new ResponseEntity<>(new ErrorResponse(message, Collections.singletonList(message), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConcurrentModificationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> httpMessageConversionExceptionHandler(ConcurrentModificationException ex, WebRequest request) {
        log.error("ConcurrentModificationException exception error occurred: " + ex.getMessage(), ex);
        String message = "Bad Request: " + ex.getMessage();
        return new ResponseEntity<>(new ErrorResponse(message, Collections.singletonList(message), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

}
