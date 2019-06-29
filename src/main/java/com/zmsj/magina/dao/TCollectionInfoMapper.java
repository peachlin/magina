package com.zmsj.magina.dao;

import com.zmsj.magina.model.TCollectionInfo;

public interface TCollectionInfoMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(TCollectionInfo record);

  int insertSelective(TCollectionInfo record);

  TCollectionInfo selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(TCollectionInfo record);

  int updateByPrimaryKey(TCollectionInfo record);
}