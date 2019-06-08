package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("区域")
public class BArea {

  @ApiModelProperty("区域ID")
  private Integer id;

  @ApiModelProperty("区域名称")
  private String name;

  @ApiModelProperty("区域编码")
  private String code;

  @ApiModelProperty("区域负责人姓名")
  private String chargeName;

  @ApiModelProperty("区域负责人联系方式")
  private String chargeContact;

  @ApiModelProperty("创建时间")
  private Date createTime;

  @ApiModelProperty("创建人")
  private Integer createUser;

  @ApiModelProperty("更新时间")
  private Date updateTime;

  @ApiModelProperty("更新人")
  private Integer updateUser;

  @ApiModelProperty("备注")
  private String remark;

  @ApiModelProperty("经纬度信息")
  private String latLng;
}