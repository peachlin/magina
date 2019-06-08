package com.zmsj.magina.dao;

import com.zmsj.magina.model.BMonitorDevice;

public interface BMonitorDeviceMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BMonitorDevice record);

  int insertSelective(BMonitorDevice record);

  BMonitorDevice selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BMonitorDevice record);

  int updateByPrimaryKey(BMonitorDevice record);
}