package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("用户")
public class User {

  private String id;

  private String userName;

  private String password;

  private String name;

  private String telphone;

  private Date modifyTime;
}