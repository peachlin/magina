package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgHoboAutoStation;

public interface PlgHoboAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgHoboAutoStation record);

  int insertSelective(PlgHoboAutoStation record);

  PlgHoboAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgHoboAutoStation record);

  int updateByPrimaryKey(PlgHoboAutoStation record);
}