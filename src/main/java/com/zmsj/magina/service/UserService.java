package com.zmsj.magina.service;

import com.zmsj.magina.dao.UserMapper;
import com.zmsj.magina.model.User;
import javax.annotation.Resource;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class UserService {

  @Resource
  private UserMapper userMapper;

  public User login(@NonNull String userName, @NonNull String password) {

    return userMapper.selectByUserNameAndPwd(userName, password);
  }
}
