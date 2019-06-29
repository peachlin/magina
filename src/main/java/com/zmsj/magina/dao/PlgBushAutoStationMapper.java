package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgBushAutoStation;
import java.util.Date;
import java.util.List;

public interface PlgBushAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgBushAutoStation record);

  int insertSelective(PlgBushAutoStation record);

  PlgBushAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgBushAutoStation record);

  int updateByPrimaryKey(PlgBushAutoStation record);

  PlgBushAutoStation selectLastest();

  PlgBushAutoStation selectByTimeRange(Date startTime, Date endTime);

  List<PlgBushAutoStation> listAll();
}