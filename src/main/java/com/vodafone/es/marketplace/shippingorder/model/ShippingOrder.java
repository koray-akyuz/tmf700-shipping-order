package com.vodafone.es.marketplace.shippingorder.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A Shipping Order is a document used by a business to specify what items are to be transferred from a storage location or warehouse to which person and to which new location. A Shipping Order can typically be sent along with a shipment of goods so that the person receiving them can verify that the document correctly reflects the items that they actually received.
 */
@ApiModel(description = "A Shipping Order is a document used by a business to specify what items are to be transferred from a storage location or warehouse to which person and to which new location. A Shipping Order can typically be sent along with a shipment of goods so that the person receiving them can verify that the document correctly reflects the items that they actually received.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")

@QueryEntity
@Document(collection = "shipping_order")
public class ShippingOrder   {
  @JsonProperty("id")
  @Id
  @Indexed
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("lastUpdateDate")
  private OffsetDateTime lastUpdateDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("placeFrom")
  private RelatedPlaceRefOrValue placeFrom = null;

  @JsonProperty("placeTo")
  private RelatedPlaceRefOrValue placeTo = null;

  @JsonProperty("productOrder")
  private ProductOrderRef productOrder = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyWithContactInfo> relatedParty = null;

  @JsonProperty("relatedShippingOrder")
  private RelatedShippingOrder relatedShippingOrder = null;

  @JsonProperty("shippingInstruction")
  private ShippingInstruction shippingInstruction = null;

  @JsonProperty("shippingOrderCharacteristic")
  @Valid
  private List<Characteristic> shippingOrderCharacteristic = null;

  @JsonProperty("shippingOrderItem")
  @Valid
  private List<ShippingOrderItem> shippingOrderItem = null;

  @JsonProperty("shippingOrderOffering")
  private ProductOfferingRef shippingOrderOffering = null;

  @JsonProperty("shippingOrderPrice")
  private ProductPrice shippingOrderPrice = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ShippingOrder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the Shipping Order
   * @return id
  **/
  @ApiModelProperty(example = "4aafacbd-11ff-4dc8-b445-305f2215715f123", value = "Identifier of the Shipping Order")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShippingOrder href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Shipping Order unique reference
   * @return href
  **/
  @ApiModelProperty(example = "http://host/Attachment/4aafacbd-11ff-4dc8-b445-305f2215715f", value = "Shipping Order unique reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ShippingOrder creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date of the Shipping Order
   * @return creationDate
  **/
  @ApiModelProperty(example = "2020-11-10T08:00:00Z", value = "Date of the Shipping Order")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ShippingOrder lastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * Date of the Shipping Order
   * @return lastUpdateDate
  **/
  @ApiModelProperty(example = "2020-11-10T08:00:00Z", value = "Date of the Shipping Order")

  @Valid

  public OffsetDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public ShippingOrder status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status of shipping order e.g \"active\" , \"savedForLater\"
   * @return status
  **/
  @ApiModelProperty(example = "active", value = "status of shipping order e.g \"active\" , \"savedForLater\"")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ShippingOrder note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ShippingOrder addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this shipping shipment
   * @return note
  **/
  @ApiModelProperty(value = "A list of notes made on this shipping shipment")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ShippingOrder placeFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
    return this;
  }

  /**
   * Source location of the item. E.g. warehouse or shop location. The location can be specified at the shipping order level or at the shipping order item level if multiple sources are specified part of the same shipping order.
   * @return placeFrom
  **/
  @ApiModelProperty(value = "Source location of the item. E.g. warehouse or shop location. The location can be specified at the shipping order level or at the shipping order item level if multiple sources are specified part of the same shipping order.")

  @Valid

  public RelatedPlaceRefOrValue getPlaceFrom() {
    return placeFrom;
  }

