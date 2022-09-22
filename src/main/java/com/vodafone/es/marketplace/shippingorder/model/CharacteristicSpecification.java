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
 * This class defines a characteristic specification.
 */
@ApiModel(description = "This class defines a characteristic specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")


public class CharacteristicSpecification   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("configurable")
  private Boolean configurable = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extensible")
  private Boolean extensible = null;

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality = null;

  @JsonProperty("minCardinality")
  private Integer minCardinality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("charSpecRelationship")
  @Valid
  private List<CharacteristicSpecificationRelationship> charSpecRelationship = null;

  @JsonProperty("characteristicValueSpecification")
  @Valid
  private List<CharacteristicValueSpecification> characteristicValueSpecification = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@valueSchemaLocation")
  private String valueSchemaLocation = null;

  public CharacteristicSpecification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID for the characteristic")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CharacteristicSpecification configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   * @return configurable
  **/
  @ApiModelProperty(value = "If true, the Boolean indicates that the target Characteristic is configurable")


  public Boolean isConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public CharacteristicSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains the CharacteristicSpecification.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CharacteristicSpecification extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   * @return extensible
  **/
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.")


  public Boolean isExtensible() {
    return extensible;
  }

  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  public CharacteristicSpecification isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * Specifies if the value of this characteristic is unique across all entities instantiated from the specification that uses this characteristc. For example, consider a ProductSpecification for a set-top box, with a CharacteristicSpecification cardID. Each set-top box must have a different value for cardID, so this isUnique attribute would be set to true for the characteristic.
   * @return isUnique
  **/
  @ApiModelProperty(value = "Specifies if the value of this characteristic is unique across all entities instantiated from the specification that uses this characteristc. For example, consider a ProductSpecification for a set-top box, with a CharacteristicSpecification cardID. Each set-top box must have a different value for cardID, so this isUnique attribute would be set to true for the characteristic.")


  public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public CharacteristicSpecification maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   * @return maxCardinality
  **/
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.")


  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public CharacteristicSpecification minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   * @return minCardinality
  **/
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.")


  public Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public CharacteristicSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   * @return name
  **/
  @ApiModelProperty(value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacteristicSpecification regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   * @return regex
  **/
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value.")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public CharacteristicSpecification valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
  **/
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicSpecification charSpecRelationship(List<CharacteristicSpecificationRelationship> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
    return this;
  }

  public CharacteristicSpecification addCharSpecRelationshipItem(CharacteristicSpecificationRelationship charSpecRelationshipItem) {
    if (this.charSpecRelationship == null) {
      this.charSpecRelationship = new ArrayList<CharacteristicSpecificationRelationship>();
    }
    this.charSpecRelationship.add(charSpecRelationshipItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   * @return charSpecRelationship
  **/
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.")

  @Valid

  public List<CharacteristicSpecificationRelationship> getCharSpecRelationship() {
    return charSpecRelationship;
  }

  public void setCharSpecRelationship(List<CharacteristicSpecificationRelationship> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
  }

  public CharacteristicSpecification characteristicValueSpecification(List<CharacteristicValueSpecification> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
    return this;
  }

  public CharacteristicSpecification addCharacteristicValueSpecificationItem(CharacteristicValueSpecification characteristicValueSpecificationItem) {
    if (this.characteristicValueSpecification == null) {
      this.characteristicValueSpecification = new ArrayList<CharacteristicValueSpecification>();
    }
    this.characteristicValueSpecification.add(characteristicValueSpecificationItem);
    return this;
  }

  /**
   * A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.
   * @return characteristicValueSpecification
  **/
  @ApiModelProperty(value = "A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.")

  @Valid

  public List<CharacteristicValueSpecification> getCharacteristicValueSpecification() {
    return characteristicValueSpecification;
  }

  public void setCharacteristicValueSpecification(List<CharacteristicValueSpecification> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
  }

  public CharacteristicSpecification validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which a characteristic is applicable.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which a characteristic is applicable.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public CharacteristicSpecification baseType(String baseType) {
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

  public CharacteristicSpecification schemaLocation(String schemaLocation) {
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

  public CharacteristicSpecification type(String type) {
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

  public CharacteristicSpecification valueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
    return this;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   * @return valueSchemaLocation
  **/
  @ApiModelProperty(value = "This (optional) field provides a link to the schema describing the value type.")


  public String getValueSchemaLocation() {
    return valueSchemaLocation;
  }

  public void setValueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicSpecification characteristicSpecification = (CharacteristicSpecification) o;
    return Objects.equals(this.id, characteristicSpecification.id) &&
        Objects.equals(this.configurable, characteristicSpecification.configurable) &&
        Objects.equals(this.description, characteristicSpecification.description) &&
        Objects.equals(this.extensible, characteristicSpecification.extensible) &&
        Objects.equals(this.isUnique, characteristicSpecification.isUnique) &&
        Objects.equals(this.maxCardinality, characteristicSpecification.maxCardinality) &&
        Objects.equals(this.minCardinality, characteristicSpecification.minCardinality) &&
        Objects.equals(this.name, characteristicSpecification.name) &&
        Objects.equals(this.regex, characteristicSpecification.regex) &&
        Objects.equals(this.valueType, characteristicSpecification.valueType) &&
        Objects.equals(this.charSpecRelationship, characteristicSpecification.charSpecRelationship) &&
        Objects.equals(this.characteristicValueSpecification, characteristicSpecification.characteristicValueSpecification) &&
        Objects.equals(this.validFor, characteristicSpecification.validFor) &&
        Objects.equals(this.baseType, characteristicSpecification.baseType) &&
        Objects.equals(this.schemaLocation, characteristicSpecification.schemaLocation) &&
        Objects.equals(this.type, characteristicSpecification.type) &&
        Objects.equals(this.valueSchemaLocation, characteristicSpecification.valueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, charSpecRelationship, characteristicValueSpecification, validFor, baseType, schemaLocation, type, valueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    charSpecRelationship: ").append(toIndentedString(charSpecRelationship)).append("\n");
    sb.append("    characteristicValueSpecification: ").append(toIndentedString(characteristicValueSpecification)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueSchemaLocation: ").append(toIndentedString(valueSchemaLocation)).append("\n");
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

