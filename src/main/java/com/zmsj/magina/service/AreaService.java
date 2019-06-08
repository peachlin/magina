package com.zmsj.magina.service;

import com.zmsj.magina.dao.AreaMapper;
import com.zmsj.magina.model.Area;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class AreaService {

  @Resource
  private AreaMapper areaMapper;

  public List<Area> listAreas() {

    return areaMapper.selectAll();
  }
}
