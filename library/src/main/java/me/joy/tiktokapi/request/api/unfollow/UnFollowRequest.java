package me.joy.tiktokapi.request.api.unfollow;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class UnFollowRequest extends TTBaseGetRequest<UnFollowRequestResponse> {


  private String user_id;

  public UnFollowRequest(String user_id) {
    this.user_id = user_id;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_FOLLOW;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("user_id", user_id);
    queryParameterMap.put("type", "0"); // 0 : unfollow,1 :follow
    queryParameterMap.put("retry_type", "no_retry");

    return queryParameterMap;
  }

}
