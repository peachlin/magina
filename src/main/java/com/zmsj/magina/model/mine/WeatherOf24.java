package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class WeatherOf24 {

  private String time;
  @ApiModelProperty("空气温度")
  private Double airTemp;
  @ApiModelProperty("空气湿度")
  private Double airHumidity;
  @ApiModelProperty("土壤温度")
  private Double soilTemp;
}
