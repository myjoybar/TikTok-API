package me.joy.tiktokapi.request.api.uploadimg;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import me.dt.libok.request.PostFileRequestBuilder;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.request.TTBasePostRequest;

/**
 * Created by Joy on 2019-06-24 form 提交
 */
public class UploadImgRequest extends TTBasePostRequest<UploadImgRequestResponse> {



  public UploadImgRequest(Map<String, File> files) {
    PostFileRequestBuilder postFileRequestBuilder = (PostFileRequestBuilder) getRequestBuilder();
    postFileRequestBuilder.files(files);
  }

  @Override
  protected String getActionUrl() {
    return APIConfig.ACTION_UPLOAD_IMG;
  }


  @Override
  protected Map<String, String> getParams() {
    Map<String, String> queryParameterMap = new LinkedHashMap<>();
    queryParameterMap.put("retry_type", "no_retry");
    return queryParameterMap;
  }


  @Override
  protected TypePost getTypePost() {
    return TypePost.POST_FILE;
  }

  @Override
  protected boolean isAddAntiSpamParams() {
    return false;
  }
}
