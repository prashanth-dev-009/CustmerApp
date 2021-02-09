package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Date range with from &amp; to dates. This object is used for promissed ship date range to the customer. Original Ship date promised to customer It can change based on stock availability. We need to inform customer if it changes.
 */
@Data
public class DateRange   {
  @JsonProperty("fromDate")
  private String fromDate = null;

  @JsonProperty("toDate")
  private String toDate = null;

}
