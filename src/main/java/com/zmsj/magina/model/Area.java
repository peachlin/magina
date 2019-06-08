package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("区域")
public class Area {

  private String id;

  private String alias;

  private String name;

  private String chargeName;

  private String chargeTel;

  private String remark;

  private Date modifyTime;
}