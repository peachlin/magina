package com.zmsj.magina.model;

import com.zmsj.magina.base.MaginaUtils;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("采集指标")
public class Metric {

  private String id;

  private String type;

  private String zhName;

  private String enName;

  private String unit;

  private String deviceId;

  private String remark;

  private Date modifyTime;

  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      System.out.println(MaginaUtils.generateUUID());
    }
  }
}