package com.zmsj.magina.controller;

import com.github.pagehelper.PageInfo;
import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.BMonitoringStation;
import com.zmsj.magina.service.StationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangk
 */
@Api(tags = {"监测站相关接口"})
@RestController
@RequestMapping("/v1/station")
public class StationController {

  @Resource
  private StationService stationService;


  @ApiOperation(value = "根据区域分页查询监测站")
  @GetMapping("/list")
  public Response<PageInfo<BMonitoringStation>> listByAreaAndPage(
      @RequestParam("areaId") @ApiParam("区域编码") Integer areaId,
      @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("当前页码") Integer pageNum,
      @RequestParam(value = "pageSize", defaultValue = "10") @ApiParam("分页大小") Integer pageSize) {

    return Response.success(stationService.listByAreaAndPage(areaId, pageNum, pageSize));
  }

}
