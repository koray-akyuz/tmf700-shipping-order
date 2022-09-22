package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of shipping order items
 */
@ApiModel(description = "A list of shipping order items")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class ShippingOrderItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("action")
  private ShippingOrderItemActionType action = null;

  @JsonProperty("placeFrom")
  private RelatedPlaceRefOrValue placeFrom = null;

  @JsonProperty("placeTo")
  private RelatedPlaceRefOrValue placeTo = null;

  @JsonProperty("product")
  private ProductRef product = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  @JsonProperty("productOrderItem")
  private ProductOrderItemRef productOrderItem = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyWithContactInfo> relatedParty = null;

  @JsonProperty("shipment")
  private ShipmentRefOrValue shipment = null;

  @JsonProperty("shippingInstruction")
  private ShippingInstruction shippingInstruction = null;

  @JsonProperty("shippingOrderItemOffering")
  private ProductOfferingRef shippingOrderItemOffering = null;

  @JsonProperty("shippingOrderItemPrice")
  private ProductPrice shippingOrderItemPrice = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ShippingOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the Shipping Order Item
   * @return id
  **/
  @ApiModelProperty(example = "4aafacbd-11ff-4dc8-b445-305f2215715f", required = true, value = "Identifier of the Shipping Order Item")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShippingOrderItem href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ShippingOrderItem quantity(String quantity) {
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

  public ShippingOrderItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status of shipping order item. e.g \"active\" , \"savedForLater\"
   * @return status
  **/
  @ApiModelProperty(example = "active", value = "status of shipping order item. e.g \"active\" , \"savedForLater\"")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ShippingOrderItem action(ShippingOrderItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * The action to be carried out on the Product. Can be: add, modify, delete, noChange
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The action to be carried out on the Product. Can be: add, modify, delete, noChange")
  @NotNull

  @Valid

  public ShippingOrderItemActionType getAction() {
    return action;
  }

  public void setAction(ShippingOrderItemActionType action) {
    this.action = action;
  }

  public ShippingOrderItem placeFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
    return this;
  }

  /**
   * Source location of the item. E.g. warehouse or shop location
   * @return placeFrom
  **/
  @ApiModelProperty(value = "Source location of the item. E.g. warehouse or shop location")

  @Valid

  public RelatedPlaceRefOrValue getPlaceFrom() {
    return placeFrom;
  }

  public void setPlaceFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
  }

  public ShippingOrderItem placeTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
    return this;
  }

  /**
   * Destination of the item. E.g. customer home address. 
   * @return placeTo
  **/
  @ApiModelProperty(value = "Destination of the item. E.g. customer home address. ")

  @Valid

  public RelatedPlaceRefOrValue getPlaceTo() {
    return placeTo;
  }

  public void setPlaceTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
  }

  public ShippingOrderItem product(ProductRef product) {
    this.product = product;
    return this;
  }

  /**
   * The product for which the shipping order is created, if supplied as input the attribute id must be populated
   * @return product
  **/
  @ApiModelProperty(value = "The product for which the shipping order is created, if supplied as input the attribute id must be populated")

  @Valid

  public ProductRef getProduct() {
    return product;
  }

  public void setProduct(ProductRef product) {
    this.product = product;
  }

  public ShippingOrderItem productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Item has a corresponding offering in the product catalog.
   * @return productOffering
  **/
  @ApiModelProperty(value = "Item has a corresponding offering in the product catalog.")

  @Valid

  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }
//
//  public ShippingOrderItem productOrderItem(ProductOrderItemRef productOrderItem) {
//    this.productOrderItem = productOrderItem;
//    return this;
//  }

