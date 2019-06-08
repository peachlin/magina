package com.zmsj.magina.dao;

import com.zmsj.magina.model.TbUser;

/**
 * @author wangk
 */
public interface TbUserMapper {

  int deleteByPrimaryKey(Long userId);

  int insert(TbUser record);

  int insertSelective(TbUser record);

  TbUser selectByPrimaryKey(Long userId);

  int updateByPrimaryKeySelective(TbUser record);

  int updateByPrimaryKey(TbUser record);

  TbUser selectByUserNameAndPwd(String userName, String password);
}