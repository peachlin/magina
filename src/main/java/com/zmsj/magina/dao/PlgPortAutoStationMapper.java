package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgPortAutoStation;

public interface PlgPortAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgPortAutoStation record);

  int insertSelective(PlgPortAutoStation record);

  PlgPortAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgPortAutoStation record);

  int updateByPrimaryKey(PlgPortAutoStation record);
}