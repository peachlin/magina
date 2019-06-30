package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@Data
@ApiModel("采集器")
public class BMonitorDevice {


  @ApiModelProperty("ID/编号")
  private Integer id;

  @ApiModelProperty("采集器名称")
  private String deviceName;

  @ApiModelProperty("状态")
  private String status;

  @ApiModelProperty("所属区域")
  private String areaName;

  @ApiModelProperty("所属监测站")
  private String stationName;

  @ApiModelProperty("地址")
  private String location;

  /********************************************/

  private String deviceCode;

  private Integer monitoringStationId;

  private Double longitude;

  private Double latitude;

  private String manufacturer;

  private String manufacturerChargeName;

  private String manufacturerChargeContact;

  private Integer frequency;

  private Date createTime;

  private Integer createUser;

  private Date updateTime;

  private Integer updateUser;

  private String isCamera;

  private String cameraIp;

  private String carmeraProt;

  private String carmeraName;

  private String carmeraPassword;

  private String iconName;

  private String iconUrl;

  private String remark;
}