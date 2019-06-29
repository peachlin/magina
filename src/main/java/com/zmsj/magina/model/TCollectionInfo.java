package com.zmsj.magina.model;

import java.util.Date;

public class TCollectionInfo {

  private Integer id;

  private Integer monitorDataId;

  private Date collectionTime;

  private Integer collectionTermId;

  private String collectionValue;

  private String unit;

  private String minValue;

  private String maxValue;

  private String variableName;

  private String collectionTermName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMonitorDataId() {
    return monitorDataId;
  }

  public void setMonitorDataId(Integer monitorDataId) {
    this.monitorDataId = monitorDataId;
  }

  public Date getCollectionTime() {
    return collectionTime;
  }

  public void setCollectionTime(Date collectionTime) {
    this.collectionTime = collectionTime;
  }

  public Integer getCollectionTermId() {
    return collectionTermId;
  }

  public void setCollectionTermId(Integer collectionTermId) {
    this.collectionTermId = collectionTermId;
  }

  public String getCollectionValue() {
    return collectionValue;
  }

  public void setCollectionValue(String collectionValue) {
    this.collectionValue = collectionValue == null ? null : collectionValue.trim();
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit == null ? null : unit.trim();
  }

  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue == null ? null : minValue.trim();
  }

  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue == null ? null : maxValue.trim();
  }

  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName == null ? null : variableName.trim();
  }

  public String getCollectionTermName() {
    return collectionTermName;
  }

  public void setCollectionTermName(String collectionTermName) {
    this.collectionTermName = collectionTermName == null ? null : collectionTermName.trim();
  }
}