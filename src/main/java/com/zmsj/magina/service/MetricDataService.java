package com.zmsj.magina.service;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zmsj.magina.dao.PlgBushAutoStationMapper;
import com.zmsj.magina.dao.PlgGradeAutoStationMapper;
import com.zmsj.magina.model.PlgBushAutoStation;
import com.zmsj.magina.model.PlgGradeAutoStation;
import com.zmsj.magina.model.mine.AreaWeather;
import com.zmsj.magina.model.mine.DataDto;
import com.zmsj.magina.model.mine.MetricData;
import com.zmsj.magina.model.mine.SolarRadiation;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wangk
 */
@Service
public class MetricDataService {

  @Resource
  private PlgBushAutoStationMapper plgBushAutoStationMapper;

  @Resource
  private PlgGradeAutoStationMapper plgGradeAutoStationMapper;


  public PageInfo<MetricData> queryData(Integer elevation, String type, String date) {

    return null;
  }

  public List<AreaWeather> getAreaWeather(Integer last, Integer elevation) {

    List<AreaWeather> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      AreaWeather areaWeather = new AreaWeather();
      areaWeather.setTime(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      areaWeather.setWeather((double) random(29, 17));
      areaWeather.setTemp((double) random(29, 17));
      infoList.add(areaWeather);
    }
    return infoList;
  }

  public int random(int max, int min) {

    Random random = new Random();
    return random.nextInt(max) % (max - min + 1) + min;
  }

