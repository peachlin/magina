package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class SummaryInfo {

  private Integer stationNum;
  private Integer collectorNum;
  private Double windSpeed;
  private Double rainfall;
  private Double temp;
  private Double soilTemp;
  @ApiModelProperty("土壤水分")
  private Double soilMoisture;
}
