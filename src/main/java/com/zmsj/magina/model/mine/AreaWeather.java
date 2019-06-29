package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@ApiModel("区域天气变化")
@Data
public class AreaWeather {

  private String time;
  @ApiModelProperty("温度")
  private Double temp;
  @ApiModelProperty("天气")
  private Double weather;
}
