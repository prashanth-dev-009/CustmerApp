package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Body
 */
@Data
public class ShipDateRequest   {
  @JsonProperty("estimatedShipDateRange")
  private DateRange estimatedShipDateRange = null;

  @JsonProperty("newEstimatedShipDateRange")
  private DateRange newEstimatedShipDateRange = null;

  @JsonProperty("delayAcceptedDate")
  private String delayAcceptedDate = null;

  
}
