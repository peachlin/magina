package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysConfig;

public interface SysConfigMapper {

  int deleteByPrimaryKey(Long id);

  int insert(SysConfig record);

  int insertSelective(SysConfig record);

  SysConfig selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysConfig record);

  int updateByPrimaryKey(SysConfig record);
}