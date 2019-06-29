package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgPortAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVolt;

  private BigDecimal ptemp;

  private BigDecimal ws;

  private BigDecimal wd;

  private BigDecimal wdStd;

  private BigDecimal tempAirAvg;

  private BigDecimal rhAirAvg;

  private BigDecimal pressureAvg;

  private BigDecimal dewPointAvg;

  private BigDecimal vwc10cmAvg;

  private BigDecimal ec10cmAvg;

  private BigDecimal tsoil10cmAvg;

  private BigDecimal vwc20cmAvg;

  private BigDecimal ec20cmAvg;

  private BigDecimal tsoil20cmAvg;

  private BigDecimal vwc30cmAvg;

  private BigDecimal ec30cmAvg;

  private BigDecimal tsoil30cmAvg;

  private BigDecimal rainIntensity;

  private BigDecimal rainTot;

  private BigDecimal statusRain;

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

  public BigDecimal getBattVolt() {
    return battVolt;
  }

  public void setBattVolt(BigDecimal battVolt) {
    this.battVolt = battVolt;
  }

  public BigDecimal getPtemp() {
    return ptemp;
  }

  public void setPtemp(BigDecimal ptemp) {
    this.ptemp = ptemp;
  }

  public BigDecimal getWs() {
    return ws;
  }

  public void setWs(BigDecimal ws) {
    this.ws = ws;
  }

  public BigDecimal getWd() {
    return wd;
  }

  public void setWd(BigDecimal wd) {
    this.wd = wd;
  }

  public BigDecimal getWdStd() {
    return wdStd;
  }

  public void setWdStd(BigDecimal wdStd) {
    this.wdStd = wdStd;
  }

  public BigDecimal getTempAirAvg() {
    return tempAirAvg;
  }

  public void setTempAirAvg(BigDecimal tempAirAvg) {
    this.tempAirAvg = tempAirAvg;
  }

  public BigDecimal getRhAirAvg() {
    return rhAirAvg;
  }

  public void setRhAirAvg(BigDecimal rhAirAvg) {
    this.rhAirAvg = rhAirAvg;
  }

  public BigDecimal getPressureAvg() {
    return pressureAvg;
  }

  public void setPressureAvg(BigDecimal pressureAvg) {
    this.pressureAvg = pressureAvg;
  }

  public BigDecimal getDewPointAvg() {
    return dewPointAvg;
  }

  public void setDewPointAvg(BigDecimal dewPointAvg) {
    this.dewPointAvg = dewPointAvg;
  }

  public BigDecimal getVwc10cmAvg() {
    return vwc10cmAvg;
  }

  public void setVwc10cmAvg(BigDecimal vwc10cmAvg) {
    this.vwc10cmAvg = vwc10cmAvg;
  }

  public BigDecimal getEc10cmAvg() {
    return ec10cmAvg;
  }

  public void setEc10cmAvg(BigDecimal ec10cmAvg) {
    this.ec10cmAvg = ec10cmAvg;
  }

  public BigDecimal getTsoil10cmAvg() {
    return tsoil10cmAvg;
  }

  public void setTsoil10cmAvg(BigDecimal tsoil10cmAvg) {
    this.tsoil10cmAvg = tsoil10cmAvg;
  }

  public BigDecimal getVwc20cmAvg() {
    return vwc20cmAvg;
  }

  public void setVwc20cmAvg(BigDecimal vwc20cmAvg) {
    this.vwc20cmAvg = vwc20cmAvg;
  }

  public BigDecimal getEc20cmAvg() {
    return ec20cmAvg;
  }

  public void setEc20cmAvg(BigDecimal ec20cmAvg) {
    this.ec20cmAvg = ec20cmAvg;
  }

  public BigDecimal getTsoil20cmAvg() {
    return tsoil20cmAvg;
  }

  public void setTsoil20cmAvg(BigDecimal tsoil20cmAvg) {
    this.tsoil20cmAvg = tsoil20cmAvg;
  }

  public BigDecimal getVwc30cmAvg() {
    return vwc30cmAvg;
  }

  public void setVwc30cmAvg(BigDecimal vwc30cmAvg) {
    this.vwc30cmAvg = vwc30cmAvg;
  }

  public BigDecimal getEc30cmAvg() {
    return ec30cmAvg;
  }

  public void setEc30cmAvg(BigDecimal ec30cmAvg) {
    this.ec30cmAvg = ec30cmAvg;
  }

  public BigDecimal getTsoil30cmAvg() {
    return tsoil30cmAvg;
  }

  public void setTsoil30cmAvg(BigDecimal tsoil30cmAvg) {
    this.tsoil30cmAvg = tsoil30cmAvg;
  }

  public BigDecimal getRainIntensity() {
    return rainIntensity;
  }

  public void setRainIntensity(BigDecimal rainIntensity) {
    this.rainIntensity = rainIntensity;
  }

  public BigDecimal getRainTot() {
    return rainTot;
  }

  public void setRainTot(BigDecimal rainTot) {
    this.rainTot = rainTot;
  }

  public BigDecimal getStatusRain() {
    return statusRain;
  }

  public void setStatusRain(BigDecimal statusRain) {
    this.statusRain = statusRain;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}