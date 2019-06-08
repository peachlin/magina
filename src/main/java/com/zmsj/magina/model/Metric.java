package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("采集指标")
public class Metric {

  private String id;

  private String type;

  private String zhName;

  private String enName;

  private String unit;

  private String collectorModel;

  private String remark;

  private Date modifyTime;
}