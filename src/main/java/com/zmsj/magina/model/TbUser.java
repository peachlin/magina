package com.zmsj.magina.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
@ApiModel("用户")
public class TbUser {

  @ApiModelProperty("用户ID")
  private Long userId;

  @ApiModelProperty("用户名")
  private String username;

  @ApiModelProperty("电话号码")
  private String mobile;

  @ApiModelProperty("密码")
  private String password;

  @ApiModelProperty("创建时间")
  private Date createTime;
}