package com.zmsj.magina.controller;

import com.zmsj.magina.base.Response;
import com.zmsj.magina.service.MetricDataService;
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
@Api(tags = {"采集数据相关接口"})
@RestController
@RequestMapping("/v1/data")
public class MetricDataController {

  @Resource
  private MetricDataService metricDataService;

  @ApiOperation(value = "获取过去若干小时区域天气")
  @GetMapping("/getAreaWeather")
  public Response queryData(
      @RequestParam(value = "elevation") @ApiParam("海拔") Integer elevation,
      @RequestParam(value = "type") @ApiParam("指标类型") String type,
      @RequestParam(value = "date") @ApiParam("日期") String date) {

    return Response.success(metricDataService.queryData(elevation, type, date));
  }

  /************光照 light*********************/
  @ApiOperation(value = "获取过去若干小时区域天气")
  @GetMapping("/getAreaWeather")
  public Response getAreaWeather(
      @RequestParam(value = "last", defaultValue = "15") @ApiParam("过去天数,默认15") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getAreaWeather(last, elevation));
  }

  @ApiOperation(value = "获取过去若干天光照时长")
  @GetMapping("/getDayLightTime")
  public Response getDayLightTime(
      @RequestParam(value = "last", defaultValue = "15") @ApiParam("过去天数,默认15") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getDayLightTime(last, elevation));
  }

  @ApiOperation(value = "获取过去若干小时太阳辐射量")
  @GetMapping("/getSolarRadiation")
  public Response getSolarRadiation(
      @RequestParam(value = "last", defaultValue = "24") @ApiParam("过去小时数,默认24") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getSolarRadiation(last, elevation));
  }

  /************水文 hydrology*********************/
  @ApiOperation(value = "获取水文监测信息")
  @GetMapping("/getHydrologyInfo")
  public Response getHydrologyInfo(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getHydrologyInfo(elevation));
  }

  @ApiOperation(value = "获取水湿信息")
  @GetMapping("/getWaterWet")
  public Response getWaterWet(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getWaterWet(elevation));
  }

  @ApiOperation(value = "获取PH值信息")
  @GetMapping("/getWaterPH")
  public Response getWaterPH(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getWaterPH(elevation));
  }

  @ApiOperation(value = "获取浊腐信息")
  @GetMapping("/getTurbidity")
  public Response getTurbidity(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getTurbidity(elevation));
  }

  @ApiOperation(value = "获取过去若干小时降雨量信息")
  @GetMapping("/getRainfall")
  public Response getRainfall(
      @RequestParam(value = "last", defaultValue = "24") @ApiParam("过去小时数,默认24") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getRainfall(last, elevation));
  }

  /************土壤 soil*********************/
  @ApiOperation(value = "获取土壤含水量信息")
  @GetMapping("/getSoilMoisture")
  public Response getSoilMoisture(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getSoilMoisture(elevation));
  }

  @ApiOperation(value = "获取土壤导电率信息")
  @GetMapping("/getsoilConductivity")
  public Response getsoilConductivity(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getsoilConductivity(elevation));
  }

  @ApiOperation(value = "获取土壤温度信息")
  @GetMapping("/getSoilTemp")
  public Response getSoilTemp(
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getSoilTemp(elevation));
  }

  /************气流 airflow*********************/
  @ApiOperation(value = "获取过去若干小时风速信息")
  @GetMapping("/getWindSpeed")
  public Response getWindSpeed(
      @RequestParam(value = "last", defaultValue = "12") @ApiParam("过去小时数,默认12") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getWindSpeed(last, elevation));
  }

  @ApiOperation(value = "获取过去若干小时风向信息")
  @GetMapping("/getWindDirection")
  public Response getWindDirection(
      @RequestParam(value = "last", defaultValue = "12") @ApiParam("过去小时数,默认12") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getWindDirection(last, elevation));
  }

  @ApiOperation(value = "获取过去若干小时空气温度信息")
  @GetMapping("/getAirTemp")
  public Response getAirTemp(
      @RequestParam(value = "last", defaultValue = "12") @ApiParam("过去小时数,默认12") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getAirTemp(last, elevation));
  }

  @ApiOperation(value = "获取过去若干小时气压信息")
  @GetMapping("/getAirPressure")
  public Response getAirPressure(
      @RequestParam(value = "last", defaultValue = "12") @ApiParam("过去小时数,默认12") Integer last,
      @RequestParam(value = "elevation", defaultValue = "3700") @ApiParam("海拔,默认3700") Integer elevation) {

    return Response.success(metricDataService.getAirPressure(last, elevation));
  }

}
