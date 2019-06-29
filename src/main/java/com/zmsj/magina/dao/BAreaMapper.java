package com.zmsj.magina.dao;

import com.zmsj.magina.model.BArea;
import com.zmsj.magina.model.BAreaWithBLOBs;
import java.util.List;

public interface BAreaMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(BAreaWithBLOBs record);

  int insertSelective(BAreaWithBLOBs record);

  BAreaWithBLOBs selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(BAreaWithBLOBs record);

  int updateByPrimaryKeyWithBLOBs(BAreaWithBLOBs record);

  int updateByPrimaryKey(BArea record);

  List<BArea> listAll();
}