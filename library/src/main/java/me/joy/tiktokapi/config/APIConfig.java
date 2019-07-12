package me.joy.tiktokapi.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import me.joy.tiktokapi.utils.Utils;

/**
 * Created by Joy on 2019-06-24
 */
public class APIConfig {

  private static final Map<String, String> HEADER_MAP = new HashMap<>();
  private static final Map<String, String> ANTI_SPAMS_MAP = new HashMap<>();
  private static final Map<String, String> BASE_PARAMS_MAP = new HashMap<>();

  public static final String API_V2 = "https://api2.musical.ly/";

  public static final String ACTION_LOGIN = "passport/user/login/"; //login
  public static final String ACTION_EMAIL_REGISTER = "passport/email/register/"; //login
  public static final String ACTION_GET_USER_INFO = "aweme/v1/user/"; //get the user info
  public static final String ACTION_GET_FOLLOWER_LIST = "aweme/v1/user/follower/list/"; //get followers
  public static final String ACTION_GET_FOLLOWING_LIST = "aweme/v1/user/following/list/"; //get followings
  public static final String ACTION_GET_POST_LIST = "aweme/v1/aweme/post/"; //get the post list
  public static final String ACTION_GET_FAVORITE_POST_LIST = "aweme/v1/aweme/favorite/"; //get the favorite post list
  public static final String ACTION_PLAY_POST = "aweme/v1/play/"; //play a post
  public static final String ACTION_GET_POST = "aweme/v1/aweme/detail/"; //get a post by the video_id
  public static final String ACTION_FOLLOW = "aweme/v1/commit/follow/user/"; //follow an user
  public static final String ACTION_UNFOLLOW = "aweme/v1/commit/follow/user/"; //follow an user
  public static final String ACTION_LIKE_POST = "aweme/v1/commit/item/digg/"; //like a post
  public static final String ACTION_UNLIKE_POST = "aweme/v1/commit/item/digg/"; //unlike a post
  public static final String ACTION_POST_COMMENT_LIST = "aweme/v1/comment/list/"; //get the comment list of a post
  public static final String ACTION_POST_COMMENT = "aweme/v1/comment/publish/"; // publish a comment to  a post
  public static final String ACTION_UPLOAD_IMG = "aweme/v1/upload/image/"; // upload a image
  public static final String ACTION_UPDATE_USER_INFO = "aweme/v1/commit/user/"; // update userinfo

  public static String SSID = UUID.randomUUID().toString();

  // the 3 parameters bellow those you could get by intercepting traffic on your Android phone using mitmproxy .
  private static final int MANIFEST_VERSION_CODE = 2018053001;
  private static final String MANIFEST_VERSION_NAME = "7.3.0";
  private static final int VERSION_CODE = 730;


  // private static final String USER_AGENT = "com.zhiliaoapp.musically/2018053001 (Linux; U; Android 6.0.1; zh_CN; Nexus 5; Build/M4B30Z; Cronet/58.0.2991.0))";
  public static final String USER_AGENT = String.format("com.zhiliaoapp.musically"
          + "/%s (Linux; U; Android %s; %s_%s; %s; Build/M4B30Z; Cronet/58.0.2991.0))",
      MANIFEST_VERSION_CODE, Utils.getSystemVersion(), Utils.getLanguage(),
      Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()), Utils.getSystemModel());

  /**
   * has error
   * it will show  the update dialog
   */
  public static long generateDeviceID() {
    long min = 6707032413430351621L;
    long max = 6727032413430351621L;
    long rangeLong = min + (((long) (new Random().nextDouble() * (max - min))));
    return rangeLong;
  }


  static {
    HEADER_MAP.put("Connection", "keep-alive");
    HEADER_MAP.put("Content-Type", "application/json;charset=utf-8");
    HEADER_MAP.put("Accept", "application/json");
    HEADER_MAP.put("User-Agent", USER_AGENT);
  }

  static {
    // 貌似aid和iid 决定了签名
    ANTI_SPAMS_MAP.put("as", "a14562c1741aedfd244355");
    ANTI_SPAMS_MAP.put("cp", "2ca2d35f494717d3e1MuUy");
    ANTI_SPAMS_MAP.put("mas", "0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");
  }

  static {
    BASE_PARAMS_MAP.put("mix_mode", "1");
    BASE_PARAMS_MAP.put("ts", Utils.getServerTime() + "");
    BASE_PARAMS_MAP.put("app_type", "normal");
    BASE_PARAMS_MAP.put("os_api", Utils.getSDKInt() + "");

    BASE_PARAMS_MAP.put("device_type", Utils.getSystemModel());
    BASE_PARAMS_MAP.put("ssmix", "a");
    BASE_PARAMS_MAP.put("manifest_version_code", MANIFEST_VERSION_CODE + "");
    BASE_PARAMS_MAP.put("dpi", "180");
    BASE_PARAMS_MAP.put("carrier_region", "");

    BASE_PARAMS_MAP.put("region", "us");
    BASE_PARAMS_MAP.put("app_name", "musical_ly");
    BASE_PARAMS_MAP.put("version_name", MANIFEST_VERSION_NAME);
    BASE_PARAMS_MAP.put("timezone_offset", "28800");
    BASE_PARAMS_MAP.put("is_my_cn", "1");

    BASE_PARAMS_MAP.put("fp", "4STZF2wIcrU7FYmtLlU1LSFIczGb");
    BASE_PARAMS_MAP.put("ac", "wifi");
    BASE_PARAMS_MAP.put("update_version_code", MANIFEST_VERSION_CODE + "");
    BASE_PARAMS_MAP.put("channel", "googleplay");
    BASE_PARAMS_MAP.put("_rticket", System.currentTimeMillis() + "");

    BASE_PARAMS_MAP.put("device_platform", "android");
    BASE_PARAMS_MAP.put("iid", "6707032413430351621");
    BASE_PARAMS_MAP.put("build_number", MANIFEST_VERSION_NAME + "");
    BASE_PARAMS_MAP
        .put("locale", Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()));
    BASE_PARAMS_MAP.put("version_code", VERSION_CODE + "");
    BASE_PARAMS_MAP.put("timezone_name", Utils.getTimeId());

    // BASE_PARAMS_MAP.put("openudid", "357dd49d4c402c29");
    BASE_PARAMS_MAP.put("openudid", Utils.getOpenudid());

    BASE_PARAMS_MAP.put("device_id", "6706013657706825221");
    //   BASE_PARAMS_MAP.put("device_id", generateDeviceID() + "");
    BASE_PARAMS_MAP
        .put("sys_region", Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()));
    BASE_PARAMS_MAP.put("app_language", Utils.getLanguage());
    BASE_PARAMS_MAP
        .put("resolution", Utils.getResolution(TTCommonFieldsManager.getInstance().getContext()));

    BASE_PARAMS_MAP.put("os_version", Utils.getSystemVersion());
    BASE_PARAMS_MAP.put("device_brand", Utils.getDeviceBrand());
    BASE_PARAMS_MAP.put("language", Utils.getLanguage());
    BASE_PARAMS_MAP.put("aid", "1233");
    BASE_PARAMS_MAP.put("mcc_mnc", "");

  }

  public static Map<String, String> getHeaders() {
    return HEADER_MAP;
  }


  public static Map<String, String> getAntiSpamParams() {
    return ANTI_SPAMS_MAP;
  }


  public static Map<String, String> basicParamsMap() {
    BASE_PARAMS_MAP.put("ts", Utils.getServerTime() + "");
    BASE_PARAMS_MAP.put("_rticket", System.currentTimeMillis() + "");
    return BASE_PARAMS_MAP;
  }



}
