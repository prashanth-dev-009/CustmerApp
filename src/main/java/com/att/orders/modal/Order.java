package com.att.orders.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Order
 */
@Data
public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("customerId")
  private Integer customerId = null;
  
  private String status;

  @JsonProperty("items")
  private List<Item> items = null;
  public boolean complete;
  public Address shipingAddress;
  public List<Shipment> shipments;

}
