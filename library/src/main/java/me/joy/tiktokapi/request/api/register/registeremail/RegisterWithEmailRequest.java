package me.joy.tiktokapi.request.api.register.registeremail;

import java.util.HashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBasePostRequest;
import me.joy.tiktokapi.utils.Utils;

/**
 * Created by Joy on 2019-06-24
 */
public class RegisterWithEmailRequest extends TTBasePostRequest<RegisterResponseData> {

  private String email="";
  private String password ="";
  private String code ="";

  public RegisterWithEmailRequest(String email, String password, String captcha) {
    this.email = email;
    this.password = password;
    this.code = captcha;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_EMAIL_REGISTER;
  }

  @Override
  protected Map<String, String> getParams() {
    Map<String, String> map = new HashMap<>();
   // map.put("username", "");
    map.put("email",Utils.encryptWithXOR(email));
   // map.put("mobile", "");
  //  map.put("account", "");
    map.put("password",Utils.encryptWithXOR(password));
    map.put("code",code);
    return map;
  }


}
