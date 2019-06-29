package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgDykAutoStation;

public interface PlgDykAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgDykAutoStation record);

  int insertSelective(PlgDykAutoStation record);

  PlgDykAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgDykAutoStation record);

  int updateByPrimaryKey(PlgDykAutoStation record);

  PlgDykAutoStation selectLastest();
}