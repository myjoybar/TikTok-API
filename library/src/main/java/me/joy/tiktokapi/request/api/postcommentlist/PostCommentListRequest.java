package me.joy.tiktokapi.request.api.postcommentlist;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class PostCommentListRequest extends TTBaseGetRequest<PostCommentListRequestResponse> {


  private String aweme_id;
  private int cursor = 0;
  private int count = 20;


  public PostCommentListRequest(String aweme_id, int cursor, int count) {
    this.aweme_id = aweme_id;
    this.cursor = cursor;
    this.count = count;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_POST_COMMENT_LIST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("aweme_id", aweme_id);
    queryParameterMap.put("cursor", cursor+"");
    queryParameterMap.put("count", count+"");
    queryParameterMap.put("comment_style", "2");
    queryParameterMap.put("digged_cid", "");
    queryParameterMap.put("insert_cids", "");
    return queryParameterMap;
  }

}
