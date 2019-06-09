package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("监测站")
public class Station {

  private String id;

  private String alias;

  private String name;

  private Double longitude;

  private Double latitude;

  private Integer elevation;

  private String areaId;

  private String status;

  private String location;

  private String chargeName;

  private String chargeTel;

  private String remark;

  private Date modifyTime;
}