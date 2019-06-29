package com.zmsj.magina.dao;

import com.zmsj.magina.model.PlgVapourProfile;

public interface PlgVapourProfileMapper {

  int deleteByPrimaryKey(String id);

  int insert(PlgVapourProfile record);

  int insertSelective(PlgVapourProfile record);

  PlgVapourProfile selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(PlgVapourProfile record);

  int updateByPrimaryKey(PlgVapourProfile record);
}