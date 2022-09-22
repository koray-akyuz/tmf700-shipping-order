package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * BillingAccount reference. A BillingAccount is a detailed description of a bill structure.
 */
@ApiModel(description = "BillingAccount reference. A BillingAccount is a detailed description of a bill structure.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class BillingAccountRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ratingType")
  private String ratingType = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public BillingAccountRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the billing account
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the billing account")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingAccountRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the billing account
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the billing account")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BillingAccountRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the billing account
   * @return name
  **/
  @ApiModelProperty(value = "Name of the billing account")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingAccountRef ratingType(String ratingType) {
    this.ratingType = ratingType;
    return this;
  }

  /**
   * Indicates whether the account follows a specific payment option such as prepaid or postpaid
   * @return ratingType
  **/
  @ApiModelProperty(value = "Indicates whether the account follows a specific payment option such as prepaid or postpaid")


  public String getRatingType() {
    return ratingType;
  }

  public void setRatingType(String ratingType) {
    this.ratingType = ratingType;
  }

  public BillingAccountRef baseType(String baseType) {
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

  public BillingAccountRef schemaLocation(String schemaLocation) {
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

  public BillingAccountRef type(String type) {
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

  public BillingAccountRef referredType(String referredType) {
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
    BillingAccountRef billingAccountRef = (BillingAccountRef) o;
    return Objects.equals(this.id, billingAccountRef.id) &&
        Objects.equals(this.href, billingAccountRef.href) &&
        Objects.equals(this.name, billingAccountRef.name) &&
        Objects.equals(this.ratingType, billingAccountRef.ratingType) &&
        Objects.equals(this.baseType, billingAccountRef.baseType) &&
        Objects.equals(this.schemaLocation, billingAccountRef.schemaLocation) &&
        Objects.equals(this.type, billingAccountRef.type) &&
        Objects.equals(this.referredType, billingAccountRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, ratingType, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccountRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratingType: ").append(toIndentedString(ratingType)).append("\n");
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

