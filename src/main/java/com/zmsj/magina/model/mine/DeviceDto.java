package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("采集器")
public class DeviceDto {

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

}
