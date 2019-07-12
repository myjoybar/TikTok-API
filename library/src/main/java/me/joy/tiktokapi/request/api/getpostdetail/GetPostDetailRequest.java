package me.joy.tiktokapi.request.api.getpostdetail;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class GetPostDetailRequest extends TTBaseGetRequest<GetPostDetailRequestResponse> {

  /**
   * {"status_msg":"参数不合法","log_pb":{"impr_id":"20190702061625010110141086217599"},"status_code":5}
   */

  private String aweme_id; // form play_addr

  public GetPostDetailRequest(String aweme_id) {
    this.aweme_id = aweme_id;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_GET_POST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("aweme_id", aweme_id);
    queryParameterMap.put("retry_type", "no_retry");
    queryParameterMap.put("line", "0");
    queryParameterMap.put("media_type", "4");
    queryParameterMap.put("vr_type", "0");
    queryParameterMap.put("improve_bitrate", "0");
    queryParameterMap.put("is_play_url", "1");
    queryParameterMap.put("quality_type", "20");
    queryParameterMap.put("pass-region", "1");
    queryParameterMap.put("pass-route", "1");


    return queryParameterMap;
  }

  @Override
  protected boolean isAddAntiSpamParams() {
    return false;
  }
}
