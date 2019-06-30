package com.zmsj.magina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.statement.utils.excel.ExportExcelUtil;
import com.zmsj.magina.dao.BAreaMapper;
import com.zmsj.magina.dao.BMonitorDeviceMapper;
import com.zmsj.magina.dao.BMonitoringStationMapper;
import com.zmsj.magina.dao.PlgBushAutoStationMapper;
import com.zmsj.magina.model.BArea;
import com.zmsj.magina.model.BMonitorDevice;
import com.zmsj.magina.model.BMonitoringStation;
import com.zmsj.magina.model.PlgBushAutoStation;
import com.zmsj.magina.model.mine.CollectorDataEnum;
import com.zmsj.magina.model.mine.EnumDataDto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author wangk
 */
@Slf4j
@Service
public class CollectorService {

  @Resource
  private BAreaMapper areaMapper;

  @Resource
  private BMonitorDeviceMapper collectorMapper;

  @Resource
  private PlgBushAutoStationMapper plgBushAutoStationMapper;

  @Resource
  private BMonitoringStationMapper stationMapper;

  public PageInfo<BMonitorDevice> listByAreaAndStationAndPage(Integer areaId, Integer stationId,
      String deviceName, String status, Integer pageNum, Integer pageSize) {

    List<BArea> bAreas = areaMapper.listAll();
    Map<Integer, String> areaId2NameMap = bAreas.stream()
        .collect(Collectors.toMap(BArea::getId, BArea::getName));
    Map<Integer, Integer> stationId2AreaIdmap = stationMapper.listAll().stream()
        .collect(Collectors.toMap(BMonitoringStation::getId, BMonitoringStation::getAreaId));
    Map<Integer, String> stationId2NameMap = stationMapper.listAll().stream()
        .collect(Collectors.toMap(BMonitoringStation::getId, BMonitoringStation::getName));

    List<Integer> stationIds = Lists.newArrayList();
    if (StringUtils.isEmpty(stationId) && !StringUtils.isEmpty(areaId)) {
      stationIds.addAll(stationMapper.selectByAreaId(areaId).stream().map(BMonitoringStation::getId)
          .collect(Collectors.toList()));
    }

    PageInfo<BMonitorDevice> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(
        () -> collectorMapper.listByStationIdsAndDeviceNameAndStatus(stationIds, deviceName, status));
    pageInfo.getList().forEach(i -> {
      Integer stationId1 = i.getMonitoringStationId();
      i.setStationName(stationId2NameMap.get(stationId1));

      i.setAreaName(areaId2NameMap.get(stationId2AreaIdmap.get(stationId1)));
    });
    return pageInfo;
  }

  public PageInfo<PlgBushAutoStation> listCollectDetail(Integer collectorId, Date data, Integer frequency,
      Integer pageNum, Integer pageSize) {

    String format = new SimpleDateFormat("yyyy-MM-dd").format(data);
    return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
      plgBushAutoStationMapper.listByDateAndFrequency(format, frequency);
    });
  }

  public List<EnumDataDto> listCollectorDataEnum(Integer collectorId) {

    return CollectorDataEnum.toList();
  }

  public Boolean exportCollectDetail(Integer collectorId, Date data, Integer frequency,
      HttpServletResponse response) {

    String title = "采集数据结果集";
    String[] headers = new String[] {"ID",
        "采集器id",
        "创建时间",
        "采集频率",
        "时间",
        "记录号",
        "电池电压",
        "机箱温度",
        "风速",
        "风向",
        "风向标准差",
        "空气温度",
        "空气湿度",
        "气压",
        "降水量",
        "10cm土壤水分",
        "10cm土壤电导率",
        "10cm土壤温度",
        "20cm土壤水分",
        "20cm土壤电导率",
        "20cm土壤温度",
        "30cm土壤水分",
        "30cm土壤电导率",
        "30cm土壤温度",
        "40cm土壤水分",
        "40cm土壤电导率",
        "40cm土壤温度",
        "60cm土壤水分",
        "60cm土壤电导率",
        "60cm土壤温度"};
    String format = new SimpleDateFormat("yyyy-MM-dd").format(data);
    List<PlgBushAutoStation> dataSet = plgBushAutoStationMapper.listByDateAndFrequency(format, frequency);
    try (ServletOutputStream out = response.getOutputStream()) {

      response.reset();// 清空输出流
      // 设定输出文件头
      response.setHeader("Content-disposition",
          "attachment; filename=" + new String(title.getBytes("UTF-8"), "ISO8859-1") + ".xls");
      // 定义输出类型
      response.setContentType("application/msexcel;charset=utf-8");

      new com.statement.utils.excel.ExportExcelUtil<PlgBushAutoStation>()
          .exportExcel(title, headers, dataSet, out, ExportExcelUtil.EXCEl_FILE_2007);
    } catch (Exception e) {
      log.error("export excel error:", e);
    }
    return true;
  }
}
