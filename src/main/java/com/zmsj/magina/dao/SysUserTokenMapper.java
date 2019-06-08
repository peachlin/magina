package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysUserToken;

public interface SysUserTokenMapper {

  int deleteByPrimaryKey(Long userId);

  int insert(SysUserToken record);

  int insertSelective(SysUserToken record);

  SysUserToken selectByPrimaryKey(Long userId);

  int updateByPrimaryKeySelective(SysUserToken record);

  int updateByPrimaryKey(SysUserToken record);
}