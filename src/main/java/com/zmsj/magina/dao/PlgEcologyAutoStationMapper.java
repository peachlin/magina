package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgEcologyAutoStation;

public interface PlgEcologyAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgEcologyAutoStation record);

  int insertSelective(PlgEcologyAutoStation record);

  PlgEcologyAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgEcologyAutoStation record);

  int updateByPrimaryKey(PlgEcologyAutoStation record);

  PlgEcologyAutoStation selectLastest();
}