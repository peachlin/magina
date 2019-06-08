package com.zmsj.magina.dao;

import com.zmsj.magina.model.Collector;
import java.util.List;

/**
 * @author wangk
 */
public interface CollectorMapper {

  int deleteByPrimaryKey(String id);

  int insert(Collector record);

  int insertSelective(Collector record);

  Collector selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Collector record);

  int updateByPrimaryKey(Collector record);

  List<Collector> listByStationIds(List<String> stationIds);
}