package com.zmsj.magina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.zmsj.magina.dao.CollectorMapper;
import com.zmsj.magina.dao.StationMapper;
import com.zmsj.magina.model.Collector;
import com.zmsj.magina.model.Station;
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
  private CollectorMapper collectorMapper;

  @Resource
  private StationMapper stationMapper;

  public PageInfo<Collector> listByAreaAndStationAndPage(String areaId, String stationId,
      Integer pageNum, Integer pageSize) {

    List<String> stationIds = Lists.newArrayList();
    if (!StringUtils.isEmpty(areaId)) {
      stationIds.addAll(stationMapper.listByArea(areaId).stream().map(Station::getId)
          .collect(Collectors.toList()));
    }
    if (!StringUtils.isEmpty(stationId)) {
      stationIds.add(stationId);
    }
    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
        () -> collectorMapper.listByStationIds(stationIds));
  }
}
