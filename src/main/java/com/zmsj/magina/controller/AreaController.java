package com.zmsj.magina.controller;

import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.Area;
import com.zmsj.magina.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangk
 */
@Api(tags = {"区域相关接口"})
@RestController
@RequestMapping("/v1/area")
public class AreaController {

  @Resource
  private AreaService areaService;

  @ApiOperation(value = "获取所有区域")
  @GetMapping("/list")
  public Response<List<Area>> listAreas() {

    return Response.success(areaService.listAreas());
  }

}
