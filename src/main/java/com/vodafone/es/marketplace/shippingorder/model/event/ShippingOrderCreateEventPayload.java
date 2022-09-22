package com.vodafone.es.marketplace.shippingorder.model.event;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-14T05:35:44.317Z")

@Data
public class ShippingOrderCreateEventPayload   {
  @JsonProperty("shippingOrder")
  private ShippingOrder shippingOrder = null;

}

