package com.zmsj.magina.dao;

import com.zmsj.magina.model.Area;
import java.util.List;

public interface AreaMapper {

  int deleteByPrimaryKey(String id);

  int insert(Area record);

  int insertSelective(Area record);

  Area selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Area record);

  int updateByPrimaryKey(Area record);

  List<Area> selectAll();
}