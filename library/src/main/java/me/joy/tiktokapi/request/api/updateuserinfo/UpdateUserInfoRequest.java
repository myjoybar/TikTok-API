package me.joy.tiktokapi.request.api.updateuserinfo;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBasePostRequest;

/**
 * Created by Joy on 2019-06-24 form 提交
 */
public class UpdateUserInfoRequest extends TTBasePostRequest<UpdateUserInfoRequestResponse> {


  private String nickname;
  private String avatar_uri;
  private String signature;


  public UpdateUserInfoRequest(String nickname, String avatar_uri, String signature) {
    this.nickname = nickname;
    this.avatar_uri = avatar_uri;
    this.signature = signature;
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_UPDATE_USER_INFO;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    if(!TextUtils.isEmpty(nickname)){
      queryParameterMap.put("nickname", nickname);
    }
    if(!TextUtils.isEmpty(avatar_uri)){
      queryParameterMap.put("avatar_uri", avatar_uri); //musically-maliva-obj/1638459719086086
    }

    queryParameterMap.put("is_binded_weibo", "0");
    queryParameterMap.put("retry_type", "no_retry");
    queryParameterMap.put("school_type", "0");

    if(!TextUtils.isEmpty(signature)){
      queryParameterMap.put("signature", signature);
    }
    return queryParameterMap;
  }


  @Override
  protected TypePost getTypePost() {
    return TypePost.POST_FORM;
  }

  @Override
  protected boolean isAddAntiSpamParams() {
    return false;
  }
}
