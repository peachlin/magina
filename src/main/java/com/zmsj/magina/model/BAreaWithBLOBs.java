package com.zmsj.magina.model;

import lombok.Data;

@Data
public class BAreaWithBLOBs extends BArea {

  private String remark;

  private String latLng;
}