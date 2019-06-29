package com.zmsj.magina.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlgFluxSystem {

  private String id;

  private String collectorid;

  private Date createTime;

  private BigDecimal collectFrequency;

  private String timestamp;

  private BigDecimal record;

  private BigDecimal fcMolar;

  private BigDecimal fcMass;

  private BigDecimal fcQcGrade;

  private BigDecimal fcSamplesTot;

  private BigDecimal le;

  private BigDecimal leQcGrade;

  private BigDecimal leSamplesTot;

  private BigDecimal h;

  private BigDecimal hQcGrade;

  private BigDecimal hSamplesTot;

  private BigDecimal bowenRatio;

  private BigDecimal tau;

  private BigDecimal tauQcGrade;

  private BigDecimal uStar;

  private BigDecimal tStar;

  private BigDecimal tke;

  private BigDecimal tcAvg;

  private BigDecimal tdAvg;

  private BigDecimal rhAvg;

  private BigDecimal eSatAvg;

  private BigDecimal eAvg;

  private BigDecimal ambPressAvg;

  private BigDecimal vpdAir;

  private BigDecimal uxAvg;

  private BigDecimal uxStd;

  private BigDecimal uyAvg;

  private BigDecimal uyStd;

  private BigDecimal uzAvg;

  private BigDecimal uzStd;

  private BigDecimal tsAvg;

  private BigDecimal tsStd;

  private BigDecimal sonicAzimuth;

  private BigDecimal wndSpd;

  private BigDecimal rsltWndSpd;

  private BigDecimal wndDirSonic;

  private BigDecimal stdWndDir;

  private BigDecimal wndDirCompass;

  private BigDecimal co2MolfracAvg;

  private BigDecimal co2MixratioAvg;

  private BigDecimal co2Avg;

  private BigDecimal co2Std;

  private BigDecimal h2oMolfracAvg;

  private BigDecimal h2oMixratioAvg;

  private BigDecimal h2oAvg;

  private BigDecimal h2oStd;

  private BigDecimal upwndDistIntrst;

  private BigDecimal fpDistIntrst;

  private BigDecimal fpMax;

  private BigDecimal fp40;

  private BigDecimal fp55;

  private BigDecimal fp90;

  private BigDecimal fpEquation;

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

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp == null ? null : timestamp.trim();
  }

  public BigDecimal getRecord() {
    return record;
  }

  public void setRecord(BigDecimal record) {
    this.record = record;
  }

  public BigDecimal getFcMolar() {
    return fcMolar;
  }

  public void setFcMolar(BigDecimal fcMolar) {
    this.fcMolar = fcMolar;
  }

  public BigDecimal getFcMass() {
    return fcMass;
  }

  public void setFcMass(BigDecimal fcMass) {
    this.fcMass = fcMass;
  }

  public BigDecimal getFcQcGrade() {
    return fcQcGrade;
  }

  public void setFcQcGrade(BigDecimal fcQcGrade) {
    this.fcQcGrade = fcQcGrade;
  }

  public BigDecimal getFcSamplesTot() {
    return fcSamplesTot;
  }

  public void setFcSamplesTot(BigDecimal fcSamplesTot) {
    this.fcSamplesTot = fcSamplesTot;
  }

  public BigDecimal getLe() {
    return le;
  }

  public void setLe(BigDecimal le) {
    this.le = le;
  }

  public BigDecimal getLeQcGrade() {
    return leQcGrade;
  }

  public void setLeQcGrade(BigDecimal leQcGrade) {
    this.leQcGrade = leQcGrade;
  }

  public BigDecimal getLeSamplesTot() {
    return leSamplesTot;
  }

  public void setLeSamplesTot(BigDecimal leSamplesTot) {
    this.leSamplesTot = leSamplesTot;
  }

  public BigDecimal getH() {
    return h;
  }

  public void setH(BigDecimal h) {
    this.h = h;
  }

  public BigDecimal gethQcGrade() {
    return hQcGrade;
  }

  public void sethQcGrade(BigDecimal hQcGrade) {
    this.hQcGrade = hQcGrade;
  }

  public BigDecimal gethSamplesTot() {
    return hSamplesTot;
  }

  public void sethSamplesTot(BigDecimal hSamplesTot) {
    this.hSamplesTot = hSamplesTot;
  }

  public BigDecimal getBowenRatio() {
    return bowenRatio;
  }

  public void setBowenRatio(BigDecimal bowenRatio) {
    this.bowenRatio = bowenRatio;
  }

  public BigDecimal getTau() {
    return tau;
  }

  public void setTau(BigDecimal tau) {
    this.tau = tau;
  }

  public BigDecimal getTauQcGrade() {
    return tauQcGrade;
  }

  public void setTauQcGrade(BigDecimal tauQcGrade) {
    this.tauQcGrade = tauQcGrade;
  }

  public BigDecimal getuStar() {
    return uStar;
  }

  public void setuStar(BigDecimal uStar) {
    this.uStar = uStar;
  }

  public BigDecimal gettStar() {
    return tStar;
  }

  public void settStar(BigDecimal tStar) {
    this.tStar = tStar;
  }

  public BigDecimal getTke() {
    return tke;
  }

  public void setTke(BigDecimal tke) {
    this.tke = tke;
  }

  public BigDecimal getTcAvg() {
    return tcAvg;
  }

  public void setTcAvg(BigDecimal tcAvg) {
    this.tcAvg = tcAvg;
  }

  public BigDecimal getTdAvg() {
    return tdAvg;
  }

  public void setTdAvg(BigDecimal tdAvg) {
    this.tdAvg = tdAvg;
  }

  public BigDecimal getRhAvg() {
    return rhAvg;
  }

  public void setRhAvg(BigDecimal rhAvg) {
    this.rhAvg = rhAvg;
  }

  public BigDecimal geteSatAvg() {
    return eSatAvg;
  }

  public void seteSatAvg(BigDecimal eSatAvg) {
    this.eSatAvg = eSatAvg;
  }

  public BigDecimal geteAvg() {
    return eAvg;
  }

  public void seteAvg(BigDecimal eAvg) {
    this.eAvg = eAvg;
  }

  public BigDecimal getAmbPressAvg() {
    return ambPressAvg;
  }

  public void setAmbPressAvg(BigDecimal ambPressAvg) {
    this.ambPressAvg = ambPressAvg;
  }

  public BigDecimal getVpdAir() {
    return vpdAir;
  }

  public void setVpdAir(BigDecimal vpdAir) {
    this.vpdAir = vpdAir;
  }

  public BigDecimal getUxAvg() {
    return uxAvg;
  }

  public void setUxAvg(BigDecimal uxAvg) {
    this.uxAvg = uxAvg;
  }

  public BigDecimal getUxStd() {
    return uxStd;
  }

  public void setUxStd(BigDecimal uxStd) {
    this.uxStd = uxStd;
  }

  public BigDecimal getUyAvg() {
    return uyAvg;
  }

  public void setUyAvg(BigDecimal uyAvg) {
    this.uyAvg = uyAvg;
  }

  public BigDecimal getUyStd() {
    return uyStd;
  }

  public void setUyStd(BigDecimal uyStd) {
    this.uyStd = uyStd;
  }

  public BigDecimal getUzAvg() {
    return uzAvg;
  }

  public void setUzAvg(BigDecimal uzAvg) {
    this.uzAvg = uzAvg;
  }

  public BigDecimal getUzStd() {
    return uzStd;
  }

  public void setUzStd(BigDecimal uzStd) {
    this.uzStd = uzStd;
  }

  public BigDecimal getTsAvg() {
    return tsAvg;
  }

  public void setTsAvg(BigDecimal tsAvg) {
    this.tsAvg = tsAvg;
  }

  public BigDecimal getTsStd() {
    return tsStd;
  }

  public void setTsStd(BigDecimal tsStd) {
    this.tsStd = tsStd;
  }

  public BigDecimal getSonicAzimuth() {
    return sonicAzimuth;
  }

  public void setSonicAzimuth(BigDecimal sonicAzimuth) {
    this.sonicAzimuth = sonicAzimuth;
  }

  public BigDecimal getWndSpd() {
    return wndSpd;
  }

  public void setWndSpd(BigDecimal wndSpd) {
    this.wndSpd = wndSpd;
  }

  public BigDecimal getRsltWndSpd() {
    return rsltWndSpd;
  }

  public void setRsltWndSpd(BigDecimal rsltWndSpd) {
    this.rsltWndSpd = rsltWndSpd;
  }

  public BigDecimal getWndDirSonic() {
    return wndDirSonic;
  }

  public void setWndDirSonic(BigDecimal wndDirSonic) {
    this.wndDirSonic = wndDirSonic;
  }

  public BigDecimal getStdWndDir() {
    return stdWndDir;
  }

  public void setStdWndDir(BigDecimal stdWndDir) {
    this.stdWndDir = stdWndDir;
  }

  public BigDecimal getWndDirCompass() {
    return wndDirCompass;
  }

  public void setWndDirCompass(BigDecimal wndDirCompass) {
    this.wndDirCompass = wndDirCompass;
  }

  public BigDecimal getCo2MolfracAvg() {
    return co2MolfracAvg;
  }

  public void setCo2MolfracAvg(BigDecimal co2MolfracAvg) {
    this.co2MolfracAvg = co2MolfracAvg;
  }

  public BigDecimal getCo2MixratioAvg() {
    return co2MixratioAvg;
  }

  public void setCo2MixratioAvg(BigDecimal co2MixratioAvg) {
    this.co2MixratioAvg = co2MixratioAvg;
  }

  public BigDecimal getCo2Avg() {
    return co2Avg;
  }

  public void setCo2Avg(BigDecimal co2Avg) {
    this.co2Avg = co2Avg;
  }

  public BigDecimal getCo2Std() {
    return co2Std;
  }

  public void setCo2Std(BigDecimal co2Std) {
    this.co2Std = co2Std;
  }

  public BigDecimal getH2oMolfracAvg() {
    return h2oMolfracAvg;
  }

  public void setH2oMolfracAvg(BigDecimal h2oMolfracAvg) {
    this.h2oMolfracAvg = h2oMolfracAvg;
  }

  public BigDecimal getH2oMixratioAvg() {
    return h2oMixratioAvg;
  }

  public void setH2oMixratioAvg(BigDecimal h2oMixratioAvg) {
    this.h2oMixratioAvg = h2oMixratioAvg;
  }

  public BigDecimal getH2oAvg() {
    return h2oAvg;
  }

  public void setH2oAvg(BigDecimal h2oAvg) {
    this.h2oAvg = h2oAvg;
  }

  public BigDecimal getH2oStd() {
    return h2oStd;
  }

  public void setH2oStd(BigDecimal h2oStd) {
    this.h2oStd = h2oStd;
  }

  public BigDecimal getUpwndDistIntrst() {
    return upwndDistIntrst;
  }

  public void setUpwndDistIntrst(BigDecimal upwndDistIntrst) {
    this.upwndDistIntrst = upwndDistIntrst;
  }

  public BigDecimal getFpDistIntrst() {
    return fpDistIntrst;
  }

  public void setFpDistIntrst(BigDecimal fpDistIntrst) {
    this.fpDistIntrst = fpDistIntrst;
  }

  public BigDecimal getFpMax() {
    return fpMax;
  }

  public void setFpMax(BigDecimal fpMax) {
    this.fpMax = fpMax;
  }

  public BigDecimal getFp40() {
    return fp40;
  }

  public void setFp40(BigDecimal fp40) {
    this.fp40 = fp40;
  }

  public BigDecimal getFp55() {
    return fp55;
  }

  public void setFp55(BigDecimal fp55) {
    this.fp55 = fp55;
  }

  public BigDecimal getFp90() {
    return fp90;
  }

  public void setFp90(BigDecimal fp90) {
    this.fp90 = fp90;
  }

  public BigDecimal getFpEquation() {
    return fpEquation;
  }

  public void setFpEquation(BigDecimal fpEquation) {
    this.fpEquation = fpEquation;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }
}