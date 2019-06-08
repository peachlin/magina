package com.zmsj.magina.dao;

import com.zmsj.magina.model.Camera;

/**
 * @author wangk
 */
public interface CameraMapper {

  int deleteByPrimaryKey(String id);

  int insert(Camera record);

  int insertSelective(Camera record);

  Camera selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Camera record);

  int updateByPrimaryKey(Camera record);
}