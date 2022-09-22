package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ShipmentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class ShipmentItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("action")
  private ShipmentItemActionType action = null;

  @JsonProperty("characteristic")
  @Valid
  private List<Characteristic> characteristic = null;

  @JsonProperty("externalIdentifier")
  @Valid
  private List<ExternalIdentifier> externalIdentifier = null;

  @JsonProperty("product")
  private ProductRefOrValue product = null;

  @JsonProperty("productReservationRef")
  private ReserveProductStockRef productReservationRef = null;

  @JsonProperty("productStockRef")
  private ProductStockRef productStockRef = null;

  @JsonProperty("shipmentItemPrice")
  private Price shipmentItemPrice = null;

  @JsonProperty("weight")
  private Quantity weight = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ShipmentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the individual shipment line item
   * @return id
  **/
  @ApiModelProperty(example = "4aafacbd-11ff-4dc8-b445-305f2215715f789", value = "Identifier of the individual shipment line item")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShipmentItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity the individual shipment line item
   * @return quantity
  **/
  @ApiModelProperty(example = "10 units", value = "Quantity the individual shipment line item")


  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public ShipmentItem sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * SKU (Stock Keeping Unit) is a unique code that you use to identify every inventory item in your warehouse
   * @return sku
  **/
  @ApiModelProperty(example = "UGG-BB-PUR-06", value = "SKU (Stock Keeping Unit) is a unique code that you use to identify every inventory item in your warehouse")


  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ShipmentItem action(ShipmentItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * The action to be carried out on the shipment item. Can be: add, modify, delete, noChange
   * @return action
  **/
  @ApiModelProperty(value = "The action to be carried out on the shipment item. Can be: add, modify, delete, noChange")

  @Valid

  public ShipmentItemActionType getAction() {
    return action;
  }

  public void setAction(ShipmentItemActionType action) {
    this.action = action;
  }

  public ShipmentItem characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public ShipmentItem addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<Characteristic>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * List of characteristics with values that define the test run
   * @return characteristic
  **/
  @ApiModelProperty(value = "List of characteristics with values that define the test run")

  @Valid

  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public ShipmentItem externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ShipmentItem addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<ExternalIdentifier>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * An identification of an entity that is owned by or originates in a software system different from the current system, for example a ProductOrder handed off from a commerce platform into an order handling system. The structure identifies the system itself, the nature of the entity within the system (e.g. class name) and the unique ID of the entity within the system. It is anticipated that multiple external IDs can be held for a single entity, e.g. if the entity passed through multiple systems on the way to the current system. In this case the consumer is expected to sequence the IDs in the array in reverse order of provenance, i.e. most recent system first in the list.
   * @return externalIdentifier
  **/
  @ApiModelProperty(value = "An identification of an entity that is owned by or originates in a software system different from the current system, for example a ProductOrder handed off from a commerce platform into an order handling system. The structure identifies the system itself, the nature of the entity within the system (e.g. class name) and the unique ID of the entity within the system. It is anticipated that multiple external IDs can be held for a single entity, e.g. if the entity passed through multiple systems on the way to the current system. In this case the consumer is expected to sequence the IDs in the array in reverse order of provenance, i.e. most recent system first in the list.")

  @Valid

  public List<ExternalIdentifier> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public ShipmentItem product(ProductRefOrValue product) {
    this.product = product;
    return this;
  }

  /**
   * This data structure captures the product information.
   * @return product
  **/
  @ApiModelProperty(value = "This data structure captures the product information.")

  @Valid

  public ProductRefOrValue getProduct() {
    return product;
  }

  public void setProduct(ProductRefOrValue product) {
    this.product = product;
  }

  public ShipmentItem productReservationRef(ReserveProductStockRef productReservationRef) {
    this.productReservationRef = productReservationRef;
    return this;
  }

  /**
   * Get productReservationRef
   * @return productReservationRef
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ReserveProductStockRef getProductReservationRef() {
    return productReservationRef;
  }

  public void setProductReservationRef(ReserveProductStockRef productReservationRef) {
    this.productReservationRef = productReservationRef;
  }

  public ShipmentItem productStockRef(ProductStockRef productStockRef) {
    this.productStockRef = productStockRef;
    return this;
  }

  /**
   * Get productStockRef
   * @return productStockRef
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductStockRef getProductStockRef() {
    return productStockRef;
  }

  public void setProductStockRef(ProductStockRef productStockRef) {
    this.productStockRef = productStockRef;
  }

  public ShipmentItem shipmentItemPrice(Price shipmentItemPrice) {
    this.shipmentItemPrice = shipmentItemPrice;
    return this;
  }

  /**
   * Item price details
   * @return shipmentItemPrice
  **/
  @ApiModelProperty(value = "Item price details")

  @Valid

  public Price getShipmentItemPrice() {
    return shipmentItemPrice;
  }

  public void setShipmentItemPrice(Price shipmentItemPrice) {
    this.shipmentItemPrice = shipmentItemPrice;
  }

  public ShipmentItem weight(Quantity weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of the shipping item package/parcel
   * @return weight
  **/
  @ApiModelProperty(value = "Weight of the shipping item package/parcel")

  @Valid

  public Quantity getWeight() {
    return weight;
  }

  public void setWeight(Quantity weight) {
    this.weight = weight;
  }

  public ShipmentItem baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ShipmentItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ShipmentItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentItem shipmentItem = (ShipmentItem) o;
    return Objects.equals(this.id, shipmentItem.id) &&
        Objects.equals(this.quantity, shipmentItem.quantity) &&
        Objects.equals(this.sku, shipmentItem.sku) &&
        Objects.equals(this.action, shipmentItem.action) &&
        Objects.equals(this.characteristic, shipmentItem.characteristic) &&
        Objects.equals(this.externalIdentifier, shipmentItem.externalIdentifier) &&
        Objects.equals(this.product, shipmentItem.product) &&
        Objects.equals(this.productReservationRef, shipmentItem.productReservationRef) &&
        Objects.equals(this.productStockRef, shipmentItem.productStockRef) &&
        Objects.equals(this.shipmentItemPrice, shipmentItem.shipmentItemPrice) &&
        Objects.equals(this.weight, shipmentItem.weight) &&
        Objects.equals(this.baseType, shipmentItem.baseType) &&
        Objects.equals(this.schemaLocation, shipmentItem.schemaLocation) &&
        Objects.equals(this.type, shipmentItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, sku, action, characteristic, externalIdentifier, product, productReservationRef, productStockRef, shipmentItemPrice, weight, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productReservationRef: ").append(toIndentedString(productReservationRef)).append("\n");
    sb.append("    productStockRef: ").append(toIndentedString(productStockRef)).append("\n");
    sb.append("    shipmentItemPrice: ").append(toIndentedString(shipmentItemPrice)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

