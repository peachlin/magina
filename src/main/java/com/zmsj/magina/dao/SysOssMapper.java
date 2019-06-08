package com.zmsj.magina.dao;

import com.zmsj.magina.model.SysOss;

public interface SysOssMapper {

  int deleteByPrimaryKey(Long id);

  int insert(SysOss record);

  int insertSelective(SysOss record);

  SysOss selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(SysOss record);

  int updateByPrimaryKey(SysOss record);
}