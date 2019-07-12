package me.joy.tiktokapi.request.api.likepost;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class LikePostRequest extends TTBaseGetRequest<LikePostRequestResponse> {


  private String aweme_id;

  public LikePostRequest(String aweme_id) {
    this.aweme_id = aweme_id;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_LIKE_POST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("aweme_id", aweme_id);
    queryParameterMap.put("type", "1");// 0 : unLike,1 :like
    queryParameterMap.put("retry_type", "no_retry");

    return queryParameterMap;
  }

}
