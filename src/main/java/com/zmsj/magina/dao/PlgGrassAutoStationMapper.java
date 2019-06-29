package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgGrassAutoStation;

public interface PlgGrassAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgGrassAutoStation record);

  int insertSelective(PlgGrassAutoStation record);

  PlgGrassAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgGrassAutoStation record);

  int updateByPrimaryKey(PlgGrassAutoStation record);
}