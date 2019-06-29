package com.zmsj.magina.model.mine;

import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class EnumDataDto {

  private String key;
  private String value;

  public EnumDataDto(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public EnumDataDto() {
  }
}
