package com.zmsj.magina.dao;

import com.zmsj.magina.model.Station;
import java.util.List;

/**
 * @author wangk
 */
public interface StationMapper {

  int deleteByPrimaryKey(String id);

  int insert(Station record);

  int insertSelective(Station record);

  Station selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Station record);

  int updateByPrimaryKey(Station record);

  List<Station> listByArea(String areaId);
}