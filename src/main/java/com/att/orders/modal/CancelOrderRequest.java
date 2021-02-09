package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Body1
 */

@Data
public class CancelOrderRequest   {
  @JsonProperty("cancelReason")
  private String cancelReason = null;

  @JsonProperty("cancelDate")
  private String cancelDate = null;

  }
