package com.zmsj.magina.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zmsj.magina.dao.BAreaMapper;
import com.zmsj.magina.dao.BMonitorDeviceMapper;
import com.zmsj.magina.dao.BMonitoringStationMapper;
import com.zmsj.magina.dao.PlgBushAutoStationMapper;
import com.zmsj.magina.dao.PlgDykAutoStationMapper;
import com.zmsj.magina.dao.PlgEcologyAutoStationMapper;
import com.zmsj.magina.dao.mine.AlarmMapper;
import com.zmsj.magina.dao.mine.VegetationMapper;
import com.zmsj.magina.model.BArea;
import com.zmsj.magina.model.BMonitorDevice;
import com.zmsj.magina.model.BMonitoringStation;
import com.zmsj.magina.model.PlgBushAutoStation;
import com.zmsj.magina.model.PlgDykAutoStation;
import com.zmsj.magina.model.PlgEcologyAutoStation;
import com.zmsj.magina.model.mine.Alarm;
import com.zmsj.magina.model.mine.AreaMeteorologicalInfo;
import com.zmsj.magina.model.mine.AreaSoilAnalysis;
import com.zmsj.magina.model.mine.DataDto;
import com.zmsj.magina.model.mine.SummaryInfo;
import com.zmsj.magina.model.mine.Vegetation;
import com.zmsj.magina.model.mine.WeatherOf24;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wang.kun
 */
@Service
public class IndexService {

  @Resource
  private BAreaMapper areaMapper;

  @Resource
  private BMonitoringStationMapper stationMapper;

  @Resource
  private BMonitorDeviceMapper deviceMapper;

  @Resource
  private PlgBushAutoStationMapper plgBushAutoStationMapper;

  @Resource
  private PlgDykAutoStationMapper plgDykAutoStationMapper;

  @Resource
  private PlgEcologyAutoStationMapper plgEcologyAutoStationMapper;

  @Resource
  private AlarmMapper alarmMapper;

  @Resource
  private VegetationMapper vegetationMapper;


  public SummaryInfo getSummaryInfo() {

    SummaryInfo info = new SummaryInfo();
    info.setStationNum(stationMapper.listAll().size());
    info.setCollectorNum(deviceMapper.listAll().size());

    PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectLastest();
    info.setWindSpeed(null != plgBushAutoStation.getWSpd() ? plgBushAutoStation.getWSpd().doubleValue() : 0);
    info.setRainfall(null != plgBushAutoStation.getRain() ? plgBushAutoStation.getRain().doubleValue() : 0);
    info.setSoilMoisture(
        null != plgBushAutoStation.getVwc10cmAvg() ? plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0);
    info.setSoilTemp(
        null != plgBushAutoStation.getTsoil10cmAvg() ? plgBushAutoStation.getTsoil10cmAvg().doubleValue()
            : 0);
    info.setTemp(null != plgBushAutoStation.getTaAvg() ? plgBushAutoStation.getTaAvg().doubleValue() : 0);
    return info;
  }

  public List<AreaMeteorologicalInfo> getAreaMeteorological() {

    List<AreaMeteorologicalInfo> infoList = Lists.newArrayList();
    List<BArea> bAreas = areaMapper.listAll();
    for (BArea area : bAreas) {
      AreaMeteorologicalInfo info = new AreaMeteorologicalInfo();
      info.setArea(area.getName());
      //红沙窝
      if (area.getId() == 2) {
        PlgBushAutoStation bush = plgBushAutoStationMapper.selectLastest();
        info.setAirHumidity(null != bush.getRhAvg() ? bush.getRhAvg().doubleValue() : 0);
        info.setAirTemp(null != bush.getTaAvg() ? bush.getTaAvg().doubleValue() : 0);
        info.setSoilTemp(null != bush.getTsoil10cmAvg() ? bush.getTsoil10cmAvg().doubleValue() : 0);
        infoList.add(info);
      }
      //龙渠
      if (area.getId() == 1) {
        PlgEcologyAutoStation ecology = plgEcologyAutoStationMapper.selectLastest();
        info.setAirHumidity(null != ecology.getRh2mAvg() ? ecology.getRh2mAvg().doubleValue() : 0);
        info.setAirTemp(null != ecology.getTa2mAvg() ? ecology.getTa2mAvg().doubleValue() : 0);
        info.setSoilTemp(null != ecology.getTsoil10cm() ? ecology.getTsoil10cm().doubleValue() : 0);
        infoList.add(info);
      }
      //大野口
      if (area.getId() == 0) {
        PlgDykAutoStation dyk = plgDykAutoStationMapper.selectLastest();
        info.setAirHumidity(null != dyk.getRhAvg() ? dyk.getRhAvg().doubleValue() : 0);
        info.setAirTemp(null != dyk.getTaAvg() ? dyk.getTaAvg().doubleValue() : 0);
        info.setSoilTemp(null != dyk.getTsoil1Avg() ? dyk.getTsoil1Avg().doubleValue() : 0);
        infoList.add(info);
      }
    }

    return infoList;
  }

