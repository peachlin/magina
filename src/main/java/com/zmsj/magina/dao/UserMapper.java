package com.zmsj.magina.dao;

import com.zmsj.magina.model.User;

/**
 * @author wangk
 */
public interface UserMapper {

  int deleteByPrimaryKey(String id);

  int insert(User record);

  int insertSelective(User record);

  User selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);

  User selectByUserNameAndPwd(String userName, String password);
}