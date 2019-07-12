package me.joy.tiktokapp;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import me.dt.libok.OkHttpManager;
import me.dt.libok.configdata.OKConfigData;
import me.joy.tiktokapi.config.APIConfig;
import me.joy.tiktokapi.config.TTCommonFieldsManager;
import me.joy.tiktokapi.request.TTRequestCallBack;
import me.joy.tiktokapi.request.api.follow.FollowRequest;
import me.joy.tiktokapi.request.api.follow.FollowRequestResponse;
import me.joy.tiktokapi.request.api.getfollower.GetFollowerListRequest;
import me.joy.tiktokapi.request.api.getfollower.GetFollowerListResponseData;
import me.joy.tiktokapi.request.api.getfollowing.GetFollowingListRequest;
import me.joy.tiktokapi.request.api.getfollowing.GetFollowingListResponseData;
import me.joy.tiktokapi.request.api.getpostdetail.GetPostDetailRequest;
import me.joy.tiktokapi.request.api.getpostdetail.GetPostDetailRequestResponse;
import me.joy.tiktokapi.request.api.getpostlist.getmyposts.GetPostListRequest;
import me.joy.tiktokapi.request.api.getpostlist.getmyposts.GetPostListResponseData;
import me.joy.tiktokapi.request.api.getuserinfo.UserInfoRequest;
import me.joy.tiktokapi.request.api.getuserinfo.UserInfoResponseData;
import me.joy.tiktokapi.request.api.likepost.LikePostRequest;
import me.joy.tiktokapi.request.api.likepost.LikePostRequestResponse;
import me.joy.tiktokapi.request.api.login.LoginManager;
import me.joy.tiktokapi.request.api.playpost.PlayPostRequest;
import me.joy.tiktokapi.request.api.playpost.PlayPostRequestResponse;
import me.joy.tiktokapi.request.api.postcomment.PostCommentRequest;
import me.joy.tiktokapi.request.api.postcomment.PostCommentRequestResponse;
import me.joy.tiktokapi.request.api.postcommentlist.PostCommentListRequest;
import me.joy.tiktokapi.request.api.postcommentlist.PostCommentListRequestResponse;
import me.joy.tiktokapi.request.api.register.registeremail.RegisterResponseData;
import me.joy.tiktokapi.request.api.register.registeremail.RegisterWithEmailRequest;
import me.joy.tiktokapi.request.api.unfollow.UnFollowRequest;
import me.joy.tiktokapi.request.api.unfollow.UnFollowRequestResponse;
import me.joy.tiktokapi.request.api.unlikepost.UnLikePostRequest;
import me.joy.tiktokapi.request.api.unlikepost.UnLikePostRequestResponse;
import me.joy.tiktokapi.request.api.updateuserinfo.UpdateUserInfoRequest;
import me.joy.tiktokapi.request.api.updateuserinfo.UpdateUserInfoRequestResponse;
import me.joy.tiktokapi.request.api.uploadimg.UploadImgRequest;
import me.joy.tiktokapi.request.api.uploadimg.UploadImgRequestResponse;
import me.joy.tiktokapi.response.BaseErrorResponseData;
import me.joy.tiktokapi.utils.Utils;

public class MainActivity extends AppCompatActivity implements OnClickListener {

  private static final String TAG = "MainActivity";

  //  String email = "joy.deng@dingtone.me";


  String email = "joy.deng@dingtone.me";
  String pwd = "123456inst";

//  String username1 = "joy.deng";
//  String pwd = "123456inst";


  String userIDSeal = "6707147633864098821";
  String userIdMe = "6706016724343882758";
  String userIdLocke = "6705973372813394949";


