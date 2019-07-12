package me.joy.tiktokapi.config;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import me.joy.tiktokapi.utils.Utils;

/**
 * Created by Joy on 2019-06-24
 */
public class APIConfig_origin {

  private static HashMap<String, String> HEADER_MAP = new HashMap<>();

  public static final String API_V2 = "https://api2.musical.ly/";

  public static final String ACTION_LOGIN = "passport/user/login/"; //登录
  public static final String ACTION_GET_USER_INFO = "aweme/v1/user/"; //获取user信息
  public static final String ACTION_GET_FOLLOWER_LIST = "aweme/v1/user/follower/list/"; //获取follower信息
  public static final String ACTION_GET_FOLLOWING_LIST = "aweme/v1/user/following/list/"; //获取following信息
  public static final String ACTION_GET_POST_LIST = "aweme/v1/aweme/post/"; //获取POST LIST
  public static final String ACTION_PLAY_POST = "aweme/v1/play/"; //播放post
  public static final String ACTION_GET_POST = "aweme/v1/aweme/detail/"; //根据 video_id 获取POST
  public static final String ACTION_FOLLOW = "aweme/v1/commit/follow/user/"; //follow an user
  public static final String ACTION_UNFOLLOW = "aweme/v1/commit/follow/user/"; //follow an user
  public static final String ACTION_LIKE_POST = "aweme/v1/commit/item/digg/"; //like a post
  public static final String ACTION_UNLIKE_POST = "aweme/v1/commit/item/digg/"; //unlike a post
  public static final String ACTION_POST_COMMENT_LIST = "aweme/v1/comment/list/"; //get the comment list of a post
  public static final String ACTION_POST_COMMENT = "aweme/v1/comment/publish/"; // publish a comment to  a post

  public static String SSID = UUID.randomUUID().toString();
  private static int MANIFEST_VERSION_CODE = 2018053001;

  // private static final String USER_AGENT = "com.zhiliaoapp.musically/2018053001 (Linux; U; Android 6.0.1; zh_CN; Nexus 5; Build/M4B30Z; Cronet/58.0.2991.0))";

  private static final String USER_AGENT = String.format("com.zhiliaoapp.musically"
          + "/%s (Linux; U; Android %s; %s_%s; %s; Build/M4B30Z; Cronet/58.0.2991.0))",
      MANIFEST_VERSION_CODE, Utils.getSystemVersion(), Utils.getLanguage(),
      Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()), Utils.getSystemModel());

  static {
    HEADER_MAP.put("Connection", "keep-alive");
    HEADER_MAP.put("Content-Type", "application/json;charset=utf-8");
    HEADER_MAP.put("Accept", "application/json");
    HEADER_MAP.put("User-Agent", USER_AGENT);
  }


  public static HashMap<String, String> getHeadersPHp5() {
    return HEADER_MAP;
  }


  public static Map<String, String> basicParamsMap() {
    Map<String, String> map = new HashMap<>();
//    map.put("email",Utils.encryptWithXOR(email));
//    map.put("password",Utils.encryptWithXOR(password));
//    map.put("captcha",captcha);

    map.put("mix_mode", "1");
    map.put("ts", Utils.getServerTime() + "");
    map.put("app_type", "normal");
    map.put("os_api", "23");

    map.put("device_type", "Nexus5");
    map.put("ssmix", "a");
    map.put("manifest_version_code", "2018053001");
    map.put("dpi", "180");
    map.put("carrier_region", "");

    map.put("region", "us");
    map.put("app_name", "musical_ly");
    map.put("version_name", "7.3.0");
    map.put("timezone_offset", "28800");
    map.put("is_my_cn", "1");

    map.put("fp", "4STZF2wIcrU7FYmtLlU1LSFIczGb");
    map.put("ac", "wifi");
    map.put("update_version_code", "2018053001");
    map.put("channel", "googleplay");
    map.put("rticket", System.currentTimeMillis() + "");

    map.put("device_platform", "android");
    map.put("iid", "6707032413430351621");
    map.put("build_number", "7.3.0");
    map.put("locale", "en");
    map.put("version_code", "730");
    map.put("timezone_name", Utils.getTimeId());

    map.put("openudid", "357dd49d4c402c29");
    map.put("device_id", "6706013657706825221");
    map.put("sys_region", Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()));
    map.put("app_language", "en");
    map.put("resolution", "1080*1776");

    map.put("os_version", "6.0.1");
    map.put("device_brand", "google");
    map.put("language", Utils.getLanguage());
    map.put("aid", "1233");
    map.put("mcc_mnc", "");

//    map.put("as", "a14562c1741aedfd244355");
//    map.put("cp", "2ca2d35f494717d3e1MuUy");
//    map.put("mas", "0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");

    return map;
  }


  public static Map<String, String> getAntiSpamParams() {
    Map<String, String> map = new HashMap<>();
    map.put("as", "a14562c1741aedfd244355");
    map.put("cp", "2ca2d35f494717d3e1MuUy");
    map.put("mas", "0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");
    return map;
  }


  public static Map<String, String> basicParamsMapBack() {
    Map<String, String> map = new HashMap<>();

    map.put("mix_mode", "1");
    map.put("ts", Utils.getServerTime() + "");
    map.put("app_type", "normal");
    map.put("os_api", "23");

    map.put("device_type", "Nexus5");
    map.put("ssmix", "a");
    map.put("manifest_version_code", "2018053001");
    map.put("dpi", "180");
    map.put("carrier_region", "");

    map.put("region", "us");
    map.put("app_name", "musical_ly");
    map.put("version_name", "7.3.0");
    map.put("timezone_offset", "28800");
    map.put("is_my_cn", "1");

    map.put("fp", "4STZF2wIcrU7FYmtLlU1LSFIczGb");
    map.put("ac", "wifi");
    map.put("update_version_code", "2018053001");
    map.put("channel", "googleplay");
//    map.put("rticket", System.currentTimeMillis() + "");
    map.put("_rticket", System.currentTimeMillis() + "");

    map.put("device_platform", "android");
    map.put("iid", "6707032413430351621");
    map.put("build_number", "7.3.0");
    map.put("locale", "en");
    map.put("version_code", "730");
    map.put("timezone_name", Utils.getTimeId());

    map.put("openudid", "357dd49d4c402c29");
    map.put("device_id", "6706013657706825221");
    map.put("sys_region", Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()));
    map.put("app_language", "en");
    map.put("resolution", "1080*1776");

    map.put("os_version", "6.0.1");
    map.put("device_brand", "google");
    map.put("language", Utils.getLanguage());
    map.put("aid", "1233");
    map.put("mcc_mnc", "");
//    map.put("as", "a1qwert123");
//    map.put("cp", "cbfhckdckkde1");

    map.put("as", "a14562c1741aedfd244355");
    map.put("cp", "2ca2d35f494717d3e1MuUy");
    map.put("mas", "0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");

    // 貌似aid和iid 决定了签名

//    map.put("as","a14562c1741aedfd244355");
//    map.put("cp","2ca2d35f494717d3e1MuUy");
//    map.put("mas","0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");

    return map;
  }


}
