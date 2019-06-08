package com.zmsj.magina.dao;

import com.zmsj.magina.model.Metric;

/**
 * @author wangk
 */
public interface MetricMapper {

  int deleteByPrimaryKey(String id);

  int insert(Metric record);

  int insertSelective(Metric record);

  Metric selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Metric record);

  int updateByPrimaryKey(Metric record);
}