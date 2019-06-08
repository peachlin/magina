package com.zmsj.magina.dao;

import com.zmsj.magina.model.BArea;
import java.util.List;

/**
 * @author wangk
 */
public interface BAreaMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BArea record);

  int insertSelective(BArea record);

  BArea selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BArea record);

  int updateByPrimaryKey(BArea record);

  List<BArea> selectAll();
}