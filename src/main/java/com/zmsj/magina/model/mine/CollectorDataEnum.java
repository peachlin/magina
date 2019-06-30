package com.zmsj.magina.model.mine;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.Getter;

/**
 * @author wang.kun
 */
@Getter
public enum CollectorDataEnum {


//  id("id", "ID"),
//  collectorid("collectorid", "采集器ID"),
  createTime("createTime", "创建时间"),
  collectFrequency("collectFrequency", "采集频率"),
  timestamp("timestamp", "时间"),
  record("record", "记录号"),
  battVoltMin("battVoltMin", "电池电压"),
  ptemp("ptemp", "机箱温度"),
  wSpd("wSpd", "风速"),
  wDir("wDir", "风向"),
  wdStd("wdStd", "风向标准差"),
  taAvg("taAvg", "空气温度"),
  rhAvg("rhAvg", "空气湿度"),
  pressAvg("pressAvg", "气压"),
  rain("rain", "降水量"),
  vwc10cmAvg("vwc10cmAvg", "10cm土壤水分"),
  ec10cmAvg("ec10cmAvg", "10cm土壤电导率"),
  tsoil10cmAvg("tsoil10cmAvg", "10cm土壤温度"),
  vwc20cmAvg("vwc20cmAvg", "20cm土壤水分"),
  ec20cmAvg("ec20cmAvg", "20cm土壤电导率"),
  tsoil20cmAvg("tsoil20cmAvg", "20cm土壤温度"),
  vwc30cmAvg("vwc30cmAvg", "30cm土壤水分"),
  ec30cmAvg("ec30cmAvg", "30cm土壤电导率"),
  tsoil30cmAvg("tsoil30cmAvg", "30cm土壤温度"),
  vwc40cmAvg("vwc40cmAvg", "40cm土壤水分"),
  ec40cmAvg("ec40cmAvg", "40cm土壤电导率"),
  tsoil40cmAvg("tsoil40cmAvg", "40cm土壤温度"),
  vwc60cmAvg("vwc60cmAvg", "60cm土壤水分"),
  ec60cmAvg("ec60cmAvg", "60cm土壤电导率"),
  tsoil60cmAvg("tsoil60cmAvg", "60cm土壤温度");

  private String nameEn;
  private String nameCN;

  CollectorDataEnum(String nameEn, String nameCN) {
    this.nameEn = nameEn;
    this.nameCN = nameCN;
  }

  public static List<EnumDataDto> toList() {
    List<EnumDataDto> list = Lists.newArrayList();

    for (CollectorDataEnum dataEnum : CollectorDataEnum.values()) {
      EnumDataDto enumDataDto = new EnumDataDto(dataEnum.getNameEn(), dataEnum.getNameCN());
      list.add(enumDataDto);
    }
    return list;
  }
}
