package com.att.orders.modal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;

/**
 * Base model for the SKU, it contains the type of sku and name.It is extended by HardSKU for hardgood sku type.
 */
@Data
public class SKU   {
  @JsonProperty("id")
  private String id = null;

  /**
   * type of sku
   */
  public enum TypeEnum {
    HARDGOOD("hardgood"),
    
    PLAN("plan");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  public SKU id(String id) {
    this.id = id;
    return this;
  }

 
}
