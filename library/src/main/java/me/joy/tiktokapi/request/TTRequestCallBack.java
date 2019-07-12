package me.joy.tiktokapi.request;


import me.joy.tiktokapi.response.BaseErrorResponseData;

public interface TTRequestCallBack<R> {

  void onSuccess(int statusCode, R baseData);

  void onFailure(int errorCode, BaseErrorResponseData errorResponseData);
}
