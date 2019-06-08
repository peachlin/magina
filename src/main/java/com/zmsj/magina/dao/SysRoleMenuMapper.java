package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysRoleMenu;

public interface SysRoleMenuMapper {

  int deleteByPrimaryKey(Long id);

  int insert(SysRoleMenu record);

  int insertSelective(SysRoleMenu record);

  SysRoleMenu selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysRoleMenu record);

  int updateByPrimaryKey(SysRoleMenu record);
}