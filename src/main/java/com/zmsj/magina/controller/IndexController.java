package com.zmsj.magina.controller;

import com.zmsj.magina.base.Response;
import com.zmsj.magina.model.mine.Alarm;
import com.zmsj.magina.model.mine.AreaMeteorologicalInfo;
import com.zmsj.magina.model.mine.AreaSoilAnalysis;
import com.zmsj.magina.model.mine.DataDto;
import com.zmsj.magina.model.mine.SummaryInfo;
import com.zmsj.magina.model.mine.WeatherOf24;
import com.zmsj.magina.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang.kun
 */
@CrossOrigin
@Api(tags = {"首页相关接口"})
@RestController
@RequestMapping("/v1/index")
public class IndexController {

  @Resource
  private IndexService indexService;

  @ApiOperation(value = "获取首页概览")
  @GetMapping("/getSummary")
  public Response<SummaryInfo> getSummaryInfo() {

    return Response.success(indexService.getSummaryInfo());
  }

  @GetMapping("/getAreaMeteorological")
  @ApiOperation(value = "首页区域气象均值")
  public Response<List<AreaMeteorologicalInfo>> getAreaMeteorological() {

    return Response.success(indexService.getAreaMeteorological());
  }

  @GetMapping("/getVegetation")
  @ApiOperation(value = "首页植被指数统计")
  public Response<List<DataDto>> getVegetation() {

    return Response.success(indexService.getVegetation());
  }

  @GetMapping("/getVegetationMap")
  @ApiOperation(value = "首页植被指数统计")
  public Response<Map<String, Double>> getVegetationMap() {

    return Response.success(indexService.getVegetationMap());
  }

  @ApiOperation(value = "首页区域土壤分析")
  @GetMapping("/getAreaSoilAnalysis")
  public Response<AreaSoilAnalysis> getAreaSoilAnalysis() {

    return Response.success(indexService.getAreaSoilAnalysis());
  }

  @ApiOperation(value = "首页24小时气象")
  @GetMapping("/get24hWeather")
  public Response<List<WeatherOf24>> get24hWeather() {

    return Response.success(indexService.get24hWeather());
  }

  @ApiOperation(value = "首页告警信息")
  @GetMapping("/getAlarm")
  public Response<List<Alarm>> getAlarm() {

    return Response.success(indexService.getAlarm());
  }

}
