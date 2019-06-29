package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysLog;

public interface SysLogMapper {

  int deleteByPrimaryKey(Long id);

  int insert(SysLog record);

  int insertSelective(SysLog record);

  SysLog selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysLog record);

  int updateByPrimaryKey(SysLog record);
}