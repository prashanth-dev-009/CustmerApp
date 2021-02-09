package com.att.orders.modal;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Item
 */
@Data
public class Item   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("skuId")
  private String skuId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;
  
  private String status;
  private boolean complete;
  private DateRange estimatedShipDateRange;
  private DateRange newEstimatedShipDateRange;
  private boolean userAcceptedDelay;
  private Date delayAcceptedDate;

 }
