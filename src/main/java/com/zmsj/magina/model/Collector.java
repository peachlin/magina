package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("采集器")
public class Collector {

  private String id;

  private String alias;

  private String stationId;

  private String name;

  private String model;

  private String location;

  private String status;

  private String chargeName;

  private String chargeTel;

  private String remark;

  private Date modifyTime;
}