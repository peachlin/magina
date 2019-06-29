package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgGrassAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVoltMin;

  private BigDecimal ptemp;

  private BigDecimal ws10mAvg;

  private BigDecimal ws10m;

  private BigDecimal wd;

  private BigDecimal temp10mAvg;

  private BigDecimal temp2mAvg;

  private BigDecimal rh10mAvg;

  private BigDecimal rh2mAvg;

  private BigDecimal vapor10mAvg;

  private BigDecimal vapor2mAvg;

  private BigDecimal shortWaveDAvg;

  private BigDecimal shortWaveUAvg;

  private BigDecimal longWaveDAvg;

  private BigDecimal longWaveUAvg;

  private BigDecimal netTotAvg;

  private BigDecimal nr01tcAvg;

  private BigDecimal albedoNr01Avg;

  private BigDecimal rainMmTot;

  private BigDecimal p;

  private BigDecimal hsoilTc10cm;

  private BigDecimal hsoilTk10cm;

  private BigDecimal soilMoisture10cm;

  private BigDecimal soilCond10cm;

  private BigDecimal soilDlt10cm;

  private BigDecimal hsoilTc20cm;

  private BigDecimal hsoilTk20cm;

  private BigDecimal soilMoisture20cm;

  private BigDecimal soilCond20cm;

  private BigDecimal soilDlt20cm;

  private BigDecimal hsoilTc30cm;

  private BigDecimal hsoilTk30cm;

  private BigDecimal soilMoisture30cm;

  private BigDecimal soilCond30cm;

  private BigDecimal soilDlt30cm;

  private BigDecimal hsoilTc40cm;

  private BigDecimal hsoilTk40cm;

  private BigDecimal soilMoisture40cm;

  private BigDecimal soilCond40cm;

  private BigDecimal soilDlt40cm;

  private BigDecimal hsoilTc60cm;

  private BigDecimal hsoilTk60cm;

  private BigDecimal soilMoisture60cm;

  private BigDecimal soilCond60cm;

  private BigDecimal soilDlt60cm;

  private BigDecimal hsoilTc80cm;

  private BigDecimal hsoilTk80cm;

  private BigDecimal soilMoisture80cm;

  private BigDecimal soilCond80cm;

  private BigDecimal soilDlt80cm;

  private BigDecimal soilGLAvg;

  private BigDecimal soilGRAvg;

  private BigDecimal snowDepth;

  private BigDecimal signalquality;

  private BigDecimal targettc0cmAvg;

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

  public BigDecimal getWs10mAvg() {
    return ws10mAvg;
  }

  public void setWs10mAvg(BigDecimal ws10mAvg) {
    this.ws10mAvg = ws10mAvg;
  }

  public BigDecimal getWs10m() {
    return ws10m;
  }

  public void setWs10m(BigDecimal ws10m) {
    this.ws10m = ws10m;
  }

  public BigDecimal getWd() {
    return wd;
  }

  public void setWd(BigDecimal wd) {
    this.wd = wd;
  }

  public BigDecimal getTemp10mAvg() {
    return temp10mAvg;
  }

  public void setTemp10mAvg(BigDecimal temp10mAvg) {
    this.temp10mAvg = temp10mAvg;
  }

  public BigDecimal getTemp2mAvg() {
    return temp2mAvg;
  }

  public void setTemp2mAvg(BigDecimal temp2mAvg) {
    this.temp2mAvg = temp2mAvg;
  }

  public BigDecimal getRh10mAvg() {
    return rh10mAvg;
  }

  public void setRh10mAvg(BigDecimal rh10mAvg) {
    this.rh10mAvg = rh10mAvg;
  }

  public BigDecimal getRh2mAvg() {
    return rh2mAvg;
  }

  public void setRh2mAvg(BigDecimal rh2mAvg) {
    this.rh2mAvg = rh2mAvg;
  }

  public BigDecimal getVapor10mAvg() {
    return vapor10mAvg;
  }

  public void setVapor10mAvg(BigDecimal vapor10mAvg) {
    this.vapor10mAvg = vapor10mAvg;
  }

  public BigDecimal getVapor2mAvg() {
    return vapor2mAvg;
  }

  public void setVapor2mAvg(BigDecimal vapor2mAvg) {
    this.vapor2mAvg = vapor2mAvg;
  }

  public BigDecimal getShortWaveDAvg() {
    return shortWaveDAvg;
  }

  public void setShortWaveDAvg(BigDecimal shortWaveDAvg) {
    this.shortWaveDAvg = shortWaveDAvg;
  }

  public BigDecimal getShortWaveUAvg() {
    return shortWaveUAvg;
  }

  public void setShortWaveUAvg(BigDecimal shortWaveUAvg) {
    this.shortWaveUAvg = shortWaveUAvg;
  }

  public BigDecimal getLongWaveDAvg() {
    return longWaveDAvg;
  }

  public void setLongWaveDAvg(BigDecimal longWaveDAvg) {
    this.longWaveDAvg = longWaveDAvg;
  }

  public BigDecimal getLongWaveUAvg() {
    return longWaveUAvg;
  }

  public void setLongWaveUAvg(BigDecimal longWaveUAvg) {
    this.longWaveUAvg = longWaveUAvg;
  }

  public BigDecimal getNetTotAvg() {
    return netTotAvg;
  }

  public void setNetTotAvg(BigDecimal netTotAvg) {
    this.netTotAvg = netTotAvg;
  }

  public BigDecimal getNr01tcAvg() {
    return nr01tcAvg;
  }

  public void setNr01tcAvg(BigDecimal nr01tcAvg) {
    this.nr01tcAvg = nr01tcAvg;
  }

  public BigDecimal getAlbedoNr01Avg() {
    return albedoNr01Avg;
  }

  public void setAlbedoNr01Avg(BigDecimal albedoNr01Avg) {
    this.albedoNr01Avg = albedoNr01Avg;
  }

  public BigDecimal getRainMmTot() {
    return rainMmTot;
  }

  public void setRainMmTot(BigDecimal rainMmTot) {
    this.rainMmTot = rainMmTot;
  }

  public BigDecimal getP() {
    return p;
  }

  public void setP(BigDecimal p) {
    this.p = p;
  }

  public BigDecimal getHsoilTc10cm() {
    return hsoilTc10cm;
  }

  public void setHsoilTc10cm(BigDecimal hsoilTc10cm) {
    this.hsoilTc10cm = hsoilTc10cm;
  }

  public BigDecimal getHsoilTk10cm() {
    return hsoilTk10cm;
  }

  public void setHsoilTk10cm(BigDecimal hsoilTk10cm) {
    this.hsoilTk10cm = hsoilTk10cm;
  }

  public BigDecimal getSoilMoisture10cm() {
    return soilMoisture10cm;
  }

  public void setSoilMoisture10cm(BigDecimal soilMoisture10cm) {
    this.soilMoisture10cm = soilMoisture10cm;
  }

  public BigDecimal getSoilCond10cm() {
    return soilCond10cm;
  }

  public void setSoilCond10cm(BigDecimal soilCond10cm) {
    this.soilCond10cm = soilCond10cm;
  }

  public BigDecimal getSoilDlt10cm() {
    return soilDlt10cm;
  }

  public void setSoilDlt10cm(BigDecimal soilDlt10cm) {
    this.soilDlt10cm = soilDlt10cm;
  }

  public BigDecimal getHsoilTc20cm() {
    return hsoilTc20cm;
  }

  public void setHsoilTc20cm(BigDecimal hsoilTc20cm) {
    this.hsoilTc20cm = hsoilTc20cm;
  }

  public BigDecimal getHsoilTk20cm() {
    return hsoilTk20cm;
  }

  public void setHsoilTk20cm(BigDecimal hsoilTk20cm) {
    this.hsoilTk20cm = hsoilTk20cm;
  }

  public BigDecimal getSoilMoisture20cm() {
    return soilMoisture20cm;
  }

  public void setSoilMoisture20cm(BigDecimal soilMoisture20cm) {
    this.soilMoisture20cm = soilMoisture20cm;
  }

  public BigDecimal getSoilCond20cm() {
    return soilCond20cm;
  }

  public void setSoilCond20cm(BigDecimal soilCond20cm) {
    this.soilCond20cm = soilCond20cm;
  }

  public BigDecimal getSoilDlt20cm() {
    return soilDlt20cm;
  }

  public void setSoilDlt20cm(BigDecimal soilDlt20cm) {
    this.soilDlt20cm = soilDlt20cm;
  }

  public BigDecimal getHsoilTc30cm() {
    return hsoilTc30cm;
  }

  public void setHsoilTc30cm(BigDecimal hsoilTc30cm) {
    this.hsoilTc30cm = hsoilTc30cm;
  }

  public BigDecimal getHsoilTk30cm() {
    return hsoilTk30cm;
  }

  public void setHsoilTk30cm(BigDecimal hsoilTk30cm) {
    this.hsoilTk30cm = hsoilTk30cm;
  }

  public BigDecimal getSoilMoisture30cm() {
    return soilMoisture30cm;
  }

  public void setSoilMoisture30cm(BigDecimal soilMoisture30cm) {
    this.soilMoisture30cm = soilMoisture30cm;
  }

  public BigDecimal getSoilCond30cm() {
    return soilCond30cm;
  }

  public void setSoilCond30cm(BigDecimal soilCond30cm) {
    this.soilCond30cm = soilCond30cm;
  }

  public BigDecimal getSoilDlt30cm() {
    return soilDlt30cm;
  }

  public void setSoilDlt30cm(BigDecimal soilDlt30cm) {
    this.soilDlt30cm = soilDlt30cm;
  }

  public BigDecimal getHsoilTc40cm() {
    return hsoilTc40cm;
  }

  public void setHsoilTc40cm(BigDecimal hsoilTc40cm) {
    this.hsoilTc40cm = hsoilTc40cm;
  }

  public BigDecimal getHsoilTk40cm() {
    return hsoilTk40cm;
  }

  public void setHsoilTk40cm(BigDecimal hsoilTk40cm) {
    this.hsoilTk40cm = hsoilTk40cm;
  }

  public BigDecimal getSoilMoisture40cm() {
    return soilMoisture40cm;
  }

  public void setSoilMoisture40cm(BigDecimal soilMoisture40cm) {
    this.soilMoisture40cm = soilMoisture40cm;
  }

  public BigDecimal getSoilCond40cm() {
    return soilCond40cm;
  }

  public void setSoilCond40cm(BigDecimal soilCond40cm) {
    this.soilCond40cm = soilCond40cm;
  }

  public BigDecimal getSoilDlt40cm() {
    return soilDlt40cm;
  }

  public void setSoilDlt40cm(BigDecimal soilDlt40cm) {
    this.soilDlt40cm = soilDlt40cm;
  }

  public BigDecimal getHsoilTc60cm() {
    return hsoilTc60cm;
  }

  public void setHsoilTc60cm(BigDecimal hsoilTc60cm) {
    this.hsoilTc60cm = hsoilTc60cm;
  }

  public BigDecimal getHsoilTk60cm() {
    return hsoilTk60cm;
  }

  public void setHsoilTk60cm(BigDecimal hsoilTk60cm) {
    this.hsoilTk60cm = hsoilTk60cm;
  }

  public BigDecimal getSoilMoisture60cm() {
    return soilMoisture60cm;
  }

  public void setSoilMoisture60cm(BigDecimal soilMoisture60cm) {
    this.soilMoisture60cm = soilMoisture60cm;
  }

  public BigDecimal getSoilCond60cm() {
    return soilCond60cm;
  }

  public void setSoilCond60cm(BigDecimal soilCond60cm) {
    this.soilCond60cm = soilCond60cm;
  }

  public BigDecimal getSoilDlt60cm() {
    return soilDlt60cm;
  }

  public void setSoilDlt60cm(BigDecimal soilDlt60cm) {
    this.soilDlt60cm = soilDlt60cm;
  }

  public BigDecimal getHsoilTc80cm() {
    return hsoilTc80cm;
  }

  public void setHsoilTc80cm(BigDecimal hsoilTc80cm) {
    this.hsoilTc80cm = hsoilTc80cm;
  }

  public BigDecimal getHsoilTk80cm() {
    return hsoilTk80cm;
  }

  public void setHsoilTk80cm(BigDecimal hsoilTk80cm) {
    this.hsoilTk80cm = hsoilTk80cm;
  }

  public BigDecimal getSoilMoisture80cm() {
    return soilMoisture80cm;
  }

  public void setSoilMoisture80cm(BigDecimal soilMoisture80cm) {
    this.soilMoisture80cm = soilMoisture80cm;
  }

  public BigDecimal getSoilCond80cm() {
    return soilCond80cm;
  }

  public void setSoilCond80cm(BigDecimal soilCond80cm) {
    this.soilCond80cm = soilCond80cm;
  }

  public BigDecimal getSoilDlt80cm() {
    return soilDlt80cm;
  }

  public void setSoilDlt80cm(BigDecimal soilDlt80cm) {
    this.soilDlt80cm = soilDlt80cm;
  }

  public BigDecimal getSoilGLAvg() {
    return soilGLAvg;
  }

  public void setSoilGLAvg(BigDecimal soilGLAvg) {
    this.soilGLAvg = soilGLAvg;
  }

  public BigDecimal getSoilGRAvg() {
    return soilGRAvg;
  }

  public void setSoilGRAvg(BigDecimal soilGRAvg) {
    this.soilGRAvg = soilGRAvg;
  }

  public BigDecimal getSnowDepth() {
    return snowDepth;
  }

  public void setSnowDepth(BigDecimal snowDepth) {
    this.snowDepth = snowDepth;
  }

  public BigDecimal getSignalquality() {
    return signalquality;
  }

  public void setSignalquality(BigDecimal signalquality) {
    this.signalquality = signalquality;
  }

  public BigDecimal getTargettc0cmAvg() {
    return targettc0cmAvg;
  }

  public void setTargettc0cmAvg(BigDecimal targettc0cmAvg) {
    this.targettc0cmAvg = targettc0cmAvg;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}