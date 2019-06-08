package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class MonitorData {

  private Integer id;

  private Integer areaId;

  private String areaName;

  private String monitorDeviceName;

  private Integer monitorDeviceId;

  private Date monitorDate;
}