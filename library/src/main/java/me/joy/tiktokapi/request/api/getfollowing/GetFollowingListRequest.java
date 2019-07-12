package me.joy.tiktokapi.request.api.getfollowing;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;
import me.joy.tiktokapi.utils.Utils;

/**
 * Created by Joy on 2019-06-24
 */
public class GetFollowingListRequest extends TTBaseGetRequest<GetFollowingListResponseData> {


  private String userId;
  private int count = 20;

  public GetFollowingListRequest(String userId) {
    this.userId = userId;
  }

  public GetFollowingListRequest(String userId, int count) {
    this.userId = userId;
    this.count = count;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_GET_FOLLOWING_LIST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("user_id", userId);
    queryParameterMap.put("retry_type", "no_retry");
    queryParameterMap.put("count", count+"");
    queryParameterMap.put("max_time:", Utils.getServerTime()+"");
    return queryParameterMap;
  }

  @Override
  protected boolean isAddAntiSpamParams() {
    return false;
  }
}
