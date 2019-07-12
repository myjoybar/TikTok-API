package me.joy.tiktokapi.response;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import me.dt.libok.handler.OKGlobalHandler;
import me.dt.libok.response.callback.IResponseCallBackHandler;
import me.dt.libok.test.log.LLog;
import me.joy.tiktokapi.response.exception.TTExceptionHandler;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

public abstract class TTGsonResponseHandler<T> implements IResponseCallBackHandler {

  private static String TAG = "TTGsonResponseHandler";
  private static final String TT_API_MESSAGE_SUCCESS_STATUS = "success";
  private static final String TT_API_STATUS_SUCCESS_STATUS = "0";
  private Type mType;

  private Type getType() {
    return mType;
  }

  public TTGsonResponseHandler() {
    generateType();
  }

  public TTGsonResponseHandler(Type type) {
    mType = type;
  }

  public void generateType() {
    Type type = getClass().getGenericSuperclass();    //反射获取带泛型的class
    if (type instanceof Class) {
      throw new RuntimeException("miss the type parameter");
    }
    ParameterizedType parameter = (ParameterizedType) type;      //获取所有泛型
    mType = $Gson$Types.canonicalize(parameter.getActualTypeArguments()[0]);  //将泛型转为type
  }

  @Override
  public void onStart() {

  }

  @Override
  public void onSuccess(final Response response) {
    ResponseBody responseBody = response.body();
    if (null == responseBody) {
      onTTFailure(0, buildErrorResponseData("response.body is empty"));
      return;
    }
    String responseBodyStr = "";
    try {
      responseBodyStr = responseBody.string();
    } catch (IOException e) {
      e.printStackTrace();
      onTTFailure(0,
          buildErrorResponseData(
              String.format("responseBody.string() occurs error, error msg = %s", e.getMessage())));
      return;
    } finally {
      responseBody.close();
    }
    LLog.d(TAG, "responseBody.string =   " + responseBodyStr);
    try {

      // 返回的json数据格式竟然不统一！！！
      JSONObject jsonObject = new JSONObject(responseBodyStr);
      String resultStatus = "";
      if (jsonObject.has("message")) {
        // login
        resultStatus = jsonObject.optString("message");
      } else if (jsonObject.has("status_code")) {
        //  getUserInfo
        resultStatus = String.valueOf(jsonObject.optInt("status_code"));

      }
      // block_code 和 status_code = 0 可能同时存在
      boolean containsBlockCode = jsonObject.has("block_code");
      boolean isSuccess =
          TT_API_MESSAGE_SUCCESS_STATUS.equals(resultStatus) || TT_API_STATUS_SUCCESS_STATUS
              .equals(resultStatus) && !containsBlockCode;
      Gson gson = new Gson();
      if (isSuccess) {
        final T result = (T) gson.fromJson(responseBodyStr, getType());
        OKGlobalHandler.getInstance().post(new Runnable() {
          @Override
          public void run() {
            LLog.d(TAG, "parse the json response data success");
            LLog.d(TAG, String.format("request %s success", response.request().url().toString()));
            onSuccess(response.code(), result);
          }
        });
      } else {
        final BaseErrorResponseData baseErrorResponseData = gson
            .fromJson(responseBodyStr, BaseErrorResponseData.class);
        OKGlobalHandler.getInstance().post(new Runnable() {
          @Override
          public void run() {
            LLog.e(TAG, "the tt api response message is error");
            if (null != baseErrorResponseData) {
              // 因为接口返回数据格式不一致，status_msg和message都可能包含了提示信息，所以为了统一，把两个都赋值
              if (TextUtils.isEmpty(baseErrorResponseData.getMessage()) && !TextUtils
                  .isEmpty(baseErrorResponseData.getStatus_msg())) {
                baseErrorResponseData.setMessage(baseErrorResponseData.getStatus_msg());
              } else if (!TextUtils.isEmpty(baseErrorResponseData.getMessage()) && TextUtils
                  .isEmpty(baseErrorResponseData.getStatus_msg())) {
                baseErrorResponseData.setStatus_msg(baseErrorResponseData.getMessage());
              }
              if (baseErrorResponseData.getData() != null && !TextUtils
                  .isEmpty(baseErrorResponseData.getData().getDescription())) {
                String description = baseErrorResponseData.getData().getDescription();
                baseErrorResponseData.setStatus_msg(description);
                baseErrorResponseData.setMessage(description);
              }
              onTTFailure(0, baseErrorResponseData);
              TTExceptionHandler.getInstance().handle(baseErrorResponseData);
            }

          }
        });
      }


    } catch (final Exception e) {
      OKGlobalHandler.getInstance().post(new Runnable() {
        @Override
        public void run() {
          onTTFailure(0, buildErrorResponseData(String
              .format("parse the json response data occurs error, error msg = %s",
                  e.getMessage())));

        }
      });

    }
  }


  public void onTTFailure(int errorCode, BaseErrorResponseData errorResponseData) {
    LLog.e(TAG,
        String.format("errorCode= %s , errorMsg = %s", errorCode, errorResponseData.toString()));
  }


  public abstract void onSuccess(int statusCode, T response);


  @Override
  public void onProgress(long currentBytes, long totalBytes) {

  }

  @Override
  public void onCancel() {

  }

  @Override
  public void onFinish() {

  }

  @Override
  public void onFailure(int i, String s) {

  }

  BaseErrorResponseData buildErrorResponseData(String msg) {
    BaseErrorResponseData baseErrorResponseData = new BaseErrorResponseData();
    baseErrorResponseData.setMessage(msg);
    baseErrorResponseData.setStatus_msg(msg);
    return baseErrorResponseData;
  }
}
