package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgDykAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVoltMin;

  private BigDecimal ptemp;

  private BigDecimal wdAvg;

  private BigDecimal wsAvg;

  private BigDecimal taAvg;

  private BigDecimal rhAvg;

  private BigDecimal pressAvg;

  private BigDecimal rainAvg;

  private BigDecimal vwc1Avg;

  private BigDecimal ec1Avg;

  private BigDecimal tsoil1Avg;

  private BigDecimal vwc2Avg;

  private BigDecimal ec2Avg;

  private BigDecimal tsoil2Avg;

  private BigDecimal vwc3Avg;

  private BigDecimal ec3Avg;

  private BigDecimal tsoil3Avg;

  private BigDecimal vwc4Avg;

  private BigDecimal ec4Avg;

  private BigDecimal tsoil4Avg;

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

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public BigDecimal getRecord() {
    return record;
  }

  public void setRecord(BigDecimal record) {
    this.record = record;
  }

  public BigDecimal getBattVoltMin() {
    return battVoltMin;
  }

  public void setBattVoltMin(BigDecimal battVoltMin) {
    this.battVoltMin = battVoltMin;
  }

  public BigDecimal getPtemp() {
    return ptemp;
  }

  public void setPtemp(BigDecimal ptemp) {
    this.ptemp = ptemp;
  }

  public BigDecimal getWdAvg() {
    return wdAvg;
  }

  public void setWdAvg(BigDecimal wdAvg) {
    this.wdAvg = wdAvg;
  }

  public BigDecimal getWsAvg() {
    return wsAvg;
  }

  public void setWsAvg(BigDecimal wsAvg) {
    this.wsAvg = wsAvg;
  }

  public BigDecimal getTaAvg() {
    return taAvg;
  }

  public void setTaAvg(BigDecimal taAvg) {
    this.taAvg = taAvg;
  }

  public BigDecimal getRhAvg() {
    return rhAvg;
  }

  public void setRhAvg(BigDecimal rhAvg) {
    this.rhAvg = rhAvg;
  }

  public BigDecimal getPressAvg() {
    return pressAvg;
  }

  public void setPressAvg(BigDecimal pressAvg) {
    this.pressAvg = pressAvg;
  }

  public BigDecimal getRainAvg() {
    return rainAvg;
  }

  public void setRainAvg(BigDecimal rainAvg) {
    this.rainAvg = rainAvg;
  }

  public BigDecimal getVwc1Avg() {
    return vwc1Avg;
  }

  public void setVwc1Avg(BigDecimal vwc1Avg) {
    this.vwc1Avg = vwc1Avg;
  }

  public BigDecimal getEc1Avg() {
    return ec1Avg;
  }

  public void setEc1Avg(BigDecimal ec1Avg) {
    this.ec1Avg = ec1Avg;
  }

  public BigDecimal getTsoil1Avg() {
    return tsoil1Avg;
  }

  public void setTsoil1Avg(BigDecimal tsoil1Avg) {
    this.tsoil1Avg = tsoil1Avg;
  }

  public BigDecimal getVwc2Avg() {
    return vwc2Avg;
  }

  public void setVwc2Avg(BigDecimal vwc2Avg) {
    this.vwc2Avg = vwc2Avg;
  }

  public BigDecimal getEc2Avg() {
    return ec2Avg;
  }

  public void setEc2Avg(BigDecimal ec2Avg) {
    this.ec2Avg = ec2Avg;
  }

  public BigDecimal getTsoil2Avg() {
    return tsoil2Avg;
  }

  public void setTsoil2Avg(BigDecimal tsoil2Avg) {
    this.tsoil2Avg = tsoil2Avg;
  }

  public BigDecimal getVwc3Avg() {
    return vwc3Avg;
  }

  public void setVwc3Avg(BigDecimal vwc3Avg) {
    this.vwc3Avg = vwc3Avg;
  }

  public BigDecimal getEc3Avg() {
    return ec3Avg;
  }

  public void setEc3Avg(BigDecimal ec3Avg) {
    this.ec3Avg = ec3Avg;
  }

  public BigDecimal getTsoil3Avg() {
    return tsoil3Avg;
  }

  public void setTsoil3Avg(BigDecimal tsoil3Avg) {
    this.tsoil3Avg = tsoil3Avg;
  }

  public BigDecimal getVwc4Avg() {
    return vwc4Avg;
  }

  public void setVwc4Avg(BigDecimal vwc4Avg) {
    this.vwc4Avg = vwc4Avg;
  }

  public BigDecimal getEc4Avg() {
    return ec4Avg;
  }

  public void setEc4Avg(BigDecimal ec4Avg) {
    this.ec4Avg = ec4Avg;
  }

  public BigDecimal getTsoil4Avg() {
    return tsoil4Avg;
  }

  public void setTsoil4Avg(BigDecimal tsoil4Avg) {
    this.tsoil4Avg = tsoil4Avg;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}