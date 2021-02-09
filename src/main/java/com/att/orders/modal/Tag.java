package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Tag
 */
@Data
public class Tag   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;



  
}
