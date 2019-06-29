package com.zmsj.magina.model.mine;

import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class MetricData {

  private String type;
  private Double value;
  private String unit;
  private Integer elevation;
  private String createTime;
}
