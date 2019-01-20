package com.zmsj.magina.dao;

import com.zmsj.magina.model.Metric;
import com.zmsj.magina.model.MetricData;

/**
 * @author wangk
 */
public interface MetricDataMapper {

  int deleteByPrimaryKey(String id);

  int insert(MetricData record);

  int insertSelective(MetricData record);

  Metric selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(MetricData record);

  int updateByPrimaryKey(MetricData record);
}