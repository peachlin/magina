package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

@Data
public class TbUser {

  private Long userId;

  private String username;

  private String name;

  private String mobile;

  private String password;

  private Date createTime;
}