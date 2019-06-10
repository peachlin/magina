package com.zmsj.magina.base;

import java.util.UUID;

/**
 * @author wangk
 */
public class MaginaUtils {

  private MaginaUtils() {
  }

  public static String generateUUID() {

    return UUID.randomUUID().toString().replace("-", "");
  }

}
