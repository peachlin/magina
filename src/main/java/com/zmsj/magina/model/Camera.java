package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("摄像头")
public class Camera {

  private String id;

  private String alias;

  private String stationId;

  private String name;

  private String model;

  private String location;

  private String status;

  private String ip;

  private String port;

  private String loginName;

  private String loginPwd;

  private String chargeName;

  private String chargeTel;

  private String remark;

  private Date modifyTime;
}