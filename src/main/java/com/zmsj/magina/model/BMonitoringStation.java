package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("监测站")
public class BMonitoringStation {

  @ApiModelProperty("监测站ID")
  private Integer id;

  @ApiModelProperty("监测站名称")
  private String name;

  @ApiModelProperty("监测站经度")
  private Double longitude;

  @ApiModelProperty("监测站纬度")
  private Double latitude;

  @ApiModelProperty("监测站所属区域ID")
  private Integer areaId;

  @ApiModelProperty("监测站负责人名称")
  private String chargeName;

  @ApiModelProperty("监测站负责人联系方式")
  private String chargeContact;

  @ApiModelProperty("监测站状态")
  private String status;

  @ApiModelProperty("监测站图片路径")
  private String picturePath;

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
}