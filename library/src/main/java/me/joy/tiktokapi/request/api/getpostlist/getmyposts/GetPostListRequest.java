package me.joy.tiktokapi.request.api.getpostlist.getmyposts;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class GetPostListRequest extends TTBaseGetRequest<GetPostListResponseData> {


  private String userId;
  private int max_cursor = 0;
  private int count = 20;

  public GetPostListRequest(String userId) {
    this.userId = userId;
  }

  public GetPostListRequest(String userId, int count) {
    this.userId = userId;
    this.count = count;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_GET_POST_LIST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("max_cursor", max_cursor+"");
    queryParameterMap.put("user_id", userId);
    queryParameterMap.put("retry_type", "no_retry");
    queryParameterMap.put("count", count+"");
    queryParameterMap.put("uoo", "0");

    return queryParameterMap;
  }


}
