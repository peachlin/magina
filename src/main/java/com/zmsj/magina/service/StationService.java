package com.zmsj.magina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmsj.magina.dao.StationMapper;
import com.zmsj.magina.model.Station;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class StationService {

  @Resource
  private StationMapper stationMapper;

  public PageInfo<Station> listByAreaAndPage(String areaId, Integer pageNum,
      Integer pageSize) {

    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
        () -> stationMapper.listByArea(areaId));
  }
}
