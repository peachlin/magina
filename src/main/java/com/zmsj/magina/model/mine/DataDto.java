package com.zmsj.magina.model.mine;

import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class DataDto {

  private String key;
  private Double value;

  public DataDto(String key, Double value) {
    this.key = key;
    this.value = value;
  }

  public DataDto() {
  }
}
