package com.zmsj.magina.service;

import com.zmsj.magina.dao.BAreaMapper;
import com.zmsj.magina.model.BArea;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class AreaService {

  @Resource
  private BAreaMapper areaMapper;

  public List<BArea> listAreas() {
    return areaMapper.selectAll();
  }
}
