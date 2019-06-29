package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgGradeAutoStation;
import java.util.Date;

public interface PlgGradeAutoStationMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgGradeAutoStation record);

  int insertSelective(PlgGradeAutoStation record);

  PlgGradeAutoStation selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgGradeAutoStation record);

  int updateByPrimaryKey(PlgGradeAutoStation record);

  PlgGradeAutoStation selectOneByDay(Date day);
}