  public void setPlaceFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
  }

  public ShippingOrder placeTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
    return this;
  }

  /**
   * Destination of the item. E.g. customer home address. The location can be specified at the shipping order level or at the shipping order item level if multiple destinations are specified part of the same shipping order.
   * @return placeTo
  **/
  @ApiModelProperty(value = "Destination of the item. E.g. customer home address. The location can be specified at the shipping order level or at the shipping order item level if multiple destinations are specified part of the same shipping order.")

  @Valid

  public RelatedPlaceRefOrValue getPlaceTo() {
    return placeTo;
  }

  public void setPlaceTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
  }

  public ShippingOrder productOrder(ProductOrderRef productOrder) {
    this.productOrder = productOrder;
    return this;
  }

  /**
   * The product order for which the shipping order is created, if supplied as input the attribute id must be populated
   * @return productOrder
  **/
  @ApiModelProperty(value = "The product order for which the shipping order is created, if supplied as input the attribute id must be populated")

  @Valid

  public ProductOrderRef getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(ProductOrderRef productOrder) {
    this.productOrder = productOrder;
  }

  public ShippingOrder relatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShippingOrder addRelatedPartyItem(RelatedPartyWithContactInfo relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyWithContactInfo>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * An existing related party that has some form of correlation with the given shipping order. It can be recipient, payer, etc.
   * @return relatedParty
  **/
  @ApiModelProperty(value = "An existing related party that has some form of correlation with the given shipping order. It can be recipient, payer, etc.")

  @Valid

  public List<RelatedPartyWithContactInfo> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ShippingOrder relatedShippingOrder(RelatedShippingOrder relatedShippingOrder) {
    this.relatedShippingOrder = relatedShippingOrder;
    return this;
  }

  /**
   * An existing shipping order that has some form of correlation with the given shipping order
   * @return relatedShippingOrder
  **/
  @ApiModelProperty(value = "An existing shipping order that has some form of correlation with the given shipping order")

  @Valid

  public RelatedShippingOrder getRelatedShippingOrder() {
    return relatedShippingOrder;
  }

  public void setRelatedShippingOrder(RelatedShippingOrder relatedShippingOrder) {
    this.relatedShippingOrder = relatedShippingOrder;
  }

  public ShippingOrder shippingInstruction(ShippingInstruction shippingInstruction) {
    this.shippingInstruction = shippingInstruction;
    return this;
  }

  /**
   * The product order for which the shipping order is created, if supplied as input the attribute id must be populated
   * @return shippingInstruction
  **/
  @ApiModelProperty(value = "The product order for which the shipping order is created, if supplied as input the attribute id must be populated")

  @Valid

  public ShippingInstruction getShippingInstruction() {
    return shippingInstruction;
  }

  public void setShippingInstruction(ShippingInstruction shippingInstruction) {
    this.shippingInstruction = shippingInstruction;
  }

  public ShippingOrder shippingOrderCharacteristic(List<Characteristic> shippingOrderCharacteristic) {
    this.shippingOrderCharacteristic = shippingOrderCharacteristic;
    return this;
  }

  public ShippingOrder addShippingOrderCharacteristicItem(Characteristic shippingOrderCharacteristicItem) {
    if (this.shippingOrderCharacteristic == null) {
      this.shippingOrderCharacteristic = new ArrayList<Characteristic>();
    }
    this.shippingOrderCharacteristic.add(shippingOrderCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics with values
   * @return shippingOrderCharacteristic
  **/
  @ApiModelProperty(value = "List of characteristics with values")

  @Valid

  public List<Characteristic> getShippingOrderCharacteristic() {
    return shippingOrderCharacteristic;
  }

  public void setShippingOrderCharacteristic(List<Characteristic> shippingOrderCharacteristic) {
    this.shippingOrderCharacteristic = shippingOrderCharacteristic;
  }

  public ShippingOrder shippingOrderItem(List<ShippingOrderItem> shippingOrderItem) {
    this.shippingOrderItem = shippingOrderItem;
    return this;
  }

  public ShippingOrder addShippingOrderItemItem(ShippingOrderItem shippingOrderItemItem) {
    if (this.shippingOrderItem == null) {
      this.shippingOrderItem = new ArrayList<ShippingOrderItem>();
    }
    this.shippingOrderItem.add(shippingOrderItemItem);
    return this;
  }

  /**
   * A list of shipping order items. Each shipping order item has a corresponding Shipment(e.g. parcel) which has one or multiple products in it
   * @return shippingOrderItem
  **/
  @ApiModelProperty(value = "A list of shipping order items. Each shipping order item has a corresponding Shipment(e.g. parcel) which has one or multiple products in it")

  @Valid

  public List<ShippingOrderItem> getShippingOrderItem() {
    return shippingOrderItem;
  }

  public void setShippingOrderItem(List<ShippingOrderItem> shippingOrderItem) {
    this.shippingOrderItem = shippingOrderItem;
  }

  public ShippingOrder shippingOrderOffering(ProductOfferingRef shippingOrderOffering) {
    this.shippingOrderOffering = shippingOrderOffering;
    return this;
  }

  /**
   * Shipping order can have a corresponding entry in the product catalog (product offering)
   * @return shippingOrderOffering
  **/
  @ApiModelProperty(value = "Shipping order can have a corresponding entry in the product catalog (product offering)")

  @Valid

  public ProductOfferingRef getShippingOrderOffering() {
    return shippingOrderOffering;
  }

  public void setShippingOrderOffering(ProductOfferingRef shippingOrderOffering) {
    this.shippingOrderOffering = shippingOrderOffering;
  }

  public ShippingOrder shippingOrderPrice(ProductPrice shippingOrderPrice) {
    this.shippingOrderPrice = shippingOrderPrice;
    return this;
  }

  /**
   * Shipping Order price
   * @return shippingOrderPrice
  **/
  @ApiModelProperty(value = "Shipping Order price")

  @Valid

  public ProductPrice getShippingOrderPrice() {
    return shippingOrderPrice;
  }

  public void setShippingOrderPrice(ProductPrice shippingOrderPrice) {
    this.shippingOrderPrice = shippingOrderPrice;
  }

  public ShippingOrder baseType(String baseType) {
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

  public ShippingOrder schemaLocation(String schemaLocation) {
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

  public ShippingOrder type(String type) {
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
    ShippingOrder shippingOrder = (ShippingOrder) o;
    return Objects.equals(this.id, shippingOrder.id) &&
        Objects.equals(this.href, shippingOrder.href) &&
        Objects.equals(this.creationDate, shippingOrder.creationDate) &&
        Objects.equals(this.lastUpdateDate, shippingOrder.lastUpdateDate) &&
        Objects.equals(this.status, shippingOrder.status) &&
        Objects.equals(this.note, shippingOrder.note) &&
        Objects.equals(this.placeFrom, shippingOrder.placeFrom) &&
        Objects.equals(this.placeTo, shippingOrder.placeTo) &&
        Objects.equals(this.productOrder, shippingOrder.productOrder) &&
        Objects.equals(this.relatedParty, shippingOrder.relatedParty) &&
        Objects.equals(this.relatedShippingOrder, shippingOrder.relatedShippingOrder) &&
        Objects.equals(this.shippingInstruction, shippingOrder.shippingInstruction) &&
        Objects.equals(this.shippingOrderCharacteristic, shippingOrder.shippingOrderCharacteristic) &&
        Objects.equals(this.shippingOrderItem, shippingOrder.shippingOrderItem) &&
        Objects.equals(this.shippingOrderOffering, shippingOrder.shippingOrderOffering) &&
        Objects.equals(this.shippingOrderPrice, shippingOrder.shippingOrderPrice) &&
        Objects.equals(this.baseType, shippingOrder.baseType) &&
        Objects.equals(this.schemaLocation, shippingOrder.schemaLocation) &&
        Objects.equals(this.type, shippingOrder.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, creationDate, lastUpdateDate, status, note, placeFrom, placeTo, productOrder, relatedParty, relatedShippingOrder, shippingInstruction, shippingOrderCharacteristic, shippingOrderItem, shippingOrderOffering, shippingOrderPrice, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    placeFrom: ").append(toIndentedString(placeFrom)).append("\n");
    sb.append("    placeTo: ").append(toIndentedString(placeTo)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    relatedShippingOrder: ").append(toIndentedString(relatedShippingOrder)).append("\n");
    sb.append("    shippingInstruction: ").append(toIndentedString(shippingInstruction)).append("\n");
    sb.append("    shippingOrderCharacteristic: ").append(toIndentedString(shippingOrderCharacteristic)).append("\n");
    sb.append("    shippingOrderItem: ").append(toIndentedString(shippingOrderItem)).append("\n");
    sb.append("    shippingOrderOffering: ").append(toIndentedString(shippingOrderOffering)).append("\n");
    sb.append("    shippingOrderPrice: ").append(toIndentedString(shippingOrderPrice)).append("\n");
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

