package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
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
}