package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

@Data
public class BArea {

  private Integer id;

  private String name;

  private String code;

  private String chargeName;

  private String chargeContact;

  private Date createTime;

  private Integer createUser;

  private Date updateTime;

  private Integer updateUser;

  private Double longitude;

  private Double latitude;
}