package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 */
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class Price   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("percentage")
  private Float percentage = null;

  @JsonProperty("taxRate")
  private Float taxRate = null;

  @JsonProperty("dutyFreeAmount")
  private Money dutyFreeAmount = null;

  @JsonProperty("taxIncludedAmount")
  private Money taxIncludedAmount = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public Price id(String id) {
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

  public Price href(String href) {
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

  public Price percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage to apply for ProdOfferPriceAlteration
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage to apply for ProdOfferPriceAlteration")


  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public Price taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Tax rate
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax rate")


  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public Price dutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

  /**
   * All taxes excluded amount (expressed in the given currency)
   * @return dutyFreeAmount
  **/
  @ApiModelProperty(value = "All taxes excluded amount (expressed in the given currency)")

  @Valid

  public Money getDutyFreeAmount() {
    return dutyFreeAmount;
  }

  public void setDutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  public Price taxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  /**
   * All taxes included amount (expressed in the given currency)
   * @return taxIncludedAmount
  **/
  @ApiModelProperty(value = "All taxes included amount (expressed in the given currency)")

  @Valid

  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  public Price baseType(String baseType) {
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

  public Price schemaLocation(String schemaLocation) {
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

  public Price type(String type) {
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
    Price price = (Price) o;
    return Objects.equals(this.id, price.id) &&
        Objects.equals(this.href, price.href) &&
        Objects.equals(this.percentage, price.percentage) &&
        Objects.equals(this.taxRate, price.taxRate) &&
        Objects.equals(this.dutyFreeAmount, price.dutyFreeAmount) &&
        Objects.equals(this.taxIncludedAmount, price.taxIncludedAmount) &&
        Objects.equals(this.baseType, price.baseType) &&
        Objects.equals(this.schemaLocation, price.schemaLocation) &&
        Objects.equals(this.type, price.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, percentage, taxRate, dutyFreeAmount, taxIncludedAmount, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
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

