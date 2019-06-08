package com.zmsj.magina.dao;

import com.zmsj.magina.model.MonitorData;

/**
 * @author wangk
 */
public interface MonitorDataMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(MonitorData record);

  int insertSelective(MonitorData record);

  MonitorData selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(MonitorData record);

  int updateByPrimaryKey(MonitorData record);
}