package me.joy.tiktokapi.request.api.playpost;

import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBaseGetRequest;

/**
 * Created by Joy on 2019-06-24
 */
public class PlayPostRequest extends TTBaseGetRequest<PlayPostRequestResponse> {


  private String video_id; // form play_addr

  public PlayPostRequest(String video_id) {
    this.video_id = video_id;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_PLAY_POST;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("video_id", video_id);
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
