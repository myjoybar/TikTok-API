package me.joy.tiktokapi.request.api.getuserinfo;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class UserInfoRequest extends TTBaseGetRequest<UserInfoResponseData> {

  private String userId;

  public UserInfoRequest(String userId) {
    this.userId = userId;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_GET_USER_INFO;
  }

  @Override
  protected Map<String, String>  getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("user_id", userId);
    queryParameterMap.put("retry_type", "no_retry");
    return queryParameterMap;


  }
}
