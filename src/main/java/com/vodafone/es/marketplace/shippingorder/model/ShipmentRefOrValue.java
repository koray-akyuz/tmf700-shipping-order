package com.vodafone.es.marketplace.shippingorder.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A shipment defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp;amp; @referredType are related to the shipment entity and not the related ShipmentRefOrValue class itself
 */
@ApiModel(description = "A shipment defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the shipment entity and not the related ShipmentRefOrValue class itself")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class ShipmentRefOrValue   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("collectionDate")
  private OffsetDateTime collectionDate = null;

  @JsonProperty("completionDate")
  private OffsetDateTime completionDate = null;

  @JsonProperty("deliveryDate")
  private OffsetDateTime deliveryDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("expectedDeliveryDate")
  private OffsetDateTime expectedDeliveryDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("requestedDeliveryDate")
  private OffsetDateTime requestedDeliveryDate = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("attachment")
  @Valid
  private List<AttachmentRefOrValue> attachment = null;

  @JsonProperty("externalIdentifier")
  @Valid
  private List<ExternalIdentifier> externalIdentifier = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("paymentMethod")
  private PaymentMethodRef paymentMethod = null;

  @JsonProperty("placeFrom")
  private RelatedPlaceRefOrValue placeFrom = null;

  @JsonProperty("placeTo")
  private RelatedPlaceRefOrValue placeTo = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyWithContactInfo> relatedParty = null;

  @JsonProperty("relatedShipment")
  @Valid
  private List<RelatedShipment> relatedShipment = null;

  @JsonProperty("shipmentCharacteristic")
  @Valid
  private List<Characteristic> shipmentCharacteristic = null;

  @JsonProperty("shipmentItem")
  @Valid
  private List<ShipmentItem> shipmentItem = null;

  @JsonProperty("shipmentPrice")
  private ProductPrice shipmentPrice = null;

  @JsonProperty("shipmentSpecification")
  private ShipmentSpecificationRefOrValue shipmentSpecification = null;

  @JsonProperty("shipmentTracking")
  private ShipmentTrackingRef shipmentTracking = null;

  @JsonProperty("shippingInstruction")
  private ShippingInstruction shippingInstruction = null;

  @JsonProperty("weight")
  private Quantity weight = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public ShipmentRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShipmentRefOrValue href(String href) {
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

  public ShipmentRefOrValue collectionDate(OffsetDateTime collectionDate) {
    this.collectionDate = collectionDate;
    return this;
  }

  /**
   * The date the package was collected from the carrier (Collection scenario)
   * @return collectionDate
  **/
  @ApiModelProperty(example = "2020-11-18T08:00:00Z", value = "The date the package was collected from the carrier (Collection scenario)")

  @Valid

  public OffsetDateTime getCollectionDate() {
    return collectionDate;
  }

  public void setCollectionDate(OffsetDateTime collectionDate) {
    this.collectionDate = collectionDate;
  }

  public ShipmentRefOrValue completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Effective delivery date amended by the provider
   * @return completionDate
  **/
  @ApiModelProperty(example = "2020-11-20T08:00:00Z", value = "Effective delivery date amended by the provider")

  @Valid

  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ShipmentRefOrValue deliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Is the date at which the shipment was completed (customer has taken ownership of the package)
   * @return deliveryDate
  **/
  @ApiModelProperty(example = "2020-11-20T08:00:00Z", value = "Is the date at which the shipment was completed (customer has taken ownership of the package)")

  @Valid

  public OffsetDateTime getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(OffsetDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public ShipmentRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the shipment. It could be the same as the description of the shipment specification.
   * @return description
  **/
  @ApiModelProperty(example = "Cartridges for Ink Ltd", value = "Description of the shipment. It could be the same as the description of the shipment specification.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShipmentRefOrValue expectedDeliveryDate(OffsetDateTime expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }

  /**
   * The date that the shipment will be delivered
   * @return expectedDeliveryDate
  **/
  @ApiModelProperty(example = "2020-11-20T08:00:00Z", value = "The date that the shipment will be delivered")

  @Valid

  public OffsetDateTime getExpectedDeliveryDate() {
    return expectedDeliveryDate;
  }

  public void setExpectedDeliveryDate(OffsetDateTime expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }

  public ShipmentRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the related entity.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipmentRefOrValue requestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

  /**
   * The date requester by the sender for shipment delivery
   * @return requestedDeliveryDate
  **/
  @ApiModelProperty(example = "2020-11-20T08:00:00Z", value = "The date requester by the sender for shipment delivery")

  @Valid

  public OffsetDateTime getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }

  public ShipmentRefOrValue state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The current status of the shipment.
   * @return state
  **/
  @ApiModelProperty(example = "labelPrinted", value = "The current status of the shipment.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ShipmentRefOrValue attachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public ShipmentRefOrValue addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Attachments that may be of relevance to this shipment, such as shippingLabels, Signature or photos of the delivery  
   * @return attachment
  **/
  @ApiModelProperty(value = "Attachments that may be of relevance to this shipment, such as shippingLabels, Signature or photos of the delivery  ")

  @Valid

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public ShipmentRefOrValue externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ShipmentRefOrValue addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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

  public ShipmentRefOrValue note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ShipmentRefOrValue addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this shipment
   * @return note
  **/
  @ApiModelProperty(value = "A list of notes made on this shipment")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ShipmentRefOrValue paymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Payment method to be used when delivering the package(e.g.: cash, credit card, ). Structure including at least attribute name. Notice that the use of a voucher can be managed as a specific methodtype, where he voucher code can be passed as value.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Payment method to be used when delivering the package(e.g.: cash, credit card, ). Structure including at least attribute name. Notice that the use of a voucher can be managed as a specific methodtype, where he voucher code can be passed as value.")

  @Valid

  public PaymentMethodRef getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public ShipmentRefOrValue placeFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
    return this;
  }

  /**
   * Source location of the package. E.g. warehouse or shop location
   * @return placeFrom
  **/
  @ApiModelProperty(value = "Source location of the package. E.g. warehouse or shop location")

  @Valid

  public RelatedPlaceRefOrValue getPlaceFrom() {
    return placeFrom;
  }

  public void setPlaceFrom(RelatedPlaceRefOrValue placeFrom) {
    this.placeFrom = placeFrom;
  }

  public ShipmentRefOrValue placeTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
    return this;
  }

  /**
   * Destination of the package. E.g. customer home address
   * @return placeTo
  **/
  @ApiModelProperty(value = "Destination of the package. E.g. customer home address")

  @Valid

  public RelatedPlaceRefOrValue getPlaceTo() {
    return placeTo;
  }

  public void setPlaceTo(RelatedPlaceRefOrValue placeTo) {
    this.placeTo = placeTo;
  }

  public ShipmentRefOrValue relatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShipmentRefOrValue addRelatedPartyItem(RelatedPartyWithContactInfo relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyWithContactInfo>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of parties which are involved in this shipment and the role they are playing
   * @return relatedParty
  **/
  @ApiModelProperty(value = "A list of parties which are involved in this shipment and the role they are playing")

  @Valid

  public List<RelatedPartyWithContactInfo> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyWithContactInfo> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ShipmentRefOrValue relatedShipment(List<RelatedShipment> relatedShipment) {
    this.relatedShipment = relatedShipment;
    return this;
  }

  public ShipmentRefOrValue addRelatedShipmentItem(RelatedShipment relatedShipmentItem) {
    if (this.relatedShipment == null) {
      this.relatedShipment = new ArrayList<RelatedShipment>();
    }
    this.relatedShipment.add(relatedShipmentItem);
    return this;
  }

  /**
   * A list of existing shipments that has some form of correlation with the given shipment
   * @return relatedShipment
  **/
  @ApiModelProperty(value = "A list of existing shipments that has some form of correlation with the given shipment")

  @Valid

  public List<RelatedShipment> getRelatedShipment() {
    return relatedShipment;
  }

  public void setRelatedShipment(List<RelatedShipment> relatedShipment) {
    this.relatedShipment = relatedShipment;
  }

  public ShipmentRefOrValue shipmentCharacteristic(List<Characteristic> shipmentCharacteristic) {
    this.shipmentCharacteristic = shipmentCharacteristic;
    return this;
  }

  public ShipmentRefOrValue addShipmentCharacteristicItem(Characteristic shipmentCharacteristicItem) {
    if (this.shipmentCharacteristic == null) {
      this.shipmentCharacteristic = new ArrayList<Characteristic>();
    }
    this.shipmentCharacteristic.add(shipmentCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics with values
   * @return shipmentCharacteristic
  **/
  @ApiModelProperty(value = "List of characteristics with values")

  @Valid

  public List<Characteristic> getShipmentCharacteristic() {
    return shipmentCharacteristic;
  }

  public void setShipmentCharacteristic(List<Characteristic> shipmentCharacteristic) {
    this.shipmentCharacteristic = shipmentCharacteristic;
  }

  public ShipmentRefOrValue shipmentItem(List<ShipmentItem> shipmentItem) {
    this.shipmentItem = shipmentItem;
    return this;
  }

  public ShipmentRefOrValue addShipmentItemItem(ShipmentItem shipmentItemItem) {
    if (this.shipmentItem == null) {
      this.shipmentItem = new ArrayList<ShipmentItem>();
    }
    this.shipmentItem.add(shipmentItemItem);
    return this;
  }

  /**
   * List of items that are part of the shipment (parcel/package)
   * @return shipmentItem
  **/
  @ApiModelProperty(value = "List of items that are part of the shipment (parcel/package)")

  @Valid

  public List<ShipmentItem> getShipmentItem() {
    return shipmentItem;
  }

  public void setShipmentItem(List<ShipmentItem> shipmentItem) {
    this.shipmentItem = shipmentItem;
  }

  public ShipmentRefOrValue shipmentPrice(ProductPrice shipmentPrice) {
    this.shipmentPrice = shipmentPrice;
    return this;
  }

  /**
   * Shipment price
   * @return shipmentPrice
  **/
  @ApiModelProperty(value = "Shipment price")

  @Valid

  public ProductPrice getShipmentPrice() {
    return shipmentPrice;
  }

  public void setShipmentPrice(ProductPrice shipmentPrice) {
    this.shipmentPrice = shipmentPrice;
  }

  public ShipmentRefOrValue shipmentSpecification(ShipmentSpecificationRefOrValue shipmentSpecification) {
    this.shipmentSpecification = shipmentSpecification;
    return this;
  }

  /**
   * A set of characteristics to describe the shipment
   * @return shipmentSpecification
  **/
  @ApiModelProperty(value = "A set of characteristics to describe the shipment")

  @Valid

  public ShipmentSpecificationRefOrValue getShipmentSpecification() {
    return shipmentSpecification;
  }

  public void setShipmentSpecification(ShipmentSpecificationRefOrValue shipmentSpecification) {
    this.shipmentSpecification = shipmentSpecification;
  }

  public ShipmentRefOrValue shipmentTracking(ShipmentTrackingRef shipmentTracking) {
    this.shipmentTracking = shipmentTracking;
    return this;
  }

  /**
   * A reference number usually provided by the delivery partner(carrier) used to identify and track shipments across the delivery network
   * @return shipmentTracking
  **/
  @ApiModelProperty(value = "A reference number usually provided by the delivery partner(carrier) used to identify and track shipments across the delivery network")

  @Valid

  public ShipmentTrackingRef getShipmentTracking() {
    return shipmentTracking;
  }

  public void setShipmentTracking(ShipmentTrackingRef shipmentTracking) {
    this.shipmentTracking = shipmentTracking;
  }

  public ShipmentRefOrValue shippingInstruction(ShippingInstruction shippingInstruction) {
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

  public ShipmentRefOrValue weight(Quantity weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of the shipping package/parcel
   * @return weight
  **/
  @ApiModelProperty(value = "Weight of the shipping package/parcel")

  @Valid

  public Quantity getWeight() {
    return weight;
  }

  public void setWeight(Quantity weight) {
    this.weight = weight;
  }

  public ShipmentRefOrValue baseType(String baseType) {
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

  public ShipmentRefOrValue schemaLocation(String schemaLocation) {
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

  public ShipmentRefOrValue type(String type) {
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

  public ShipmentRefOrValue referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentRefOrValue shipmentRefOrValue = (ShipmentRefOrValue) o;
    return Objects.equals(this.id, shipmentRefOrValue.id) &&
        Objects.equals(this.href, shipmentRefOrValue.href) &&
        Objects.equals(this.collectionDate, shipmentRefOrValue.collectionDate) &&
        Objects.equals(this.completionDate, shipmentRefOrValue.completionDate) &&
        Objects.equals(this.deliveryDate, shipmentRefOrValue.deliveryDate) &&
        Objects.equals(this.description, shipmentRefOrValue.description) &&
        Objects.equals(this.expectedDeliveryDate, shipmentRefOrValue.expectedDeliveryDate) &&
        Objects.equals(this.name, shipmentRefOrValue.name) &&
        Objects.equals(this.requestedDeliveryDate, shipmentRefOrValue.requestedDeliveryDate) &&
        Objects.equals(this.state, shipmentRefOrValue.state) &&
        Objects.equals(this.attachment, shipmentRefOrValue.attachment) &&
        Objects.equals(this.externalIdentifier, shipmentRefOrValue.externalIdentifier) &&
        Objects.equals(this.note, shipmentRefOrValue.note) &&
        Objects.equals(this.paymentMethod, shipmentRefOrValue.paymentMethod) &&
        Objects.equals(this.placeFrom, shipmentRefOrValue.placeFrom) &&
        Objects.equals(this.placeTo, shipmentRefOrValue.placeTo) &&
        Objects.equals(this.relatedParty, shipmentRefOrValue.relatedParty) &&
        Objects.equals(this.relatedShipment, shipmentRefOrValue.relatedShipment) &&
        Objects.equals(this.shipmentCharacteristic, shipmentRefOrValue.shipmentCharacteristic) &&
        Objects.equals(this.shipmentItem, shipmentRefOrValue.shipmentItem) &&
        Objects.equals(this.shipmentPrice, shipmentRefOrValue.shipmentPrice) &&
        Objects.equals(this.shipmentSpecification, shipmentRefOrValue.shipmentSpecification) &&
        Objects.equals(this.shipmentTracking, shipmentRefOrValue.shipmentTracking) &&
        Objects.equals(this.shippingInstruction, shipmentRefOrValue.shippingInstruction) &&
        Objects.equals(this.weight, shipmentRefOrValue.weight) &&
        Objects.equals(this.baseType, shipmentRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, shipmentRefOrValue.schemaLocation) &&
        Objects.equals(this.type, shipmentRefOrValue.type) &&
        Objects.equals(this.referredType, shipmentRefOrValue.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, collectionDate, completionDate, deliveryDate, description, expectedDeliveryDate, name, requestedDeliveryDate, state, attachment, externalIdentifier, note, paymentMethod, placeFrom, placeTo, relatedParty, relatedShipment, shipmentCharacteristic, shipmentItem, shipmentPrice, shipmentSpecification, shipmentTracking, shippingInstruction, weight, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    collectionDate: ").append(toIndentedString(collectionDate)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    placeFrom: ").append(toIndentedString(placeFrom)).append("\n");
    sb.append("    placeTo: ").append(toIndentedString(placeTo)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    relatedShipment: ").append(toIndentedString(relatedShipment)).append("\n");
    sb.append("    shipmentCharacteristic: ").append(toIndentedString(shipmentCharacteristic)).append("\n");
    sb.append("    shipmentItem: ").append(toIndentedString(shipmentItem)).append("\n");
    sb.append("    shipmentPrice: ").append(toIndentedString(shipmentPrice)).append("\n");
    sb.append("    shipmentSpecification: ").append(toIndentedString(shipmentSpecification)).append("\n");
    sb.append("    shipmentTracking: ").append(toIndentedString(shipmentTracking)).append("\n");
    sb.append("    shippingInstruction: ").append(toIndentedString(shippingInstruction)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

