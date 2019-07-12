package me.joy.tiktokapi.request;


import java.util.HashMap;
import java.util.Map;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.response.TTBaseResponseData;

public abstract class TTBaseRequest<R extends TTBaseResponseData> {

  protected TTRequestCallBack<R> mInsRequestCallBack;
  private String tag = "";

  protected String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  protected String getRequestUrl() {
    return APIConfig.API_V2 + getActionUrl();
  }

  protected abstract String getActionUrl();

  protected abstract void execute();

  public void execute(TTRequestCallBack<R> insRequestCallBack) {
    this.mInsRequestCallBack = insRequestCallBack;
    execute();
  }


  protected abstract Map<String, String> getParams();

  protected Map<String, String> appendParams() {
    Map<String, String> map = new HashMap<>();
    map.putAll(getParams());
    map.putAll(APIConfig.basicParamsMap());
    if (isAddAntiSpamParams()) {
      map.putAll(APIConfig.getAntiSpamParams());
    }
    return map;
  }

  protected boolean isAddAntiSpamParams() {
    return true;
  }
}