  public List<DataDto> getDayLightTime(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    double index = 7.1d;
    for (int i = last - 1; i >= 0; i--) {
      index += 0.1;
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - i);
      DataDto dataDto = new DataDto(calendar.get(Calendar.DAY_OF_MONTH) + "日", index);
      infoList.add(dataDto);
    }
    return infoList;
  }

  public List<SolarRadiation> getSolarRadiation(Integer last, Integer elevation) {

    List<SolarRadiation> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - i);
      PlgGradeAutoStation plgGradeAutoStation = plgGradeAutoStationMapper.selectOneByDay(calendar.getTime());

      SolarRadiation solarRadiation = new SolarRadiation();
      solarRadiation.setTime(calendar.get(Calendar.DAY_OF_MONTH) + "日");
      solarRadiation.setTotalRadiation(
          null != plgGradeAutoStation ? plgGradeAutoStation.getRnSAvg().doubleValue() : 0d);
      solarRadiation.setEffectiveRadiation(
          null != plgGradeAutoStation ? plgGradeAutoStation.getParTotTot().doubleValue() : 0d);
      infoList.add(solarRadiation);
    }
    return infoList;
  }


  public Map<String, Double> getHydrologyInfo(Integer elevation) {

    Map<String, Double> infoMap = Maps.newHashMap();
    infoMap.put("总磷通", 20d);
    infoMap.put("总氮通", 35d);
    infoMap.put("氨氮", 13.1d);
    infoMap.put("COD", 9.1d);
    infoMap.put("叶绿素", 22.8d);
    return infoMap;
  }

  public Map<String, Double> getWaterWet(Integer elevation) {

    Map<String, Double> infoMap = Maps.newHashMap();
    infoMap.put("水湿", (double) random(22, 19));
    return infoMap;
  }

  public Map<String, Double> getWaterPH(Integer elevation) {

    Map<String, Double> infoMap = Maps.newHashMap();
    infoMap.put("PH值", (double) random(32, 28));
    return infoMap;
  }


  public Map<String, Double> getTurbidity(Integer elevation) {

    Map<String, Double> infoMap = Maps.newHashMap();
    infoMap.put("浊腐", (double) random(12222, 9999));
    return infoMap;
  }

  public List<DataDto> getRainfall(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();

    for (int i = 1; i <= 24; i++) {
      DataDto dataDto = new DataDto();
      dataDto.setKey(i + "时");
      infoList.add(dataDto);
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
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectByTimeRange(startTime, endTime);
      if (null == plgBushAutoStation) {
        continue;
      }
      dataDto.setValue(
          null != plgBushAutoStation.getRain() ? plgBushAutoStation.getRhAvg().doubleValue() : 0);
    }
    return infoList;
  }

  public List<DataDto> getSoilMoisture(Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectLastest();
    infoList.add(new DataDto("10cm", null != plgBushAutoStation.getVwc10cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("20cm", null != plgBushAutoStation.getVwc20cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("30cm", null != plgBushAutoStation.getVwc30cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("40cm", null != plgBushAutoStation.getVwc40cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("60cm", null != plgBushAutoStation.getVwc60cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    return infoList;
  }

  public List<DataDto> getsoilConductivity(Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectLastest();
    infoList.add(new DataDto("10cm", null != plgBushAutoStation.getEc10cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("20cm", null != plgBushAutoStation.getEc20cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("30cm", null != plgBushAutoStation.getEc30cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("40cm", null != plgBushAutoStation.getEc40cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("60cm", null != plgBushAutoStation.getEc60cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    return infoList;
  }

  public List<DataDto> getSoilTemp(Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper.selectLastest();
    infoList.add(new DataDto("10cm", null != plgBushAutoStation.getTsoil10cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("20cm", null != plgBushAutoStation.getTsoil20cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("30cm", null != plgBushAutoStation.getTsoil30cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("40cm", null != plgBushAutoStation.getTsoil40cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    infoList.add(new DataDto("60cm", null != plgBushAutoStation.getTsoil60cmAvg() ?
        plgBushAutoStation.getVwc10cmAvg().doubleValue() : 0));
    return infoList;
  }

  public List<DataDto> getWindSpeed(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(calendar.getTime());
      calendar2.add(Calendar.HOUR, 1);
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(calendar.getTime(), calendar2.getTime());
      DataDto dataDto = new DataDto();
      dataDto.setKey(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      dataDto.setValue(null != plgBushAutoStation ? plgBushAutoStation.getWSpd().doubleValue() : 0d);
      infoList.add(dataDto);
    }
    return infoList;
  }

  public List<DataDto> getWindDirection(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(calendar.getTime());
      calendar2.add(Calendar.HOUR, 1);
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(calendar.getTime(), calendar2.getTime());
      DataDto dataDto = new DataDto();
      dataDto.setKey(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      dataDto.setValue(null != plgBushAutoStation ? plgBushAutoStation.getWDir().doubleValue() : 0d);
      infoList.add(dataDto);
    }
    return infoList;
  }

  public List<DataDto> getAirTemp(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(calendar.getTime());
      calendar2.add(Calendar.HOUR, 1);
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(calendar.getTime(), calendar2.getTime());
      DataDto dataDto = new DataDto();
      dataDto.setKey(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      dataDto.setValue(null != plgBushAutoStation ? plgBushAutoStation.getTaAvg().doubleValue() : 0d);
      infoList.add(dataDto);
    }
    return infoList;
  }

  public List<DataDto> getAirHumidity(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(calendar.getTime());
      calendar2.add(Calendar.HOUR, 1);
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(calendar.getTime(), calendar2.getTime());
      DataDto dataDto = new DataDto();
      dataDto.setKey(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      dataDto.setValue(null != plgBushAutoStation ? plgBushAutoStation.getRhAvg().doubleValue() : 0d);
      infoList.add(dataDto);
    }
    return infoList;
  }

  public List<DataDto> getAirPressure(Integer last, Integer elevation) {

    List<DataDto> infoList = Lists.newArrayList();
    for (int i = last - 1; i >= 0; i--) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - i);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(calendar.getTime());
      calendar2.add(Calendar.HOUR, 1);
      PlgBushAutoStation plgBushAutoStation = plgBushAutoStationMapper
          .selectByTimeRange(calendar.getTime(), calendar2.getTime());
      DataDto dataDto = new DataDto();
      dataDto.setKey(calendar.get(Calendar.HOUR_OF_DAY) + "时");
      dataDto.setValue(null != plgBushAutoStation ? plgBushAutoStation.getPressAvg().doubleValue() : 0d);
      infoList.add(dataDto);
    }
    return infoList;
  }

}
