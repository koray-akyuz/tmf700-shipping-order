package com.vodafone.es.marketplace.shippingorder.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * action to be performed on the shipment item
 */
public enum ShipmentItemActionType {
  
  ADD("add"),
  
  MODIFY("modify"),
  
  DELETE("delete"),
  
  NOCHANGE("noChange");

  private String value;

  ShipmentItemActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShipmentItemActionType fromValue(String text) {
    for (ShipmentItemActionType b : ShipmentItemActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

