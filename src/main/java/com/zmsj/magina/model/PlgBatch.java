package com.zmsj.magina.model;

import java.util.Date;

public class PlgBatch {

  private String id;

  private Date timePoint;

  private String frequency;

  private Integer type;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public Date getTimePoint() {
    return timePoint;
  }

  public void setTimePoint(Date timePoint) {
    this.timePoint = timePoint;
  }

  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency == null ? null : frequency.trim();
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }
}