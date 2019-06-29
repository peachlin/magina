package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgEcologyAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVolt;

  private BigDecimal ptemp;

  private BigDecimal wd2m;

  private BigDecimal ws2m;

  private BigDecimal wind3;

  private BigDecimal wd10m;

  private BigDecimal ws10m;

  private BigDecimal wind6;

  private BigDecimal vwc10cm;

  private BigDecimal ec10cm;

  private BigDecimal tsoil10cm;

  private BigDecimal vwc20cm;

  private BigDecimal ec20cm;

  private BigDecimal tsoil20cm;

  private BigDecimal vwc30cm;

  private BigDecimal ec30cm;

  private BigDecimal tsoil30cm;

  private BigDecimal vwc40cm;

  private BigDecimal ec40cm;

  private BigDecimal tsoil40cm;

  private BigDecimal vwc60cm;

  private BigDecimal ec60cm;

  private BigDecimal tsoil60cm;

  private BigDecimal vwc80cm;

  private BigDecimal ec80cm;

  private BigDecimal tsoil80cm;

  private BigDecimal rainTot;

  private BigDecimal panlevel;

  private BigDecimal soilG10cmAvg;

  private BigDecimal soilG20cmAvg;

  private BigDecimal drAvg;

  private BigDecimal urAvg;

  private BigDecimal dlrAvg;

  private BigDecimal ulrAvg;

  private BigDecimal rnAvg;

  private BigDecimal totRAvg;

  private BigDecimal albedoAvg;

  private BigDecimal pressureAvg;

  private BigDecimal ta2mAvg;

  private BigDecimal rh2mAvg;

  private BigDecimal ta10mAvg;

  private BigDecimal rh10mAvg;

  private BigDecimal vapor2mAvg;

  private BigDecimal vapor10mAvg;

  private BigDecimal sd4;

  private BigDecimal targettc0cmAvg;

  private BigDecimal sensorBodytcAvg;

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

  public BigDecimal getWd2m() {
    return wd2m;
  }

  public void setWd2m(BigDecimal wd2m) {
    this.wd2m = wd2m;
  }

  public BigDecimal getWs2m() {
    return ws2m;
  }

  public void setWs2m(BigDecimal ws2m) {
    this.ws2m = ws2m;
  }

  public BigDecimal getWind3() {
    return wind3;
  }

  public void setWind3(BigDecimal wind3) {
    this.wind3 = wind3;
  }

  public BigDecimal getWd10m() {
    return wd10m;
  }

  public void setWd10m(BigDecimal wd10m) {
    this.wd10m = wd10m;
  }

  public BigDecimal getWs10m() {
    return ws10m;
  }

  public void setWs10m(BigDecimal ws10m) {
    this.ws10m = ws10m;
  }

  public BigDecimal getWind6() {
    return wind6;
  }

  public void setWind6(BigDecimal wind6) {
    this.wind6 = wind6;
  }

  public BigDecimal getVwc10cm() {
    return vwc10cm;
  }

  public void setVwc10cm(BigDecimal vwc10cm) {
    this.vwc10cm = vwc10cm;
  }

  public BigDecimal getEc10cm() {
    return ec10cm;
  }

  public void setEc10cm(BigDecimal ec10cm) {
    this.ec10cm = ec10cm;
  }

  public BigDecimal getTsoil10cm() {
    return tsoil10cm;
  }

  public void setTsoil10cm(BigDecimal tsoil10cm) {
    this.tsoil10cm = tsoil10cm;
  }

  public BigDecimal getVwc20cm() {
    return vwc20cm;
  }

  public void setVwc20cm(BigDecimal vwc20cm) {
    this.vwc20cm = vwc20cm;
  }

  public BigDecimal getEc20cm() {
    return ec20cm;
  }

  public void setEc20cm(BigDecimal ec20cm) {
    this.ec20cm = ec20cm;
  }

  public BigDecimal getTsoil20cm() {
    return tsoil20cm;
  }

  public void setTsoil20cm(BigDecimal tsoil20cm) {
    this.tsoil20cm = tsoil20cm;
  }

  public BigDecimal getVwc30cm() {
    return vwc30cm;
  }

  public void setVwc30cm(BigDecimal vwc30cm) {
    this.vwc30cm = vwc30cm;
  }

  public BigDecimal getEc30cm() {
    return ec30cm;
  }

  public void setEc30cm(BigDecimal ec30cm) {
    this.ec30cm = ec30cm;
  }

  public BigDecimal getTsoil30cm() {
    return tsoil30cm;
  }

  public void setTsoil30cm(BigDecimal tsoil30cm) {
    this.tsoil30cm = tsoil30cm;
  }

  public BigDecimal getVwc40cm() {
    return vwc40cm;
  }

  public void setVwc40cm(BigDecimal vwc40cm) {
    this.vwc40cm = vwc40cm;
  }

  public BigDecimal getEc40cm() {
    return ec40cm;
  }

  public void setEc40cm(BigDecimal ec40cm) {
    this.ec40cm = ec40cm;
  }

  public BigDecimal getTsoil40cm() {
    return tsoil40cm;
  }

  public void setTsoil40cm(BigDecimal tsoil40cm) {
    this.tsoil40cm = tsoil40cm;
  }

  public BigDecimal getVwc60cm() {
    return vwc60cm;
  }

  public void setVwc60cm(BigDecimal vwc60cm) {
    this.vwc60cm = vwc60cm;
  }

  public BigDecimal getEc60cm() {
    return ec60cm;
  }

  public void setEc60cm(BigDecimal ec60cm) {
    this.ec60cm = ec60cm;
  }

  public BigDecimal getTsoil60cm() {
    return tsoil60cm;
  }

  public void setTsoil60cm(BigDecimal tsoil60cm) {
    this.tsoil60cm = tsoil60cm;
  }

  public BigDecimal getVwc80cm() {
    return vwc80cm;
  }

  public void setVwc80cm(BigDecimal vwc80cm) {
    this.vwc80cm = vwc80cm;
  }

  public BigDecimal getEc80cm() {
    return ec80cm;
  }

  public void setEc80cm(BigDecimal ec80cm) {
    this.ec80cm = ec80cm;
  }

  public BigDecimal getTsoil80cm() {
    return tsoil80cm;
  }

  public void setTsoil80cm(BigDecimal tsoil80cm) {
    this.tsoil80cm = tsoil80cm;
  }

  public BigDecimal getRainTot() {
    return rainTot;
  }

  public void setRainTot(BigDecimal rainTot) {
    this.rainTot = rainTot;
  }

  public BigDecimal getPanlevel() {
    return panlevel;
  }

  public void setPanlevel(BigDecimal panlevel) {
    this.panlevel = panlevel;
  }

  public BigDecimal getSoilG10cmAvg() {
    return soilG10cmAvg;
  }

  public void setSoilG10cmAvg(BigDecimal soilG10cmAvg) {
    this.soilG10cmAvg = soilG10cmAvg;
  }

  public BigDecimal getSoilG20cmAvg() {
    return soilG20cmAvg;
  }

  public void setSoilG20cmAvg(BigDecimal soilG20cmAvg) {
    this.soilG20cmAvg = soilG20cmAvg;
  }

  public BigDecimal getDrAvg() {
    return drAvg;
  }

  public void setDrAvg(BigDecimal drAvg) {
    this.drAvg = drAvg;
  }

  public BigDecimal getUrAvg() {
    return urAvg;
  }

  public void setUrAvg(BigDecimal urAvg) {
    this.urAvg = urAvg;
  }

  public BigDecimal getDlrAvg() {
    return dlrAvg;
  }

  public void setDlrAvg(BigDecimal dlrAvg) {
    this.dlrAvg = dlrAvg;
  }

  public BigDecimal getUlrAvg() {
    return ulrAvg;
  }

  public void setUlrAvg(BigDecimal ulrAvg) {
    this.ulrAvg = ulrAvg;
  }

  public BigDecimal getRnAvg() {
    return rnAvg;
  }

  public void setRnAvg(BigDecimal rnAvg) {
    this.rnAvg = rnAvg;
  }

  public BigDecimal getTotRAvg() {
    return totRAvg;
  }

  public void setTotRAvg(BigDecimal totRAvg) {
    this.totRAvg = totRAvg;
  }

  public BigDecimal getAlbedoAvg() {
    return albedoAvg;
  }

  public void setAlbedoAvg(BigDecimal albedoAvg) {
    this.albedoAvg = albedoAvg;
  }

  public BigDecimal getPressureAvg() {
    return pressureAvg;
  }

  public void setPressureAvg(BigDecimal pressureAvg) {
    this.pressureAvg = pressureAvg;
  }

  public BigDecimal getTa2mAvg() {
    return ta2mAvg;
  }

  public void setTa2mAvg(BigDecimal ta2mAvg) {
    this.ta2mAvg = ta2mAvg;
  }

  public BigDecimal getRh2mAvg() {
    return rh2mAvg;
  }

  public void setRh2mAvg(BigDecimal rh2mAvg) {
    this.rh2mAvg = rh2mAvg;
  }

  public BigDecimal getTa10mAvg() {
    return ta10mAvg;
  }

  public void setTa10mAvg(BigDecimal ta10mAvg) {
    this.ta10mAvg = ta10mAvg;
  }

  public BigDecimal getRh10mAvg() {
    return rh10mAvg;
  }

  public void setRh10mAvg(BigDecimal rh10mAvg) {
    this.rh10mAvg = rh10mAvg;
  }

  public BigDecimal getVapor2mAvg() {
    return vapor2mAvg;
  }

  public void setVapor2mAvg(BigDecimal vapor2mAvg) {
    this.vapor2mAvg = vapor2mAvg;
  }

  public BigDecimal getVapor10mAvg() {
    return vapor10mAvg;
  }

  public void setVapor10mAvg(BigDecimal vapor10mAvg) {
    this.vapor10mAvg = vapor10mAvg;
  }

  public BigDecimal getSd4() {
    return sd4;
  }

  public void setSd4(BigDecimal sd4) {
    this.sd4 = sd4;
  }

  public BigDecimal getTargettc0cmAvg() {
    return targettc0cmAvg;
  }

  public void setTargettc0cmAvg(BigDecimal targettc0cmAvg) {
    this.targettc0cmAvg = targettc0cmAvg;
  }

  public BigDecimal getSensorBodytcAvg() {
    return sensorBodytcAvg;
  }

  public void setSensorBodytcAvg(BigDecimal sensorBodytcAvg) {
    this.sensorBodytcAvg = sensorBodytcAvg;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}