package com.zmsj.magina.dao;

import com.zmsj.magina.model.ScheduleJob;

public interface ScheduleJobMapper {

  int deleteByPrimaryKey(Long jobId);

  int insert(ScheduleJob record);

  int insertSelective(ScheduleJob record);

  ScheduleJob selectByPrimaryKey(Long jobId);

  int updateByPrimaryKeySelective(ScheduleJob record);

  int updateByPrimaryKey(ScheduleJob record);
}