package com.zmsj.magina.dao;

import com.zmsj.magina.model.BCollectionTerm;

/**
 * @author wangk
 */
public interface BCollectionTermMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BCollectionTerm record);

  int insertSelective(BCollectionTerm record);

  BCollectionTerm selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BCollectionTerm record);

  int updateByPrimaryKey(BCollectionTerm record);
}