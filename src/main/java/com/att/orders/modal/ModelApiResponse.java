package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * ModelApiResponse
 */
@Data
public class ModelApiResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

}
