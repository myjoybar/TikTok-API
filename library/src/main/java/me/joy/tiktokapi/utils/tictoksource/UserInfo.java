package me.joy.tiktokapi.utils.tictoksource;

public class UserInfo {

  public static native String a();

  public static native String getDescription();

  public static native String getFile();

  public static native String getFingerprint();

  public static native void getPackage(String paramString);

  public static native String getS();

  public static native byte[] getT();

  public static native int getTemperature();

  public static native int getType();

  public static native String getUserInfo(int paramInt, String paramString,
      String[] paramArrayOfString);

  public static native String getUserInfo(int paramInt, String paramString1,
      String[] paramArrayOfString, String paramString2);

  public static native String getUserInfoSkipGet(int paramInt, String paramString,
      String[] paramArrayOfString);

  public static native int initUser(String paramString);

  public static native int isR();

  public static native void setAppId(int paramInt);

}
