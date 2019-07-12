package me.joy.tiktokapi.request.api.register.registerusername;

import java.util.HashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBasePostRequest;
import me.joy.tiktokapi.request.api.register.registeremail.RegisterResponseData;
import me.joy.tiktokapi.utils.Utils;

/**
 * Created by Joy on 2019-06-24
 */
public class RegisterWithUserNameRequest extends TTBasePostRequest<RegisterResponseData> {

  private String username="";
  private String password ="";
  private String captcha ="";

  public RegisterWithUserNameRequest(String username, String password, String captcha) {
    this.username = username;
    this.password = password;
    this.captcha = captcha;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_LOGIN;
  }

  @Override
  protected Map<String, String> getParams() {
    Map<String, String> map = new HashMap<>();

    map.put("username",Utils.encryptWithXOR(username));
    map.put("email","");
    map.put("mobile","");
    map.put("account","");
    map.put("password",Utils.encryptWithXOR(password));
    map.put("captcha",captcha);

    return map;
  }

//  @Override
//  protected Map<String, String> getUrlMapParams() {
//
//
//    Map<String, String> map = new HashMap<>();
//
//
//    map.put("mix_mode","1");
//    map.put("username","");
//    map.put("email",Utils.encryptWithXOR(email));
//    map.put("mobile","");
//    map.put("account","");
//
//    map.put("password",Utils.encryptWithXOR(password));
//    map.put("captcha",captcha);
//    map.put("ts",Utils.getServerTime()+"");
//    map.put("app_type","normal");
//    map.put("os_api","23");
//
//
//    map.put("device_type","Nexus5");
//    map.put("ssmix","a");
//    map.put("manifest_version_code","2018053001");
//    map.put("dpi","180");
//    map.put("carrier_region","");
//
//
//    map.put("region","us");
//    map.put("app_name","musical_ly");
//    map.put("version_name","7.3.0");
//    map.put("timezone_offset","28800");
//    map.put("is_my_cn","1");
//
//
//
//    map.put("fp","4STZF2wIcrU7FYmtLlU1LSFIczGb");
//    map.put("ac","wifi");
//    map.put("update_version_code","2018053001");
//    map.put("channel","googleplay");
//    map.put("rticket",System.currentTimeMillis()+"");
//
//
//    map.put("device_platform","android");
//    map.put("iid","6707032413430351621");
//    map.put("build_number","7.3.0");
//    map.put("version_code","730");
//    map.put("timezone_name",Utils.getTimeId());
//
//
//    map.put("openudid","357dd49d4c402c29");
//    map.put("device_id","6706013657706825221");
//    map.put("sys_region",Utils.getLocale(TTCommonFieldsManager.getInstance().getContext()));
//    map.put("app_language","en");
//    map.put("resolution","1080*1776");
//
//
//    map.put("os_version","6.0.1");
//    map.put("device_brand","google");
//    map.put("language",Utils.getLanguage());
//    map.put("aid","1233");
//    map.put("mcc_mnc","");
//
//
//    map.put("as","a14562c1741aedfd244355");
//    map.put("cp","2ca2d35f494717d3e1MuUy");
//    map.put("mas","0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");
//
//
//    // 貌似aid和iid 决定了签名
//
////    map.put("as","a14562c1741aedfd244355");
////    map.put("cp","2ca2d35f494717d3e1MuUy");
////    map.put("mas","0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");
//
//
//    return map;
//  }



//  @Override
//  protected Map<String, String> getUrlMapParams() {
//
//
//    Map<String, String> map = new HashMap<>();
//
//
//    map.put("mix_mode","1");
//    map.put("username","");
//    map.put("email","6f6a7c2b61606b6245616c6b62716a6b602b6860");
//    map.put("mobile","");
//    map.put("account","");
//
//    map.put("password","3437363130336c6b7671");
//    map.put("captcha","");
//    map.put("ts","1561603492");
//    map.put("app_type","normal");
//    map.put("os_api","23");
//
//
//    map.put("device_type","Nexus5");
//    map.put("ssmix","a");
//    map.put("manifest_version_code","2018053001");
//    map.put("dpi","180");
//    map.put("carrier_region","");
//
//
//    map.put("region","us");
//    map.put("app_name","musical_ly");
//    map.put("version_name","7.3.0");
//    map.put("timezone_offset","28800");
//    map.put("is_my_cn","1");
//
//
//
//    map.put("fp","4STZF2wIcrU7FYmtLlU1LSFIczGb");
//    map.put("ac","wifi");
//    map.put("update_version_code","2018053001");
//    map.put("channel","googleplay");
//    map.put("rticket",System.currentTimeMillis()+"");
//
//
//    map.put("device_platform","android");
//    map.put("iid","6707032413430351621");
//    map.put("build_number","7.3.0");
//    map.put("version_code","730");
//    map.put("timezone_name","Asia/Shanghai");
//
//
//    map.put("openudid","357dd49d4c402c29");
//    map.put("device_id","6706013657706825221");
//    map.put("sys_region","CN");
//    map.put("app_language","en");
//    map.put("resolution","1080*1776");
//
//
//    map.put("os_version","6.0.1");
//    map.put("device_brand","google");
//    map.put("language","zh");
//    map.put("aid","1233");
//    map.put("mcc_mnc","");
//
//
//    map.put("as","a14562c1741aedfd244355");
//    map.put("cp","2ca2d35f494717d3e1MuUy");
//    map.put("mas","0084e909799002c08cb38f2abf13aad0feacaccc2c2c4c266626a6");
//
//
//    return map;
//  }


}
