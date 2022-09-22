package com.vodafone.es.marketplace.shippingorder.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Possible values for the signature requirement upon receiving the shipment
 */
public enum SignatureRequiredByType {
  
  ADULT("adult"),
  
  RECEIVER("receiver");

  private String value;

  SignatureRequiredByType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SignatureRequiredByType fromValue(String text) {
    for (SignatureRequiredByType b : SignatureRequiredByType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

