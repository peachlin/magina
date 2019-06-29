package com.zmsj.magina.service;

import com.zmsj.magina.dao.TbUserMapper;
import com.zmsj.magina.model.TbUser;
import javax.annotation.Resource;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class UserService {

  @Resource
  private TbUserMapper userMapper;

  public TbUser login(@NonNull String userName, @NonNull String password) {

    return userMapper.selectByUserNameAndPwd(userName, password);
  }
}
