package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("采集数据")
public class MetricData {

  private String collectorId;

  private String metricId;

  private Double value;

  private Date collectTime;
}