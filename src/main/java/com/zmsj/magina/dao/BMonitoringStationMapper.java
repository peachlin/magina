package com.zmsj.magina.dao;

import com.zmsj.magina.model.BMonitoringStation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BMonitoringStationMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BMonitoringStation record);

  int insertSelective(BMonitoringStation record);

  BMonitoringStation selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BMonitoringStation record);

  int updateByPrimaryKeyWithBLOBs(BMonitoringStation record);

  int updateByPrimaryKey(BMonitoringStation record);

  List<BMonitoringStation> listAll();

  List<BMonitoringStation> selectByAreaId(@Param("areaId") Integer areaId);
}