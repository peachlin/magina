package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("区域气象均值")
public class AreaMeteorologicalInfo {

  @ApiModelProperty("区域名称")
  private String area;
  @ApiModelProperty("空气温度")
  private Double airTemp;
  @ApiModelProperty("空气湿度")
  private Double airHumidity;
  @ApiModelProperty("土壤温度")
  private Double soilTemp;
}