//  /**
//   * The product order item for which the shipping order is created, if supplied as input the attribute id must be populated
//   * @return productOrderItem
//  **/
//  @ApiModelProperty(value = "The product order item for which the shipping order is created, if supplied as input the attribute id must be populated")
//
//  @Valid
//
//  public ProductOrderItemRef getProductOrderItem() {
//    return productOrderItem;
//  }
//
//  public void setProductOrderItem(ProductOrderItemRef productOrderItem) {
//    this.productOrderItem = productOrderItem;
//  }

  public ShippingOrderItem relatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShippingOrderItem addRelatedPartyItem(RelatedPartyWithContactInfo relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyWithContactInfo>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A party which is involved in this shipment and the role they are playing and address. In case of shipping to addresses where a geo location is needed than then PlaceTo,PlaceFrom can be used.
   * @return relatedParty
  **/
  @ApiModelProperty(value = "A party which is involved in this shipment and the role they are playing and address. In case of shipping to addresses where a geo location is needed than then PlaceTo,PlaceFrom can be used.")

  @Valid

  public List<RelatedPartyWithContactInfo> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ShippingOrderItem shipment(ShipmentRefOrValue shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * A set of goods to be shipped
   * @return shipment
  **/
  @ApiModelProperty(value = "A set of goods to be shipped")

  @Valid

  public ShipmentRefOrValue getShipment() {
    return shipment;
  }

  public void setShipment(ShipmentRefOrValue shipment) {
    this.shipment = shipment;
  }

  public ShippingOrderItem shippingInstruction(ShippingInstruction shippingInstruction) {
    this.shippingInstruction = shippingInstruction;
    return this;
  }

  /**
   * Shipping instructions, usually relevant for the carrier.
   * @return shippingInstruction
  **/
  @ApiModelProperty(value = "Shipping instructions, usually relevant for the carrier.")

  @Valid

  public ShippingInstruction getShippingInstruction() {
    return shippingInstruction;
  }

  public void setShippingInstruction(ShippingInstruction shippingInstruction) {
    this.shippingInstruction = shippingInstruction;
  }

  public ShippingOrderItem shippingOrderItemOffering(ProductOfferingRef shippingOrderItemOffering) {
    this.shippingOrderItemOffering = shippingOrderItemOffering;
    return this;
  }

  /**
   * Each shipping order item can have a corresponding product offer in the product catalog.
   * @return shippingOrderItemOffering
  **/
  @ApiModelProperty(value = "Each shipping order item can have a corresponding product offer in the product catalog.")

  @Valid

  public ProductOfferingRef getShippingOrderItemOffering() {
    return shippingOrderItemOffering;
  }

  public void setShippingOrderItemOffering(ProductOfferingRef shippingOrderItemOffering) {
    this.shippingOrderItemOffering = shippingOrderItemOffering;
  }

  public ShippingOrderItem shippingOrderItemPrice(ProductPrice shippingOrderItemPrice) {
    this.shippingOrderItemPrice = shippingOrderItemPrice;
    return this;
  }

  /**
   * Shipping Order Item price. The price of shipping this item. It depends if there is a ShippingOrder level price or per each individual item.
   * @return shippingOrderItemPrice
  **/
  @ApiModelProperty(value = "Shipping Order Item price. The price of shipping this item. It depends if there is a ShippingOrder level price or per each individual item.")

  @Valid

  public ProductPrice getShippingOrderItemPrice() {
    return shippingOrderItemPrice;
  }

  public void setShippingOrderItemPrice(ProductPrice shippingOrderItemPrice) {
    this.shippingOrderItemPrice = shippingOrderItemPrice;
  }

  public ShippingOrderItem baseType(String baseType) {
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

  public ShippingOrderItem schemaLocation(String schemaLocation) {
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

  public ShippingOrderItem type(String type) {
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
    ShippingOrderItem shippingOrderItem = (ShippingOrderItem) o;
    return Objects.equals(this.id, shippingOrderItem.id) &&
        Objects.equals(this.href, shippingOrderItem.href) &&
        Objects.equals(this.quantity, shippingOrderItem.quantity) &&
        Objects.equals(this.status, shippingOrderItem.status) &&
        Objects.equals(this.action, shippingOrderItem.action) &&
        Objects.equals(this.placeFrom, shippingOrderItem.placeFrom) &&
        Objects.equals(this.placeTo, shippingOrderItem.placeTo) &&
        Objects.equals(this.product, shippingOrderItem.product) &&
        Objects.equals(this.productOffering, shippingOrderItem.productOffering) &&
       // Objects.equals(this.productOrderItem, shippingOrderItem.productOrderItem) &&
        Objects.equals(this.relatedParty, shippingOrderItem.relatedParty) &&
        Objects.equals(this.shipment, shippingOrderItem.shipment) &&
        Objects.equals(this.shippingInstruction, shippingOrderItem.shippingInstruction) &&
        Objects.equals(this.shippingOrderItemOffering, shippingOrderItem.shippingOrderItemOffering) &&
        Objects.equals(this.shippingOrderItemPrice, shippingOrderItem.shippingOrderItemPrice) &&
        Objects.equals(this.baseType, shippingOrderItem.baseType) &&
        Objects.equals(this.schemaLocation, shippingOrderItem.schemaLocation) &&
        Objects.equals(this.type, shippingOrderItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, quantity, status, action, placeFrom, placeTo, product, productOffering, /* productOrderItem, */ relatedParty, shipment, shippingInstruction, shippingOrderItemOffering, shippingOrderItemPrice, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    placeFrom: ").append(toIndentedString(placeFrom)).append("\n");
    sb.append("    placeTo: ").append(toIndentedString(placeTo)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
   // sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    shippingInstruction: ").append(toIndentedString(shippingInstruction)).append("\n");
    sb.append("    shippingOrderItemOffering: ").append(toIndentedString(shippingOrderItemOffering)).append("\n");
    sb.append("    shippingOrderItemPrice: ").append(toIndentedString(shippingOrderItemPrice)).append("\n");
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

