package com.zmsj.magina.controller;

import com.github.pagehelper.PageInfo;
import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.BMonitorDevice;
import com.zmsj.magina.model.PlgBushAutoStation;
import com.zmsj.magina.model.mine.EnumDataDto;
import com.zmsj.magina.service.CollectorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangk
 */
@CrossOrigin
@Api(tags = {"采集器相关接口"})
@RestController
@RequestMapping("/v1/collector")
public class CollectorController {

  @Resource
  private CollectorService collectorService;


  @ApiOperation(value = "根据参数分页查询采集器")
  @GetMapping("/list")
  public Response<PageInfo<BMonitorDevice>> listByAreaAndPage(
      @RequestParam(value = "areaId", required = false) @ApiParam("区域ID") Integer areaId,
      @RequestParam(value = "stationId", required = false) @ApiParam("监测站ID") Integer stationId,
      @RequestParam(value = "deviceName", required = false) @ApiParam("采集器名称") String deviceName,
      @RequestParam(value = "status", required = false) @ApiParam("采集器状态") String status,
      @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("当前页码") Integer pageNum,
      @RequestParam(value = "pageSize", defaultValue = "10") @ApiParam("分页大小") Integer pageSize) {

    return Response.success(
        collectorService
            .listByAreaAndStationAndPage(areaId, stationId, deviceName, status, pageNum, pageSize));
  }

  @ApiOperation(value = "查询某个采集器数据英文名中文名对应关系")
  @GetMapping("/dataEnum/{collectorId}")
  public Response<List<EnumDataDto>> listCollectorDataEnum(
      @PathVariable(value = "collectorId") @ApiParam("采集器ID") Integer collectorId) {

    return Response.success(collectorService.listCollectorDataEnum(collectorId));
  }

  @ApiOperation(value = "查询某个采集器详细采集数据")
  @GetMapping("/detail/{collectorId}")
  public Response<PageInfo<PlgBushAutoStation>> listCollectDetail(
      @PathVariable(value = "collectorId") @ApiParam("采集器ID") Integer collectorId,
      @RequestParam(value = "data", required = false) @ApiParam("日期,2019-06-29格式") @DateTimeFormat(pattern = "yyyy-MM-dd") Date data,
      @RequestParam(value = "frequency", required = false) @ApiParam("频率,一分钟-1，十分钟-10，一小时-60，一天-1440") Integer frequency,
      @RequestParam(value = "pageNum", defaultValue = "1") @ApiParam("当前页码") Integer pageNum,
      @RequestParam(value = "pageSize", defaultValue = "10") @ApiParam("分页大小") Integer pageSize) {

    return Response
        .success(collectorService.listCollectDetail(collectorId, data, frequency, pageNum, pageSize));
  }

  @ApiOperation(value = "根据条件导出某个采集器详细采集数据EXCEL")
  @GetMapping("/export/{collectorId}")
  public Response<Boolean> exportCollectDetail(
      @PathVariable(value = "collectorId") @ApiParam("采集器ID") Integer collectorId,
      @RequestParam(value = "data", required = false) @ApiParam("日期") @DateTimeFormat(pattern = "yyyy-MM-dd") Date data,
      @RequestParam(value = "frequency", required = false) @ApiParam("频率") Integer frequency,
      HttpServletResponse response) {

    return Response.success(collectorService.exportCollectDetail(collectorId, data, frequency, response));
  }
}
