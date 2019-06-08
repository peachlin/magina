package com.zmsj.magina.controller;

import com.github.pagehelper.PageInfo;
import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.Collector;
import com.zmsj.magina.service.CollectorService;
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
@Api(tags = {"采集器相关接口"})
@RestController
@RequestMapping("/v1/collector")
public class CollectorController {

  @Resource
  private CollectorService collectorService;


  @ApiOperation(value = "根据区域和监测站分页查询采集器")
  @GetMapping("/list")
  public Response<PageInfo<Collector>> listByAreaAndPage(
      @RequestParam("areaId") @ApiParam("区域ID") String areaId,
      @RequestParam("stationId") @ApiParam("监测站ID") String stationId,
      @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("当前页码") Integer pageNum,
      @RequestParam(value = "pageSize", defaultValue = "10") @ApiParam("分页大小") Integer pageSize) {

    return Response.success(
        collectorService.listByAreaAndStationAndPage(areaId, stationId, pageNum, pageSize));
  }
}
