package com.zmsj.magina.model.mine;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("区域土壤分析")
public class AreaSoilAnalysis {

  private Double soilTemp;
  private Double soilSalt;
  private Double soilHumidity;
  private Double rainfall;
}
