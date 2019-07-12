package me.joy.tiktokapi.config;

import android.content.Context;

/**
 * Created by Joy on 2019-06-24
 */
public class TTCommonFieldsManager {


  private Context mContext;

  private static class TTCommonFieldsManagerHolder {
    private static TTCommonFieldsManager INSTANCE = new TTCommonFieldsManager();
  }

  public static TTCommonFieldsManager getInstance() {
    return TTCommonFieldsManagerHolder.INSTANCE;
  }

  public void init(Context context) {
    mContext = context.getApplicationContext();
  }

  public Context getContext() {
    return mContext;
  }


}
