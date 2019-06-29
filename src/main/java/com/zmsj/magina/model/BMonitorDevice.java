package com.zmsj.magina.model;

import java.util.Date;

public class BMonitorDevice {

  private Integer id;

  private String deviceName;

  private String deviceCode;

  private Integer monitoringStationId;

  private Double longitude;

  private Double latitude;

  private String status;

  private String manufacturer;

  private String manufacturerChargeName;

  private String manufacturerChargeContact;

  private Integer frequency;

  private Date createTime;

  private Integer createUser;

  private Date updateTime;

  private Integer updateUser;

  private String isCamera;

  private String cameraIp;

  private String carmeraProt;

  private String carmeraName;

  private String carmeraPassword;

  private String iconName;

  private String iconUrl;

  private String remark;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName == null ? null : deviceName.trim();
  }

  public String getDeviceCode() {
    return deviceCode;
  }

  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode == null ? null : deviceCode.trim();
  }

  public Integer getMonitoringStationId() {
    return monitoringStationId;
  }

  public void setMonitoringStationId(Integer monitoringStationId) {
    this.monitoringStationId = monitoringStationId;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status == null ? null : status.trim();
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer == null ? null : manufacturer.trim();
  }

  public String getManufacturerChargeName() {
    return manufacturerChargeName;
  }

  public void setManufacturerChargeName(String manufacturerChargeName) {
    this.manufacturerChargeName = manufacturerChargeName == null ? null : manufacturerChargeName.trim();
  }

  public String getManufacturerChargeContact() {
    return manufacturerChargeContact;
  }

  public void setManufacturerChargeContact(String manufacturerChargeContact) {
    this.manufacturerChargeContact =
        manufacturerChargeContact == null ? null : manufacturerChargeContact.trim();
  }

  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getCreateUser() {
    return createUser;
  }

  public void setCreateUser(Integer createUser) {
    this.createUser = createUser;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(Integer updateUser) {
    this.updateUser = updateUser;
  }

  public String getIsCamera() {
    return isCamera;
  }

  public void setIsCamera(String isCamera) {
    this.isCamera = isCamera == null ? null : isCamera.trim();
  }

  public String getCameraIp() {
    return cameraIp;
  }

  public void setCameraIp(String cameraIp) {
    this.cameraIp = cameraIp == null ? null : cameraIp.trim();
  }

  public String getCarmeraProt() {
    return carmeraProt;
  }

  public void setCarmeraProt(String carmeraProt) {
    this.carmeraProt = carmeraProt == null ? null : carmeraProt.trim();
  }

  public String getCarmeraName() {
    return carmeraName;
  }

  public void setCarmeraName(String carmeraName) {
    this.carmeraName = carmeraName == null ? null : carmeraName.trim();
  }

  public String getCarmeraPassword() {
    return carmeraPassword;
  }

  public void setCarmeraPassword(String carmeraPassword) {
    this.carmeraPassword = carmeraPassword == null ? null : carmeraPassword.trim();
  }

  public String getIconName() {
    return iconName;
  }

  public void setIconName(String iconName) {
    this.iconName = iconName == null ? null : iconName.trim();
  }

  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl == null ? null : iconUrl.trim();
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark == null ? null : remark.trim();
  }
}