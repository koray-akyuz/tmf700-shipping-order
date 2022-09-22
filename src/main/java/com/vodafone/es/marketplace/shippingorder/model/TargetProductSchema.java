package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The reference object to the schema and type of target product which is described by product specification
 */
@ApiModel(description = "The reference object to the schema and type of target product which is described by product specification")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class TargetProductSchema   {
  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TargetProductSchema schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * This field provides a link to the schema describing the target product
   * @return schemaLocation
  **/
  @ApiModelProperty(required = true, value = "This field provides a link to the schema describing the target product")
  @NotNull


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TargetProductSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Class type of the target product
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Class type of the target product")
  @NotNull


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
    TargetProductSchema targetProductSchema = (TargetProductSchema) o;
    return Objects.equals(this.schemaLocation, targetProductSchema.schemaLocation) &&
        Objects.equals(this.type, targetProductSchema.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetProductSchema {\n");
    
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

