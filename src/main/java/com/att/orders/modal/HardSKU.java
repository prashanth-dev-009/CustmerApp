package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * extends the base model sku for the type: hardgood.
 */
@Data
public class HardSKU extends SKU  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("manufacturer")
  private String manufacturer = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("size")
  private String size = null;

  public HardSKU id(String id) {
    this.id = id;
    return this;
  }

 
}
