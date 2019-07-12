package me.joy.tiktokapi.request.api.getfollower;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class GetFollowerListRequest extends TTBaseGetRequest<GetFollowerListResponseData> {


  private String userId;
  private int count = 20;

  public GetFollowerListRequest(String userId) {
    this.userId = userId;
  }

  public GetFollowerListRequest(String userId, int count) {
    this.userId = userId;
    this.count = count;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_GET_FOLLOWER_LIST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("user_id", userId);
    queryParameterMap.put("retry_type", "no_retry");
    queryParameterMap.put("count", count+"");
    return queryParameterMap;
  }

  @Override
  protected boolean isAddAntiSpamParams() {
    return false;
  }
}
