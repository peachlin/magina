package com.zmsj.magina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmsj.magina.dao.BMonitoringStationMapper;
import com.zmsj.magina.model.BMonitoringStation;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class StationService {

  @Resource
  private BMonitoringStationMapper stationMapper;

  public PageInfo<BMonitoringStation> listByAreaAndPage(Integer areaId, Integer pageNum,
      Integer pageSize) {

    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
        () -> stationMapper.selectByAreaId(areaId));
  }
}
