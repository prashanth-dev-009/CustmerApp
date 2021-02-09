package com.att.orders.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Shipment
 */
@Data
public class Shipment   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("items")
  private List<Long> items = null;

  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("trackingNumber")
  private String trackingNumber = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("estimatedDeliveryDate")
  private String estimatedDeliveryDate = null;

  @JsonProperty("shipDate")
  private String shipDate = null;

  public Shipment id(Long id) {
    this.id = id;
    return this;
  }

 
}
