package me.joy.tiktokapi.request;

import android.util.Log;
import com.google.gson.internal.$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import me.dt.libok.OkHttpManager;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.response.BaseErrorResponseData;
import me.joy.tiktokapi.response.TTBaseResponseData;
import me.joy.tiktokapi.response.TTGsonResponseHandler;

public abstract class TTBaseGetRequest<R extends TTBaseResponseData> extends TTBaseRequest<R> {

  protected static final String TAG = "TTBaseGetRequest";

  @Override
  protected void execute() {
    OkHttpManager.getInstance()
        .get(getRequestUrl())
        .addHeaders(APIConfig.getHeaders())
        .addParams(appendParams())
        .tag(getTag())
        .execute(new TTGsonResponseHandler<R>(getType()) {

          @Override
          public void onTTFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            super.onTTFailure(errorCode, errorResponseData);
            if (null != mInsRequestCallBack) {
              mInsRequestCallBack.onFailure(errorCode, errorResponseData);
            }
          }

          @Override
          public void onSuccess(int statusCode, R insBaseData) {
            Log.d(TAG, String.format("request %s success", getActionUrl()));
            if (null != mInsRequestCallBack) {
              mInsRequestCallBack.onSuccess(statusCode, insBaseData);
            }
          }
        });
  }

  /**
   * get the R class type
   */
  protected Type getType() {
    Class<?> classZ = getClass();
    Type type = classZ.getGenericSuperclass();
    if (type instanceof Class) {
      throw new RuntimeException("miss the type parameter");
    }
    ParameterizedType parameter = (ParameterizedType) type;
    return $Gson$Types.canonicalize(parameter.getActualTypeArguments()[0]);
  }


}
