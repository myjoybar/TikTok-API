package me.joy.tiktokapi.request.api.postcomment;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBasePostRequest;

/**
 * Created by Joy on 2019-06-24 form 提交
 */
public class PostCommentRequest extends TTBasePostRequest<PostCommentRequestResponse> {


  private String aweme_id;
  private String text = "";

  public PostCommentRequest(String aweme_id, String text) {
    this.aweme_id = aweme_id;
    this.text = text;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_POST_COMMENT;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("aweme_id", aweme_id);
    queryParameterMap.put("text", text);
    queryParameterMap.put("text_extra", "[]");
    queryParameterMap.put("is_self_see", "0");
    return queryParameterMap;
  }


  @Override
  protected TypePost getTypePost() {
    return TypePost.POST_FORM;
  }
}