  public AreaSoilAnalysis getAreaSoilAnalysis() {

    AreaSoilAnalysis info = new AreaSoilAnalysis();

    PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectLastest();
    info.setRainfall(null != plgBushAutoStation.getRain() ? plgBushAutoStation.getRain().doubleValue() : 0);
    info.setSoilHumidity(
        null != plgBushAutoStation.getVwc10cmAvg() ? plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0);
    info.setSoilSalt(
        null != plgBushAutoStation.getEc10cmAvg() ? plgBushAutoStation.getEc10cmAvg().doubleValue() : 0);
    info.setSoilTemp(
        null != plgBushAutoStation.getTsoil10cmAvg() ? plgBushAutoStation.getTsoil10cmAvg().doubleValue()
            : 0);
    return info;
  }

  public List<WeatherOf24> get24hWeather() {

    List<WeatherOf24> infoList = Lists.newArrayList();

    for (int i = 1; i <= 24; i++) {
      WeatherOf24 info = new WeatherOf24();
      info.setTime(i + "时");
      infoList.add(info);
      Calendar startCalendar = Calendar.getInstance();
      startCalendar.setTime(new Date());
      startCalendar.set(Calendar.HOUR, i - 1);
      startCalendar.set(Calendar.MINUTE, 0);
      startCalendar.set(Calendar.SECOND, 0);
      Calendar endCalendat = Calendar.getInstance();
      endCalendat.setTime(new Date());
      endCalendat.set(Calendar.HOUR, i);
      endCalendat.set(Calendar.MINUTE, 0);
      endCalendat.set(Calendar.SECOND, 0);
      Date startTime = startCalendar.getTime();
      Date endTime = endCalendat.getTime();
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(startTime, endTime);
      if (null == plgBushAutoStation) {
        continue;
      }
      info.setAirHumidity(
          null != plgBushAutoStation.getRhAvg() ? plgBushAutoStation.getRhAvg().doubleValue() : 0);
      info.setAirTemp(
          null != plgBushAutoStation.getTaAvg() ? plgBushAutoStation.getTaAvg().doubleValue() : 0);
      info.setSoilTemp(
          null != plgBushAutoStation.getTsoil10cmAvg() ? plgBushAutoStation.getTsoil10cmAvg().doubleValue()
              : 0);

    }
    return infoList;
  }

  public List<Alarm> getAlarm() {

    return alarmMapper.selectAll();
  }

  public List<DataDto> getVegetation() {

    List<Vegetation> vegetations = vegetationMapper.selectAll();
    List<DataDto> infoList = Lists.newArrayList();
    Double index15 = 0d;
    Double index25 = 0d;
    Double index35 = 0d;
    Double index45 = 0d;
    Double index55 = 0d;
    Double index65 = 0d;
    Double index75 = 0d;
    Double index85 = 0d;
    Double index100 = 0d;
    for (Vegetation vegetation : vegetations) {
      index15 += vegetation.getIndex15();
      index25 += vegetation.getIndex25();
      index35 += vegetation.getIndex35();
      index45 += vegetation.getIndex45();
      index55 += vegetation.getIndex55();
      index65 += vegetation.getIndex65();
      index75 += vegetation.getIndex75();
      index85 += vegetation.getIndex85();
      index100 += vegetation.getIndex100();
    }
    infoList.add(new DataDto("0-0.15", index15 / vegetations.size()));
    infoList.add(new DataDto("0.15-0.25", index25 / vegetations.size()));
    infoList.add(new DataDto("0.25-0.35", index35 / vegetations.size()));
    infoList.add(new DataDto("0.35-0.45", index45 / vegetations.size()));
    infoList.add(new DataDto("0.45-0.55", index55 / vegetations.size()));
    infoList.add(new DataDto("0.55-0.65", index65 / vegetations.size()));
    infoList.add(new DataDto("0.65-0.75", index75 / vegetations.size()));
    infoList.add(new DataDto("0.75-0.85", index85 / vegetations.size()));
    infoList.add(new DataDto("0.85-1", index100 / vegetations.size()));
    return infoList;
  }

  public Map<String, Double> getVegetationMap() {

    List<Vegetation> vegetations = vegetationMapper.selectAll();
    Map<String, Double> infoMap = Maps.newHashMap();
    infoMap.put("荒漠植被", 0d);
    infoMap.put("草原植被", 0d);
    infoMap.put("森林植被", 0d);
    vegetations.forEach(i -> {
      infoMap
          .put("荒漠植被",
              infoMap.get("荒漠植被") + (null != i.getDesertVegetation() ? i.getDesertVegetation() : 0));
      infoMap
          .put("草原植被",
              infoMap.get("草原植被") + (null != i.getPrairieVegetation() ? i.getPrairieVegetation() : 0));
      infoMap
          .put("森林植被",
              infoMap.get("森林植被") + (null != i.getForestVegetation() ? i.getForestVegetation() : 0));
    });
    return infoMap;
  }
}
