package com.vodafone.es.marketplace.shippingorder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A migration, substitution, dependency or exclusivity relationship between/among entity specifications.
 */
@ApiModel(description = "A migration, substitution, dependency or exclusivity relationship between/among entity specifications.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class ShipmentSpecificationRelationship   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("associationSpec")
  private AssociationSpecificationRef associationSpec = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ShipmentSpecificationRelationship id(String id) {
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

  public ShipmentSpecificationRelationship href(String href) {
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

  public ShipmentSpecificationRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name given to the target entity specification instance
   * @return name
  **/
  @ApiModelProperty(value = "The name given to the target entity specification instance")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipmentSpecificationRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as migration, substitution, dependency, exclusivity
   * @return relationshipType
  **/
  @ApiModelProperty(required = true, value = "Type of relationship such as migration, substitution, dependency, exclusivity")
  @NotNull


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ShipmentSpecificationRelationship role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this entity specification
   * @return role
  **/
  @ApiModelProperty(value = "The association role for this entity specification")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ShipmentSpecificationRelationship associationSpec(AssociationSpecificationRef associationSpec) {
    this.associationSpec = associationSpec;
    return this;
  }

  /**
   * A specification for an association used by this relationship  
   * @return associationSpec
  **/
  @ApiModelProperty(value = "A specification for an association used by this relationship  ")

  @Valid

  public AssociationSpecificationRef getAssociationSpec() {
    return associationSpec;
  }

  public void setAssociationSpec(AssociationSpecificationRef associationSpec) {
    this.associationSpec = associationSpec;
  }

  public ShipmentSpecificationRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this REST resource is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this REST resource is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ShipmentSpecificationRelationship baseType(String baseType) {
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

  public ShipmentSpecificationRelationship schemaLocation(String schemaLocation) {
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

  public ShipmentSpecificationRelationship type(String type) {
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
    ShipmentSpecificationRelationship shipmentSpecificationRelationship = (ShipmentSpecificationRelationship) o;
    return Objects.equals(this.id, shipmentSpecificationRelationship.id) &&
        Objects.equals(this.href, shipmentSpecificationRelationship.href) &&
        Objects.equals(this.name, shipmentSpecificationRelationship.name) &&
        Objects.equals(this.relationshipType, shipmentSpecificationRelationship.relationshipType) &&
        Objects.equals(this.role, shipmentSpecificationRelationship.role) &&
        Objects.equals(this.associationSpec, shipmentSpecificationRelationship.associationSpec) &&
        Objects.equals(this.validFor, shipmentSpecificationRelationship.validFor) &&
        Objects.equals(this.baseType, shipmentSpecificationRelationship.baseType) &&
        Objects.equals(this.schemaLocation, shipmentSpecificationRelationship.schemaLocation) &&
        Objects.equals(this.type, shipmentSpecificationRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, relationshipType, role, associationSpec, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentSpecificationRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    associationSpec: ").append(toIndentedString(associationSpec)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

