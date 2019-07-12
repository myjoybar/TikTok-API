//package me.joy.tiktokapi.utils.test;
//
//import android.text.TextUtils;
//import com.ss.android.common.applog.GlobalContext;
//import com.ss.android.common.applog.UserInfo;
//import com.ss.android.common.applog.i;
//import com.ss.android.ugc.aweme.app.a.g;
//import com.ss.android.ugc.aweme.app.h;
//import com.ss.sys.ces.d.a;
//import java.net.URLDecoder;
//import java.util.ArrayList;
//import java.util.List;
//import okhttp3.HttpUrl;
//import okhttp3.HttpUrl.Builder;
//
//public class c
//{
//  public static HttpUrl appendAntiSpamParams(HttpUrl paramHttpUrl, List<String> paramList, int paramInt)
//  {
//    Object localObject = URLDecoder.decode(paramHttpUrl.toString());
//    String str = com.ss.android.deviceregister.b.getDeviceId();
//    if (str == null) {
//      str = "";
//    }
//    for (;;)
//    {
//      if ((((String)localObject).contains("&device_id=")) || (((String)localObject).contains("?device_id=")))
//      {
//        paramList = UserInfo.getUserInfo(paramInt, (String)localObject, (String[])paramList.toArray(new String[paramList.size()]), str);
//        paramHttpUrl = paramHttpUrl.newBuilder();
//        paramInt = paramList.length();
//        if (TextUtils.isEmpty(paramList)) {
//          break label221;
//       }
//        if (paramInt % 2 != 0) {
//          break label202;
//        }
//        str = paramList.substring(0, paramInt >> 1);
//        localObject = com.ss.sys.ces.d.b.getSDK(GlobalContext.getContext(), com.ss.android.ugc.aweme.app.c.getInst().getAid());
//        ((a)localObject).setSession(g.getSessionId());
//        localObject = i.byteArrayToHexStr(((a)localObject).encode(str.getBytes()));
//        paramHttpUrl.addQueryParameter("as", str).addQueryParameter("cp", paramList.substring(paramInt >> 1, paramInt)).addQueryParameter("mas", (String)localObject);
//      }
//      for (;;)
//      {
//        return paramHttpUrl.build();
//        paramList = UserInfo.getUserInfo(paramInt, (String)localObject, (String[])paramList.toArray(new String[paramList.size()]), "");
//        break;
//        label202:Ò
//        paramHttpUrl.addQueryParameter("as", "a1qwert123").addQueryParameter("cp", "cbfhckdckkde1");
//        continue;
//        label221:
//        paramHttpUrl.addQueryParameter("as", "a1iosdfgh").addQueryParameter("cp", "androide1");
//      }
//    }
//  }
//
//  public static List<String> queryStringToNamesAndValues(String paramString)
//  {
//    ArrayList localArrayList = new ArrayList();
//    int i = 0;
//    if (i <= paramString.length())
//    {
//      int k = paramString.indexOf('&', i);
//      int j = k;
//      if (k == -1) {
//        j = paramString.length();
//      }
//      k = paramString.indexOf('=', i);
//      if ((k == -1) || (k > j))
//      {
//        localArrayList.add(URLDecoder.decode(paramString.substring(i, j)));
//        localArrayList.add(null);
//      }
//      for (;;)
//      {
//        i = j + 1;
//        break;
//        localArrayList.add(URLDecoder.decode(paramString.substring(i, k)));
//        localArrayList.add(URLDecoder.decode(paramString.substring(k + 1, j)));
//      }
//    }
//    return localArrayList;
//  }
//}
