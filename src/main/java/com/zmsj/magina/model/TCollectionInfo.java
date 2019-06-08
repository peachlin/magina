package com.zmsj.magina.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class TCollectionInfo {

  private Integer id;

  private Integer monitorDataId;

  private Date collectionTime;

  private Integer collectionTermId;

  private String collectionValue;

  private String unit;

  private String minValue;

  private String maxValue;

  private String variableName;

  private String collectionTermName;
}