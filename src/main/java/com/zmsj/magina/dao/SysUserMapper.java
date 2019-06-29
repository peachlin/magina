package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysUser;

public interface SysUserMapper {

  int deleteByPrimaryKey(Long userId);

  int insert(SysUser record);

  int insertSelective(SysUser record);

  SysUser selectByPrimaryKey(Long userId);

  int updateByPrimaryKeySelective(SysUser record);

  int updateByPrimaryKey(SysUser record);
}