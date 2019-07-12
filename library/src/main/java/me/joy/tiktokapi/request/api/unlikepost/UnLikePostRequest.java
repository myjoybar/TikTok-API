package me.joy.tiktokapi.request.api.unlikepost;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class UnLikePostRequest extends TTBaseGetRequest<UnLikePostRequestResponse> {


  private String aweme_id;

  public UnLikePostRequest(String aweme_id) {
    this.aweme_id = aweme_id;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_UNLIKE_POST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("aweme_id", aweme_id);
    queryParameterMap.put("type", "0");// 0 : unLike,1 :like
    queryParameterMap.put("retry_type", "no_retry");

    return queryParameterMap;
  }

}
