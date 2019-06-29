package com.zmsj.magina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.zmsj.magina.dao.BMonitorDeviceMapper;
import com.zmsj.magina.dao.BMonitoringStationMapper;
import com.zmsj.magina.dao.PlgBushAutoStationMapper;
import com.zmsj.magina.model.BMonitorDevice;
import com.zmsj.magina.model.BMonitoringStation;
import com.zmsj.magina.model.PlgBushAutoStation;
import com.zmsj.magina.model.mine.CollectorDataEnum;
import com.zmsj.magina.model.mine.DataDto;
import com.zmsj.magina.model.mine.EnumDataDto;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author wangk
 */
@Service
public class CollectorService {

  @Resource
  private BMonitorDeviceMapper collectorMapper;

  @Resource
  private PlgBushAutoStationMapper plgBushAutoStationMapper;

  @Resource
  private BMonitoringStationMapper stationMapper;

  public PageInfo<BMonitorDevice> listByAreaAndStationAndPage(Integer areaId, Integer stationId,
      String deviceName, String status, Integer pageNum, Integer pageSize) {

    List<Integer> stationIds = Lists.newArrayList();
    if (StringUtils.isEmpty(stationId) && !StringUtils.isEmpty(areaId)) {
      stationIds.addAll(stationMapper.selectByAreaId(areaId).stream().map(BMonitoringStation::getId)
          .collect(Collectors.toList()));
    }

    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
        () -> collectorMapper.listByStationIdsAndDeviceNameAndStatus(stationIds, deviceName, status));
  }

  public PageInfo<PlgBushAutoStation> listCollectDetail(Integer collectorId, Integer pageNum,
      Integer pageSize) {

    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
      plgBushAutoStationMapper.listAll();
    });
  }

  public List<EnumDataDto> listCollectorDataEnum(Integer collectorId) {

    return CollectorDataEnum.toList();
  }
}