  String username2 = "user2983174988923";

//    String email = "seal.wu@dingtone.me";
//  String pwd = "a12345678";

//      String email = "jose.han@dingtone.me";
//  String pwd = "123456abc";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TTCommonFieldsManager.getInstance().init(getApplicationContext());
    initOkManager();
    test();
    initListener();


  }


  private void initListener() {
    findViewById(R.id.btn_login1).setOnClickListener(this);
    findViewById(R.id.btn_login2).setOnClickListener(this);
    findViewById(R.id.btn_get_user_info).setOnClickListener(this);
    findViewById(R.id.btn_get_followers).setOnClickListener(this);
    findViewById(R.id.btn_get_following).setOnClickListener(this);
    findViewById(R.id.btn_get_post).setOnClickListener(this);
    findViewById(R.id.btn_get_post_list).setOnClickListener(this);
    findViewById(R.id.btn_get_post_favorite_list).setOnClickListener(this);
    findViewById(R.id.btn_play_post).setOnClickListener(this);
    findViewById(R.id.btn_unfollow_an_user).setOnClickListener(this);
    findViewById(R.id.btn_follow_an_user).setOnClickListener(this);
    findViewById(R.id.btn_like_post).setOnClickListener(this);
    findViewById(R.id.btn_unlike_post).setOnClickListener(this);
    findViewById(R.id.btn_post_commnent).setOnClickListener(this);
    findViewById(R.id.btn_post_commnent_list).setOnClickListener(this);
    findViewById(R.id.btn_upload_image).setOnClickListener(this);
    findViewById(R.id.btn_update_userinfo).setOnClickListener(this);

  }

  private void initOkManager() {
    OKConfigData okConfigData = new OKConfigData();
    ClearableCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(),
        new SharedPrefsCookiePersistor(getApplicationContext()));
    okConfigData.setCookiesJar(cookieJar);
    OkHttpManager.getInstance().init(okConfigData);

  }

  @Override
  public void onClick(View v) {

    int id = v.getId();
    switch (id) {
      case R.id.btn_login1:
        LoginManager.getInstance().loginWithEmail(this, email, pwd, "");

        break;
      case R.id.btn_login2:
        LoginManager.getInstance().loginWithUserName(this, username2, pwd, "");
        break;
      case R.id.btn_get_user_info:
        UserInfoRequest userInfoRequest = new UserInfoRequest(userIdMe);
        userInfoRequest.execute(new TTRequestCallBack<UserInfoResponseData>() {
          @Override
          public void onSuccess(int statusCode, UserInfoResponseData baseData) {
            Toast.makeText(getApplicationContext(),
                "getUser Success = " + baseData.getUser().getNickname(), Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "getUser onFailure  = " + errorResponseData.getStatus_msg(), Toast.LENGTH_LONG)
                .show();

          }
        });
        break;
      case R.id.btn_get_followers:
        GetFollowerListRequest getFollowerListRequest = new GetFollowerListRequest(userIdMe);
        getFollowerListRequest.execute(new TTRequestCallBack<GetFollowerListResponseData>() {
          @Override
          public void onSuccess(int statusCode, GetFollowerListResponseData baseData) {
            Toast.makeText(getApplicationContext(),
                "getFollowerListRequest Success = " + baseData.getFollowers().get(0).getNickname(),
                Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "GetFollowerListRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_get_following:
        GetFollowingListRequest getFollowingListRequest = new GetFollowingListRequest(userIdMe);
        getFollowingListRequest.execute(new TTRequestCallBack<GetFollowingListResponseData>() {
          @Override
          public void onSuccess(int statusCode, GetFollowingListResponseData baseData) {
            if (baseData.getFollowings().size() != 0) {
              Toast.makeText(getApplicationContext(),
                  "getFollowingListRequest Success = " + baseData.getFollowings().get(0)
                      .getNickname(), Toast.LENGTH_LONG).show();
            }
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "getFollowingListRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_get_post_list:
        GetPostListRequest getPostListRequest = new GetPostListRequest(userIdLocke);
        getPostListRequest.execute(new TTRequestCallBack<GetPostListResponseData>() {
          @Override
          public void onSuccess(int statusCode, GetPostListResponseData baseData) {
            Log.d(TAG,
                "GetPostListRequest =  " + baseData.getAweme_list().get(0).getVideo().getPlay_addr()
                    .getUrl_list().get(0));
            String video_id = baseData.getAweme_list().get(0).getVideo().getPlay_addr().getUri();
            String aweme_id = baseData.getAweme_list().get(0).getStatistics().getAweme_id();
            Toast.makeText(getApplicationContext(), "size= " + baseData.getAweme_list().size(),
                Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "getPostListRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_get_post_favorite_list:



        String email = "jarvis.cai@digtone.me";
        String pwd = "123456inst";

        RegisterWithEmailRequest registerWithEmailRequest = new RegisterWithEmailRequest(email,pwd,"");
        registerWithEmailRequest.execute(new TTRequestCallBack<RegisterResponseData>() {
          @Override
          public void onSuccess(int statusCode, RegisterResponseData baseData) {
            Log.d(TAG,
                "GetPostListRequest =  " );

          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "getPostListRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });


        // 目前没有数据
//        GetPostFavoriteListRequest getPostFavoriteListRequest = new GetPostFavoriteListRequest(userIdLocke);
//        getPostFavoriteListRequest.execute(new TTRequestCallBack<GetFavoritePostListResponseData>() {
//          @Override
//          public void onSuccess(int statusCode, GetFavoritePostListResponseData baseData) {
//            Log.d(TAG,
//                "GetPostFavoriteListRequest =  " + baseData.getAweme_list().get(0).getVideo().getPlay_addr()
//                    .getUrl_list().get(0));
//            String video_id = baseData.getAweme_list().get(0).getVideo().getPlay_addr().getUri();
//            String aweme_id = baseData.getAweme_list().get(0).getStatistics().getAweme_id();
//            Toast.makeText(getApplicationContext(), "size= " + baseData.getAweme_list().size(),
//                Toast.LENGTH_LONG).show();
//          }
//
//          @Override
//          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
//            Toast.makeText(getApplicationContext(),
//                "GetPostFavoriteListRequest onFailure  = " + errorResponseData.getStatus_msg(),
//                Toast.LENGTH_LONG).show();
//
//          }
//        });
        break;

      case R.id.btn_get_post:
        String aweme_id = "6708625650594352389";
        GetPostDetailRequest getPostRequest = new GetPostDetailRequest(aweme_id);
        getPostRequest.execute(new TTRequestCallBack<GetPostDetailRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, GetPostDetailRequestResponse baseData) {
            Toast.makeText(getApplicationContext(),
                "aweme_id= " + baseData.getAweme_detail().getAweme_id(), Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "GetPostDetailRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;
      case R.id.btn_play_post:
        String video_id2 = "v09044420000bkct4vavfskmj0f9kfcg";
        PlayPostRequest playPostRequest = new PlayPostRequest(video_id2);
        playPostRequest.execute(new TTRequestCallBack<PlayPostRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, PlayPostRequestResponse baseData) {
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "PlayPostRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_follow_an_user:
        // 有问题
        FollowRequest followRequest = new FollowRequest(userIdLocke);
        followRequest.execute(new TTRequestCallBack<FollowRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, FollowRequestResponse baseData) {
            Toast.makeText(getApplicationContext(), baseData.getStatus_msg(), Toast.LENGTH_LONG)
                .show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "followRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_unfollow_an_user:
        UnFollowRequest unFollowRequest = new UnFollowRequest(userIdLocke);
        unFollowRequest.execute(new TTRequestCallBack<UnFollowRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, UnFollowRequestResponse baseData) {
            Toast.makeText(getApplicationContext(), baseData.getStatus_msg(), Toast.LENGTH_LONG)
                .show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "UnFollowRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_like_post:

        String aweme_id2 = "6705984433708600582"; //locke

        LikePostRequest likePostRequest = new LikePostRequest(aweme_id2);
        likePostRequest.execute(new TTRequestCallBack<LikePostRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, LikePostRequestResponse baseData) {
            Toast.makeText(getApplicationContext(), "likePost onSuccess", Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "likePost onFailure  = " + errorResponseData.getStatus_msg(), Toast.LENGTH_LONG)
                .show();

          }
        });
        break;

      case R.id.btn_unlike_post:

        String aweme_id3 = "6705984433708600582"; //locke

        UnLikePostRequest unLikePostRequest = new UnLikePostRequest(aweme_id3);
        unLikePostRequest.execute(new TTRequestCallBack<UnLikePostRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, UnLikePostRequestResponse baseData) {
            Toast.makeText(getApplicationContext(), "unlikePost onSuccess", Toast.LENGTH_LONG)
                .show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "UnLikePostRequest onFailure  = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_post_commnent:

        String aweme_id4 = "6705984433708600582"; //locke
        String text = "hello world2"; //locke

        PostCommentRequest postCommentRequest = new PostCommentRequest(aweme_id4, text);
        postCommentRequest.execute(new TTRequestCallBack<PostCommentRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, PostCommentRequestResponse baseData) {
            Toast.makeText(getApplicationContext(),
                "PostCommentRequest onSuccess " + baseData.getComment().getText(),
                Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "PostCommentRequest onFailure = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();


          }
        });
        break;

      case R.id.btn_post_commnent_list:

        String aweme_id5 = "6705984433708600582"; //locke
        int cursor = 0;
        int count = 20;

        PostCommentListRequest postCommentListRequest = new PostCommentListRequest(aweme_id5,
            cursor, count);
        postCommentListRequest.execute(new TTRequestCallBack<PostCommentListRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, PostCommentListRequestResponse baseData) {
            Toast.makeText(getApplicationContext(),
                "PostCommentListRequest onSuccess  size = " + baseData.getComments().size()
                    + ", getTotal = " + baseData.getTotal(), Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "PostCommentListRequest onFailure = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();

          }
        });
        break;

      case R.id.btn_upload_image:

        String path = Environment.getExternalStorageDirectory() + "/bg_dollar.png";
        File mFile = new File(path);
        //若该文件存在
        if (mFile.exists()) {
          Log.d(TAG, "file exists");
        }else{
          Log.d(TAG, "file not exists,path = "+path);
          return;
        }

        Map<String, File> files = new HashMap<>();
        files.put("file", mFile);
        UploadImgRequest uploadImgRequest = new UploadImgRequest(files);
        uploadImgRequest.execute(new TTRequestCallBack<UploadImgRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, UploadImgRequestResponse baseData) {


            String url = baseData.getData().getUri();

            Toast.makeText(getApplicationContext(),
                "UploadImgRequest onSuccess url = "+url,
                Toast.LENGTH_LONG).show();



            UpdateUserInfoRequest updateUserInfoRequest = new UpdateUserInfoRequest("",url,"");
            updateUserInfoRequest.execute(new TTRequestCallBack<UpdateUserInfoRequestResponse>() {
              @Override
              public void onSuccess(int statusCode, UpdateUserInfoRequestResponse baseData) {



                Toast.makeText(getApplicationContext(),
                    "updateUserInfoRequest Img onSuccess  ",
                    Toast.LENGTH_LONG).show();
              }

              @Override
              public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
                Toast.makeText(getApplicationContext(),
                    "updateUserInfoRequest Img onFailure = " + errorResponseData.getStatus_msg(),
                    Toast.LENGTH_LONG).show();


              }
            });
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "UploadImgRequest onFailure = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();


          }
        });
        break;
      case R.id.btn_update_userinfo:


        UpdateUserInfoRequest updateUserInfoRequest = new UpdateUserInfoRequest("joy.test","","test experence");
        updateUserInfoRequest.execute(new TTRequestCallBack<UpdateUserInfoRequestResponse>() {
          @Override
          public void onSuccess(int statusCode, UpdateUserInfoRequestResponse baseData) {



            Toast.makeText(getApplicationContext(),
                "updateUserInfoRequest onSuccess  ",
                Toast.LENGTH_LONG).show();
          }

          @Override
          public void onFailure(int errorCode, BaseErrorResponseData errorResponseData) {
            Toast.makeText(getApplicationContext(),
                "updateUserInfoRequest onFailure = " + errorResponseData.getStatus_msg(),
                Toast.LENGTH_LONG).show();


          }
        });
        break;
      default:
        break;
    }


  }


  private void test() {

    Log.d(TAG, "email = " + Utils.encryptWithXOR(email));
    Log.d(TAG, "pwd = " + Utils.encryptWithXOR(pwd));

    String locale = getApplication().getResources().getConfiguration().locale.getCountry();
    Log.d(TAG, "locale = " + locale);
    Log.d(TAG, "getLanguage = " + Utils.getLanguage());
    Log.d(TAG, "getSystemVersion = " + Utils.getSystemVersion());
    Log.d(TAG, "getSystemModel = " + Utils.getSystemModel());
    Log.d(TAG, "getDeviceBrand = " + Utils.getDeviceBrand());
    Log.d(TAG, "getSDKInt = " + Utils.getSDKInt());
    Log.d(TAG, "getResolution = " + Utils.getResolution(this));
    Log.d(TAG, "SSID = " + UUID.randomUUID().toString());
    Log.d(TAG, "getDensity = " + Utils.getDensity(this));
    // Log.d(TAG, "USER_AGENT = " + APIConfig.USER_AGENT);
    Log.d(TAG, "generateDeviceID = " + APIConfig.generateDeviceID());

  }

}
