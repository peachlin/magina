package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class PlgBushAutoStation {

  private String id;

  private String collectorid;

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVoltMin;

  private BigDecimal ptemp;

  private BigDecimal wSpd;

  private BigDecimal wDir;

  private BigDecimal wdStd;

  private BigDecimal taAvg;

  private BigDecimal rhAvg;

  private BigDecimal pressAvg;

  private BigDecimal rain;

  private BigDecimal vwc10cmAvg;

  private BigDecimal ec10cmAvg;

  private BigDecimal tsoil10cmAvg;

  private BigDecimal vwc20cmAvg;

  private BigDecimal ec20cmAvg;

  private BigDecimal tsoil20cmAvg;

  private BigDecimal vwc30cmAvg;

  private BigDecimal ec30cmAvg;

  private BigDecimal tsoil30cmAvg;

  private BigDecimal vwc40cmAvg;

  private BigDecimal ec40cmAvg;

  private BigDecimal tsoil40cmAvg;

  private BigDecimal vwc60cmAvg;

  private BigDecimal ec60cmAvg;

  private BigDecimal tsoil60cmAvg;

  private Integer fileType;
}