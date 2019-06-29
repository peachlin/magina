package com.zmsj.magina.dao;

import com.zmsj.magina.model.ScheduleJobLog;

public interface ScheduleJobLogMapper {

  int deleteByPrimaryKey(Long logId);

  int insert(ScheduleJobLog record);

  int insertSelective(ScheduleJobLog record);

  ScheduleJobLog selectByPrimaryKey(Long logId);

  int updateByPrimaryKeySelective(ScheduleJobLog record);

  int updateByPrimaryKey(ScheduleJobLog record);
}