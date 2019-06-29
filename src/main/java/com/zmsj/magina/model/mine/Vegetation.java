package com.zmsj.magina.model.mine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class Vegetation {

  private Integer id;
  private Integer areaId;
  private Double desertVegetation;
  private Double prairieVegetation;
  private Double forestVegetation;
  @JsonProperty("0-0.15")
  private Double index15;
  @JsonProperty("0.15-0.25")
  private Double index25;
  @JsonProperty("0.25-0.35")
  private Double index35;
  @JsonProperty("0.35-0.45")
  private Double index45;
  @JsonProperty("0.45-0.55")
  private Double index55;
  @JsonProperty("0.55-0.65")
  private Double index65;
  @JsonProperty("0.65-0.75")
  private Double index75;
  @JsonProperty("0.75-0.85")
  private Double index85;
  @JsonProperty("0.75-1")
  private Double index100;

}
