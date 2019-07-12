package me.joy.tiktokapi.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import me.joy.tiktokapi.utils.random.RandomStringUtils;

/**
 * Created by Joy on 2019-06-24
 */
public class Utils {

  public static long getServerTime() {
    return System.currentTimeMillis() / 1000;
  }

  public static String generateUuid(boolean dash) {
    String uuid = UUID.randomUUID().toString();
    if (dash) {
      return uuid;
    }
    uuid = uuid.replaceAll("-", "");
    return uuid;

  }

  public static String getOpenudid() {
    return RandomStringUtils.random(16, "0123456789abcdef");
  }


  /**
   * @return GMT+08:00
   */
  public static String getTimeZone() {
    TimeZone tz = TimeZone.getDefault();
    return tz.getDisplayName(false, TimeZone.SHORT);
  }

  /**
   * 获取时区
   *
   * @return eg: Asia/Shanghai
   */
  public static String getTimeId() {
    TimeZone tz = TimeZone.getDefault();
    return tz.getID();
  }

  /**
   * 获取country
   * @return eg: CN
   */
  public static String getLocale(Context context) {
    String locale = context.getResources().getConfiguration().locale.getCountry();
    return locale;
  }

  /**获取语言
   * @return eg: zh
   */
  public static String getLanguage() {
    return Locale.getDefault().getLanguage();
  }


  /**
   * 获取系统版本号
   * @return eg: 6.0.1
   */

  public static String getSystemVersion() {
    return android.os.Build.VERSION.RELEASE;

  }

  /**
   * 获取SDK CODE
   * @return eg: 23
   */
  public static int getSDKInt() {
    return VERSION.SDK_INT;

  }


  /**
   * 获取手机型号
   *
   * @return 手机型号   Nexus 5
   */
  public static String getSystemModel() {
    return android.os.Build.MODEL;
  }


  /**
   * 获取手机厂商
   *
   * @return 手机厂商 google
   */
  public static String getDeviceBrand() {
    return android.os.Build.BRAND;
  }


  /**
   * 加密email,password
   */
  public static String encryptWithXOR(String str) {
    char[] chars = str.toCharArray();
    int length = chars.length;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int value = chars[i];
      Object obj = Integer.toHexString(value ^ 5);
      sb.append(obj.toString());
    }

    return sb.toString();

  }

  /**
   * 获取屏幕分辨率
   * @param context
   * @return
   */
  public static int getWidthResolution(Context context) {
    DisplayMetrics dm = context.getResources().getDisplayMetrics();
    int width = dm.widthPixels;
    return width;
  }

  /**
   * 获取屏幕分辨率
   * @param context
   * @return
   */
  public static int getHeightResolution(Context context) {
    DisplayMetrics dm = context.getResources().getDisplayMetrics();
    int height = dm.heightPixels;
    return height;
  }

  /**
   * 获取屏幕分辨率
   * @return eg: 1080*1776
   */
  public static String getResolution(Context context) {
    DisplayMetrics dm = context.getResources().getDisplayMetrics();
    int height = dm.heightPixels;
    int width = dm.widthPixels;
    return width + "*" + height;
  }

  /* 获取 density
   * @param context
   * @return nexus5: 3.0
   */

  public static float getDensity(Context context) {
    DisplayMetrics dm = new DisplayMetrics();
    return context.getResources().getDisplayMetrics().density;
  }


}
