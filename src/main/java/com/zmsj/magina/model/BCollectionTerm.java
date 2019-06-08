package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class BCollectionTerm {

  private Integer id;

  private String name;

  private String unit;

  private String minValue;

  private String maxValue;

  private String variableName;

  private Integer monitorDeviceId;

  private Date createTime;

  private Integer createUser;

  private Date updateTime;

  private Integer updateUser;

  private String remark;
}