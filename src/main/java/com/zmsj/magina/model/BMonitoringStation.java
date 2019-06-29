package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

@Data
public class BMonitoringStation {

  private Integer id;

  private String name;

  private Double longitude;

  private Double latitude;

  private Integer areaId;

  private String chargeName;

  private String chargeContact;

  private String status;

  private String picturePath;

  private Date createTime;

  private Integer createUser;

  private Date updateTime;

  private Integer updateUser;

  private String remark;
}