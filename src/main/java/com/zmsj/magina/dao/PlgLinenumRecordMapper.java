package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgLinenumRecord;

public interface PlgLinenumRecordMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgLinenumRecord record);

  int insertSelective(PlgLinenumRecord record);

  PlgLinenumRecord selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgLinenumRecord record);

  int updateByPrimaryKey(PlgLinenumRecord record);
}