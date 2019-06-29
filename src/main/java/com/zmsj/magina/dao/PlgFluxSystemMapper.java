package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgFluxSystem;

public interface PlgFluxSystemMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgFluxSystem record);

  int insertSelective(PlgFluxSystem record);

  PlgFluxSystem selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgFluxSystem record);

  int updateByPrimaryKey(PlgFluxSystem record);
}