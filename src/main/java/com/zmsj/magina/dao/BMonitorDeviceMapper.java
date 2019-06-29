package com.zmsj.magina.dao;

import com.zmsj.magina.model.BMonitorDevice;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BMonitorDeviceMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BMonitorDevice record);

  int insertSelective(BMonitorDevice record);

  BMonitorDevice selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BMonitorDevice record);

  int updateByPrimaryKeyWithBLOBs(BMonitorDevice record);

  int updateByPrimaryKey(BMonitorDevice record);

  List<BMonitorDevice> listByStationIds(@Param("stationIds") List<Integer> stationIds);

  List<BMonitorDevice> listAll();

  List<BMonitorDevice> listByStationIdsAndDeviceNameAndStatus(List<Integer> stationIds, String deviceName,
      String status);
}