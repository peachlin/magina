package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgHoboAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private BigDecimal num;

  private Date timestamp;

  private BigDecimal solarRadiation;

  private BigDecimal par;

  private BigDecimal water10Content;

  private BigDecimal water20Content;

  private BigDecimal water40Content;

  private BigDecimal pressure;

  private BigDecimal temp;

  private BigDecimal rh;

  private BigDecimal temp10;

  private BigDecimal rain;

  private BigDecimal windDirection;

  private BigDecimal windSpeed;

  private BigDecimal gustSpeed;

  private BigDecimal temp20;

  private BigDecimal temp40;

  private BigDecimal batt;

  private Integer fileType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public String getCollectorid() {
    return collectorid;
  }

  public void setCollectorid(String collectorid) {
    this.collectorid = collectorid == null ? null : collectorid.trim();
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public BigDecimal getCollectFrequency() {
    return collectFrequency;
  }

  public void setCollectFrequency(BigDecimal collectFrequency) {
    this.collectFrequency = collectFrequency;
  }

  public BigDecimal getNum() {
    return num;
  }

  public void setNum(BigDecimal num) {
    this.num = num;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public BigDecimal getSolarRadiation() {
    return solarRadiation;
  }

  public void setSolarRadiation(BigDecimal solarRadiation) {
    this.solarRadiation = solarRadiation;
  }

  public BigDecimal getPar() {
    return par;
  }

  public void setPar(BigDecimal par) {
    this.par = par;
  }

  public BigDecimal getWater10Content() {
    return water10Content;
  }

  public void setWater10Content(BigDecimal water10Content) {
    this.water10Content = water10Content;
  }

  public BigDecimal getWater20Content() {
    return water20Content;
  }

  public void setWater20Content(BigDecimal water20Content) {
    this.water20Content = water20Content;
  }

  public BigDecimal getWater40Content() {
    return water40Content;
  }

  public void setWater40Content(BigDecimal water40Content) {
    this.water40Content = water40Content;
  }

  public BigDecimal getPressure() {
    return pressure;
  }

  public void setPressure(BigDecimal pressure) {
    this.pressure = pressure;
  }

  public BigDecimal getTemp() {
    return temp;
  }

  public void setTemp(BigDecimal temp) {
    this.temp = temp;
  }

  public BigDecimal getRh() {
    return rh;
  }

  public void setRh(BigDecimal rh) {
    this.rh = rh;
  }

  public BigDecimal getTemp10() {
    return temp10;
  }

  public void setTemp10(BigDecimal temp10) {
    this.temp10 = temp10;
  }

  public BigDecimal getRain() {
    return rain;
  }

  public void setRain(BigDecimal rain) {
    this.rain = rain;
  }

  public BigDecimal getWindDirection() {
    return windDirection;
  }

  public void setWindDirection(BigDecimal windDirection) {
    this.windDirection = windDirection;
  }

  public BigDecimal getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
  }

  public BigDecimal getGustSpeed() {
    return gustSpeed;
  }

  public void setGustSpeed(BigDecimal gustSpeed) {
    this.gustSpeed = gustSpeed;
  }

  public BigDecimal getTemp20() {
    return temp20;
  }

  public void setTemp20(BigDecimal temp20) {
    this.temp20 = temp20;
  }

  public BigDecimal getTemp40() {
    return temp40;
  }

  public void setTemp40(BigDecimal temp40) {
    this.temp40 = temp40;
  }

  public BigDecimal getBatt() {
    return batt;
  }

  public void setBatt(BigDecimal batt) {
    this.batt = batt;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}