package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysRole;

public interface SysRoleMapper {

  int deleteByPrimaryKey(Long roleId);

  int insert(SysRole record);

  int insertSelective(SysRole record);

  SysRole selectByPrimaryKey(Long roleId);

  int updateByPrimaryKeySelective(SysRole record);

  int updateByPrimaryKey(SysRole record);
}