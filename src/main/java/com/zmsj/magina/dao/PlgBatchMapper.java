package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgBatch;

public interface PlgBatchMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgBatch record);

  int insertSelective(PlgBatch record);

  PlgBatch selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgBatch record);

  int updateByPrimaryKey(PlgBatch record);
}