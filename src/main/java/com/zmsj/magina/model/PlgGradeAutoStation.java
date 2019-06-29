package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgGradeAutoStation {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private Date timestamp;

  private BigDecimal record;

  private BigDecimal battVoltMin;

  private BigDecimal ptempAvg;

  private BigDecimal ta2mAvg;

  private BigDecimal ta15mAvg;

  private BigDecimal ta30mAvg;

  private BigDecimal rh2mAvg;

  private BigDecimal rh15mAvg;

  private BigDecimal rh30mAvg;

  private BigDecimal e2mAvg;

  private BigDecimal e15mAvg;

  private BigDecimal e30mAvg;

  private BigDecimal windSpeed2mAvg;

  private BigDecimal windSpeed15mAvg;

  private BigDecimal windSpeed30mAvg;

  private BigDecimal windDirect30m;

  private BigDecimal pAvg;

  private BigDecimal parDenAvg;

  private BigDecimal parTotTot;

  private BigDecimal drAvg;

  private BigDecimal urAvg;

  private BigDecimal dlrAvg;

  private BigDecimal ulrAvg;

  private BigDecimal dlrCoAvg;

  private BigDecimal ulrCoAvg;

  private BigDecimal rnSAvg;

  private BigDecimal rnLAvg;

  private BigDecimal albedoAvg;

  private BigDecimal totRuAvg;

  private BigDecimal totRdAvg;

  private BigDecimal totRnAvg;

  private BigDecimal nr01TcAvg;

  private BigDecimal nr01TkAvg;

  private BigDecimal rain2mTot;

  private BigDecimal rain30mTot;

  private BigDecimal soilHum10cmAvg;

  private BigDecimal soilSalt10cmAvg;

  private BigDecimal soilTemp10cmAvg;

  private BigDecimal soilHum20cmAvg;

  private BigDecimal soilSalt20cmAvg;

  private BigDecimal soilTemp20cmAvg;

  private BigDecimal soilHum30cmAvg;

  private BigDecimal soilSalt30cmAvg;

  private BigDecimal soilTemp30cmAvg;

  private BigDecimal soilHum40cmAvg;

  private BigDecimal soilSalt40cmAvg;

  private BigDecimal soilTemp40cmAvg;

  private BigDecimal soilHum60cmAvg;

  private BigDecimal soilSalt60cmAvg;

  private BigDecimal soilTemp60cmAvg;

  private BigDecimal soilHum80cmAvg;

  private BigDecimal soilSalt80cmAvg;

  private BigDecimal soilTemp80cmAvg;

  private BigDecimal snowDepth;

  private BigDecimal signalquality;

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

  public BigDecimal getBattVoltMin() {
    return battVoltMin;
  }

  public void setBattVoltMin(BigDecimal battVoltMin) {
    this.battVoltMin = battVoltMin;
  }

  public BigDecimal getPtempAvg() {
    return ptempAvg;
  }

  public void setPtempAvg(BigDecimal ptempAvg) {
    this.ptempAvg = ptempAvg;
  }

  public BigDecimal getTa2mAvg() {
    return ta2mAvg;
  }

  public void setTa2mAvg(BigDecimal ta2mAvg) {
    this.ta2mAvg = ta2mAvg;
  }

  public BigDecimal getTa15mAvg() {
    return ta15mAvg;
  }

  public void setTa15mAvg(BigDecimal ta15mAvg) {
    this.ta15mAvg = ta15mAvg;
  }

  public BigDecimal getTa30mAvg() {
    return ta30mAvg;
  }

  public void setTa30mAvg(BigDecimal ta30mAvg) {
    this.ta30mAvg = ta30mAvg;
  }

  public BigDecimal getRh2mAvg() {
    return rh2mAvg;
  }

  public void setRh2mAvg(BigDecimal rh2mAvg) {
    this.rh2mAvg = rh2mAvg;
  }

  public BigDecimal getRh15mAvg() {
    return rh15mAvg;
  }

  public void setRh15mAvg(BigDecimal rh15mAvg) {
    this.rh15mAvg = rh15mAvg;
  }

  public BigDecimal getRh30mAvg() {
    return rh30mAvg;
  }

  public void setRh30mAvg(BigDecimal rh30mAvg) {
    this.rh30mAvg = rh30mAvg;
  }

  public BigDecimal getE2mAvg() {
    return e2mAvg;
  }

  public void setE2mAvg(BigDecimal e2mAvg) {
    this.e2mAvg = e2mAvg;
  }

  public BigDecimal getE15mAvg() {
    return e15mAvg;
  }

  public void setE15mAvg(BigDecimal e15mAvg) {
    this.e15mAvg = e15mAvg;
  }

  public BigDecimal getE30mAvg() {
    return e30mAvg;
  }

  public void setE30mAvg(BigDecimal e30mAvg) {
    this.e30mAvg = e30mAvg;
  }

  public BigDecimal getWindSpeed2mAvg() {
    return windSpeed2mAvg;
  }

  public void setWindSpeed2mAvg(BigDecimal windSpeed2mAvg) {
    this.windSpeed2mAvg = windSpeed2mAvg;
  }

  public BigDecimal getWindSpeed15mAvg() {
    return windSpeed15mAvg;
  }

  public void setWindSpeed15mAvg(BigDecimal windSpeed15mAvg) {
    this.windSpeed15mAvg = windSpeed15mAvg;
  }

  public BigDecimal getWindSpeed30mAvg() {
    return windSpeed30mAvg;
  }

  public void setWindSpeed30mAvg(BigDecimal windSpeed30mAvg) {
    this.windSpeed30mAvg = windSpeed30mAvg;
  }

  public BigDecimal getWindDirect30m() {
    return windDirect30m;
  }

  public void setWindDirect30m(BigDecimal windDirect30m) {
    this.windDirect30m = windDirect30m;
  }

  public BigDecimal getpAvg() {
    return pAvg;
  }

  public void setpAvg(BigDecimal pAvg) {
    this.pAvg = pAvg;
  }

  public BigDecimal getParDenAvg() {
    return parDenAvg;
  }

  public void setParDenAvg(BigDecimal parDenAvg) {
    this.parDenAvg = parDenAvg;
  }

  public BigDecimal getParTotTot() {
    return parTotTot;
  }

  public void setParTotTot(BigDecimal parTotTot) {
    this.parTotTot = parTotTot;
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

  public BigDecimal getDlrCoAvg() {
    return dlrCoAvg;
  }

  public void setDlrCoAvg(BigDecimal dlrCoAvg) {
    this.dlrCoAvg = dlrCoAvg;
  }

  public BigDecimal getUlrCoAvg() {
    return ulrCoAvg;
  }

  public void setUlrCoAvg(BigDecimal ulrCoAvg) {
    this.ulrCoAvg = ulrCoAvg;
  }

  public BigDecimal getRnSAvg() {
    return rnSAvg;
  }

  public void setRnSAvg(BigDecimal rnSAvg) {
    this.rnSAvg = rnSAvg;
  }

  public BigDecimal getRnLAvg() {
    return rnLAvg;
  }

  public void setRnLAvg(BigDecimal rnLAvg) {
    this.rnLAvg = rnLAvg;
  }

  public BigDecimal getAlbedoAvg() {
    return albedoAvg;
  }

  public void setAlbedoAvg(BigDecimal albedoAvg) {
    this.albedoAvg = albedoAvg;
  }

  public BigDecimal getTotRuAvg() {
    return totRuAvg;
  }

  public void setTotRuAvg(BigDecimal totRuAvg) {
    this.totRuAvg = totRuAvg;
  }

  public BigDecimal getTotRdAvg() {
    return totRdAvg;
  }

  public void setTotRdAvg(BigDecimal totRdAvg) {
    this.totRdAvg = totRdAvg;
  }

  public BigDecimal getTotRnAvg() {
    return totRnAvg;
  }

  public void setTotRnAvg(BigDecimal totRnAvg) {
    this.totRnAvg = totRnAvg;
  }

  public BigDecimal getNr01TcAvg() {
    return nr01TcAvg;
  }

  public void setNr01TcAvg(BigDecimal nr01TcAvg) {
    this.nr01TcAvg = nr01TcAvg;
  }

  public BigDecimal getNr01TkAvg() {
    return nr01TkAvg;
  }

  public void setNr01TkAvg(BigDecimal nr01TkAvg) {
    this.nr01TkAvg = nr01TkAvg;
  }

  public BigDecimal getRain2mTot() {
    return rain2mTot;
  }

  public void setRain2mTot(BigDecimal rain2mTot) {
    this.rain2mTot = rain2mTot;
  }

  public BigDecimal getRain30mTot() {
    return rain30mTot;
  }

  public void setRain30mTot(BigDecimal rain30mTot) {
    this.rain30mTot = rain30mTot;
  }

  public BigDecimal getSoilHum10cmAvg() {
    return soilHum10cmAvg;
  }

  public void setSoilHum10cmAvg(BigDecimal soilHum10cmAvg) {
    this.soilHum10cmAvg = soilHum10cmAvg;
  }

  public BigDecimal getSoilSalt10cmAvg() {
    return soilSalt10cmAvg;
  }

  public void setSoilSalt10cmAvg(BigDecimal soilSalt10cmAvg) {
    this.soilSalt10cmAvg = soilSalt10cmAvg;
  }

  public BigDecimal getSoilTemp10cmAvg() {
    return soilTemp10cmAvg;
  }

  public void setSoilTemp10cmAvg(BigDecimal soilTemp10cmAvg) {
    this.soilTemp10cmAvg = soilTemp10cmAvg;
  }

  public BigDecimal getSoilHum20cmAvg() {
    return soilHum20cmAvg;
  }

  public void setSoilHum20cmAvg(BigDecimal soilHum20cmAvg) {
    this.soilHum20cmAvg = soilHum20cmAvg;
  }

  public BigDecimal getSoilSalt20cmAvg() {
    return soilSalt20cmAvg;
  }

  public void setSoilSalt20cmAvg(BigDecimal soilSalt20cmAvg) {
    this.soilSalt20cmAvg = soilSalt20cmAvg;
  }

  public BigDecimal getSoilTemp20cmAvg() {
    return soilTemp20cmAvg;
  }

  public void setSoilTemp20cmAvg(BigDecimal soilTemp20cmAvg) {
    this.soilTemp20cmAvg = soilTemp20cmAvg;
  }

  public BigDecimal getSoilHum30cmAvg() {
    return soilHum30cmAvg;
  }

  public void setSoilHum30cmAvg(BigDecimal soilHum30cmAvg) {
    this.soilHum30cmAvg = soilHum30cmAvg;
  }

  public BigDecimal getSoilSalt30cmAvg() {
    return soilSalt30cmAvg;
  }

  public void setSoilSalt30cmAvg(BigDecimal soilSalt30cmAvg) {
    this.soilSalt30cmAvg = soilSalt30cmAvg;
  }

  public BigDecimal getSoilTemp30cmAvg() {
    return soilTemp30cmAvg;
  }

  public void setSoilTemp30cmAvg(BigDecimal soilTemp30cmAvg) {
    this.soilTemp30cmAvg = soilTemp30cmAvg;
  }

  public BigDecimal getSoilHum40cmAvg() {
    return soilHum40cmAvg;
  }

  public void setSoilHum40cmAvg(BigDecimal soilHum40cmAvg) {
    this.soilHum40cmAvg = soilHum40cmAvg;
  }

  public BigDecimal getSoilSalt40cmAvg() {
    return soilSalt40cmAvg;
  }

  public void setSoilSalt40cmAvg(BigDecimal soilSalt40cmAvg) {
    this.soilSalt40cmAvg = soilSalt40cmAvg;
  }

  public BigDecimal getSoilTemp40cmAvg() {
    return soilTemp40cmAvg;
  }

  public void setSoilTemp40cmAvg(BigDecimal soilTemp40cmAvg) {
    this.soilTemp40cmAvg = soilTemp40cmAvg;
  }

  public BigDecimal getSoilHum60cmAvg() {
    return soilHum60cmAvg;
  }

  public void setSoilHum60cmAvg(BigDecimal soilHum60cmAvg) {
    this.soilHum60cmAvg = soilHum60cmAvg;
  }

  public BigDecimal getSoilSalt60cmAvg() {
    return soilSalt60cmAvg;
  }

  public void setSoilSalt60cmAvg(BigDecimal soilSalt60cmAvg) {
    this.soilSalt60cmAvg = soilSalt60cmAvg;
  }

  public BigDecimal getSoilTemp60cmAvg() {
    return soilTemp60cmAvg;
  }

  public void setSoilTemp60cmAvg(BigDecimal soilTemp60cmAvg) {
    this.soilTemp60cmAvg = soilTemp60cmAvg;
  }

  public BigDecimal getSoilHum80cmAvg() {
    return soilHum80cmAvg;
  }

  public void setSoilHum80cmAvg(BigDecimal soilHum80cmAvg) {
    this.soilHum80cmAvg = soilHum80cmAvg;
  }

  public BigDecimal getSoilSalt80cmAvg() {
    return soilSalt80cmAvg;
  }

  public void setSoilSalt80cmAvg(BigDecimal soilSalt80cmAvg) {
    this.soilSalt80cmAvg = soilSalt80cmAvg;
  }

  public BigDecimal getSoilTemp80cmAvg() {
    return soilTemp80cmAvg;
  }

  public void setSoilTemp80cmAvg(BigDecimal soilTemp80cmAvg) {
    this.soilTemp80cmAvg = soilTemp80cmAvg;
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