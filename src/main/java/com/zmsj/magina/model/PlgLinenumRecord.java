package com.zmsj.magina.model;

import java.util.Date;

public class PlgLinenumRecord {

  private String id;

  private Integer linenum;

  private String fileName;

  private Date readTime;

  private Integer fileType;

  private Integer plgType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public Integer getLinenum() {
    return linenum;
  }

  public void setLinenum(Integer linenum) {
    this.linenum = linenum;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName == null ? null : fileName.trim();
  }

  public Date getReadTime() {
    return readTime;
  }

  public void setReadTime(Date readTime) {
    this.readTime = readTime;
  }

  public Integer getFileType() {
    return fileType;
  }

  public void setFileType(Integer fileType) {
    this.fileType = fileType;
  }

  public Integer getPlgType() {
    return plgType;
  }

  public void setPlgType(Integer plgType) {
    this.plgType = plgType;
  }
}