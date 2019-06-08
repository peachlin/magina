package com.zmsj.magina.controller;

import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.User;
import com.zmsj.magina.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangk
 */
@Api(tags = {"用户相关接口"})
@RestController
@RequestMapping("/v1/user")
public class UserController {

  @Resource
  private UserService userService;

  @ApiOperation(value = "登录")
  @GetMapping("/login")
  public Response<User> login(@RequestParam("userName") @ApiParam("用户名") String userName,
      @RequestParam("password") @ApiParam("密码") String password) {

    User user = userService.login(userName, password);
    if (null != user) {
      user.setPassword(null);
      return Response.success(user);
    } else {
      return Response.fail("用户名或密码错误");
    }
  }

}
