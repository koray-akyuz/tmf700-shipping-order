package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Instructions and details for the carrier
 */
@ApiModel(description = "Instructions and details for the carrier")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class ShippingInstruction   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("carrierId")
  private String carrierId = null;

  @JsonProperty("carrierName")
  private String carrierName = null;

  @JsonProperty("carrierServiceCode")
  private String carrierServiceCode = null;

  @JsonProperty("deliveryAttempts")
  private Integer deliveryAttempts = null;

  @JsonProperty("deliverySpeed")
  private String deliverySpeed = null;

  @JsonProperty("labelMessage")
  private String labelMessage = null;

  @JsonProperty("packageType")
  private String packageType = null;

  @JsonProperty("receiptConfirmation")
  private String receiptConfirmation = null;

  @JsonProperty("shippingType")
  private String shippingType = null;

  @JsonProperty("signatureRequired")
  private Boolean signatureRequired = null;

  @JsonProperty("warehouseId")
  private String warehouseId = null;

  @JsonProperty("deliveryTimeSlot")
  private TimePeriod deliveryTimeSlot = null;

  @JsonProperty("instructionCharacteristic")
  @Valid
  private List<Characteristic> instructionCharacteristic = null;

  @JsonProperty("insuredValue")
  private Money insuredValue = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("signatureRequiredBy")
  private SignatureRequiredByType signatureRequiredBy = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ShippingInstruction id(String id) {
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

  public ShippingInstruction href(String href) {
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

  public ShippingInstruction carrierId(String carrierId) {
    this.carrierId = carrierId;
    return this;
  }

  /**
   * The carrier identifier
   * @return carrierId
  **/
  @ApiModelProperty(example = "1010123", value = "The carrier identifier")


  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }

  public ShippingInstruction carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * The carrier name
   * @return carrierName
  **/
  @ApiModelProperty(example = "On Time Deliveries Ltd", value = "The carrier name")


  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public ShippingInstruction carrierServiceCode(String carrierServiceCode) {
    this.carrierServiceCode = carrierServiceCode;
    return this;
  }

  /**
   * The service code used by the carrier to ship the package, royal mail ground, royal mail first class, etc
   * @return carrierServiceCode
  **/
  @ApiModelProperty(example = "XH545554533GB", value = "The service code used by the carrier to ship the package, royal mail ground, royal mail first class, etc")


  public String getCarrierServiceCode() {
    return carrierServiceCode;
  }

  public void setCarrierServiceCode(String carrierServiceCode) {
    this.carrierServiceCode = carrierServiceCode;
  }

  public ShippingInstruction deliveryAttempts(Integer deliveryAttempts) {
    this.deliveryAttempts = deliveryAttempts;
    return this;
  }

  /**
   * Shipping delivery attempts that should be performed
   * @return deliveryAttempts
  **/
  @ApiModelProperty(example = "3", value = "Shipping delivery attempts that should be performed")


  public Integer getDeliveryAttempts() {
    return deliveryAttempts;
  }

  public void setDeliveryAttempts(Integer deliveryAttempts) {
    this.deliveryAttempts = deliveryAttempts;
  }

  public ShippingInstruction deliverySpeed(String deliverySpeed) {
    this.deliverySpeed = deliverySpeed;
    return this;
  }

  /**
   * Shipping delivery speed, same day, next day, next business day, etc
   * @return deliverySpeed
  **/
  @ApiModelProperty(example = "SameDay", value = "Shipping delivery speed, same day, next day, next business day, etc")


  public String getDeliverySpeed() {
    return deliverySpeed;
  }

  public void setDeliverySpeed(String deliverySpeed) {
    this.deliverySpeed = deliverySpeed;
  }

  public ShippingInstruction labelMessage(String labelMessage) {
    this.labelMessage = labelMessage;
    return this;
  }

  /**
   * Shipping delivery message label
   * @return labelMessage
  **/
  @ApiModelProperty(example = "FAO Ink Industries", value = "Shipping delivery message label")


  public String getLabelMessage() {
    return labelMessage;
  }

  public void setLabelMessage(String labelMessage) {
    this.labelMessage = labelMessage;
  }

  public ShippingInstruction packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * The type of packaging
   * @return packageType
  **/
  @ApiModelProperty(example = "Bottle, gas", value = "The type of packaging")


  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public ShippingInstruction receiptConfirmation(String receiptConfirmation) {
    this.receiptConfirmation = receiptConfirmation;
    return this;
  }

  /**
   * Delivery confirmation required for the shipment (none, signature, over18Signature)
   * @return receiptConfirmation
  **/
  @ApiModelProperty(example = "signature", value = "Delivery confirmation required for the shipment (none, signature, over18Signature)")


  public String getReceiptConfirmation() {
    return receiptConfirmation;
  }

  public void setReceiptConfirmation(String receiptConfirmation) {
    this.receiptConfirmation = receiptConfirmation;
  }

  public ShippingInstruction shippingType(String shippingType) {
    this.shippingType = shippingType;
    return this;
  }

  /**
   * The shipping type, e.g. thick_envelope, small_flat_rate_box, large_package, etc.
   * @return shippingType
  **/
  @ApiModelProperty(example = "large_package", value = "The shipping type, e.g. thick_envelope, small_flat_rate_box, large_package, etc.")


  public String getShippingType() {
    return shippingType;
  }

  public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
  }

  public ShippingInstruction signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

  /**
   * Get signatureRequired
   * @return signatureRequired
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

  public ShippingInstruction warehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * The identification of the warehouse that the shipment is being shipped from.
   * @return warehouseId
  **/
  @ApiModelProperty(example = "wh12345", value = "The identification of the warehouse that the shipment is being shipped from.")


  public String getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
  }

  public ShippingInstruction deliveryTimeSlot(TimePeriod deliveryTimeSlot) {
    this.deliveryTimeSlot = deliveryTimeSlot;
    return this;
  }

  /**
   * Shipping delivery time slot
   * @return deliveryTimeSlot
  **/
  @ApiModelProperty(value = "Shipping delivery time slot")

  @Valid

  public TimePeriod getDeliveryTimeSlot() {
    return deliveryTimeSlot;
  }

  public void setDeliveryTimeSlot(TimePeriod deliveryTimeSlot) {
    this.deliveryTimeSlot = deliveryTimeSlot;
  }

  public ShippingInstruction instructionCharacteristic(List<Characteristic> instructionCharacteristic) {
    this.instructionCharacteristic = instructionCharacteristic;
    return this;
  }

  public ShippingInstruction addInstructionCharacteristicItem(Characteristic instructionCharacteristicItem) {
    if (this.instructionCharacteristic == null) {
      this.instructionCharacteristic = new ArrayList<Characteristic>();
    }
    this.instructionCharacteristic.add(instructionCharacteristicItem);
    return this;
  }

  /**
   * Additional shipping characteristics that maybe specific to one or another carrier
   * @return instructionCharacteristic
  **/
  @ApiModelProperty(value = "Additional shipping characteristics that maybe specific to one or another carrier")

  @Valid

  public List<Characteristic> getInstructionCharacteristic() {
    return instructionCharacteristic;
  }

  public void setInstructionCharacteristic(List<Characteristic> instructionCharacteristic) {
    this.instructionCharacteristic = instructionCharacteristic;
  }

  public ShippingInstruction insuredValue(Money insuredValue) {
    this.insuredValue = insuredValue;
    return this;
  }

  /**
   * Shipping delivery value
   * @return insuredValue
  **/
  @ApiModelProperty(value = "Shipping delivery value")

  @Valid

  public Money getInsuredValue() {
    return insuredValue;
  }

  public void setInsuredValue(Money insuredValue) {
    this.insuredValue = insuredValue;
  }

  public ShippingInstruction note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ShippingInstruction addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this shipment item
   * @return note
  **/
  @ApiModelProperty(value = "A list of notes made on this shipment item")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ShippingInstruction signatureRequiredBy(SignatureRequiredByType signatureRequiredBy) {
    this.signatureRequiredBy = signatureRequiredBy;
    return this;
  }

  /**
   * Get signatureRequiredBy
   * @return signatureRequiredBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SignatureRequiredByType getSignatureRequiredBy() {
    return signatureRequiredBy;
  }

  public void setSignatureRequiredBy(SignatureRequiredByType signatureRequiredBy) {
    this.signatureRequiredBy = signatureRequiredBy;
  }

  public ShippingInstruction baseType(String baseType) {
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

  public ShippingInstruction schemaLocation(String schemaLocation) {
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

  public ShippingInstruction type(String type) {
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
    ShippingInstruction shippingInstruction = (ShippingInstruction) o;
    return Objects.equals(this.id, shippingInstruction.id) &&
        Objects.equals(this.href, shippingInstruction.href) &&
        Objects.equals(this.carrierId, shippingInstruction.carrierId) &&
        Objects.equals(this.carrierName, shippingInstruction.carrierName) &&
        Objects.equals(this.carrierServiceCode, shippingInstruction.carrierServiceCode) &&
        Objects.equals(this.deliveryAttempts, shippingInstruction.deliveryAttempts) &&
        Objects.equals(this.deliverySpeed, shippingInstruction.deliverySpeed) &&
        Objects.equals(this.labelMessage, shippingInstruction.labelMessage) &&
        Objects.equals(this.packageType, shippingInstruction.packageType) &&
        Objects.equals(this.receiptConfirmation, shippingInstruction.receiptConfirmation) &&
        Objects.equals(this.shippingType, shippingInstruction.shippingType) &&
        Objects.equals(this.signatureRequired, shippingInstruction.signatureRequired) &&
        Objects.equals(this.warehouseId, shippingInstruction.warehouseId) &&
        Objects.equals(this.deliveryTimeSlot, shippingInstruction.deliveryTimeSlot) &&
        Objects.equals(this.instructionCharacteristic, shippingInstruction.instructionCharacteristic) &&
        Objects.equals(this.insuredValue, shippingInstruction.insuredValue) &&
        Objects.equals(this.note, shippingInstruction.note) &&
        Objects.equals(this.signatureRequiredBy, shippingInstruction.signatureRequiredBy) &&
        Objects.equals(this.baseType, shippingInstruction.baseType) &&
        Objects.equals(this.schemaLocation, shippingInstruction.schemaLocation) &&
        Objects.equals(this.type, shippingInstruction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, carrierId, carrierName, carrierServiceCode, deliveryAttempts, deliverySpeed, labelMessage, packageType, receiptConfirmation, shippingType, signatureRequired, warehouseId, deliveryTimeSlot, instructionCharacteristic, insuredValue, note, signatureRequiredBy, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInstruction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    carrierServiceCode: ").append(toIndentedString(carrierServiceCode)).append("\n");
    sb.append("    deliveryAttempts: ").append(toIndentedString(deliveryAttempts)).append("\n");
    sb.append("    deliverySpeed: ").append(toIndentedString(deliverySpeed)).append("\n");
    sb.append("    labelMessage: ").append(toIndentedString(labelMessage)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    receiptConfirmation: ").append(toIndentedString(receiptConfirmation)).append("\n");
    sb.append("    shippingType: ").append(toIndentedString(shippingType)).append("\n");
    sb.append("    signatureRequired: ").append(toIndentedString(signatureRequired)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    deliveryTimeSlot: ").append(toIndentedString(deliveryTimeSlot)).append("\n");
    sb.append("    instructionCharacteristic: ").append(toIndentedString(instructionCharacteristic)).append("\n");
    sb.append("    insuredValue: ").append(toIndentedString(insuredValue)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    signatureRequiredBy: ").append(toIndentedString(signatureRequiredBy)).append("\n");
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

