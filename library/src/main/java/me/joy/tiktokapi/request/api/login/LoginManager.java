package me.joy.tiktokapi.request.api.login;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import me.joy.tiktokapi.R;
import me.joy.tiktokapi.request.TTRequestCallBack;
import me.joy.tiktokapi.request.api.login.loginemail.LoginResponseData;
import me.joy.tiktokapi.request.api.login.loginemail.LoginWithEmailRequest;
import me.joy.tiktokapi.request.api.login.loginusername.LoginWithUserNameRequest;
import me.joy.tiktokapi.response.BaseErrorResponseData;
import me.joy.tiktokapi.response.exception.TTExceptionHandler;
import me.joy.tiktokapi.view.BaseDialog;

/**
 * Created by Joy on 2019-06-27
 */
public class LoginManager {

  private static final String TAG = "MainActivity";

  private static class LoginManagerHolder {

    private static LoginManager INSTANCE = new LoginManager();
  }

  public static LoginManager getInstance() {
    return LoginManagerHolder.INSTANCE;
  }

  public void loginWithEmail(final Context context, final String email, final String pwd,
      final String captcha) {
    LoginWithEmailRequest loginRequest = new LoginWithEmailRequest(email, pwd, captcha);
    loginRequest.execute(new TTRequestCallBack<LoginResponseData>() {
      @Override
      public void onSuccess(int statusCode, LoginResponseData loginResponseData) {
        Log.d(TAG, "onSuccess =  " + loginResponseData.toString());
        Toast.makeText(context, "login Success = " + loginResponseData.getData().getName(),
            Toast.LENGTH_LONG).show();
      }

      @Override
      public void onFailure(int errorCode, BaseErrorResponseData baseErrorResponseData) {
        handleLoginResponseError(context, true, email, pwd, baseErrorResponseData);

      }

    });
  }

  public void loginWithUserName(final Context context, final String userName, final String pwd,
      final String captcha) {
    LoginWithUserNameRequest loginRequest = new LoginWithUserNameRequest(userName, pwd, captcha);
    loginRequest.execute(new TTRequestCallBack<LoginResponseData>() {
      @Override
      public void onSuccess(int statusCode, LoginResponseData loginResponseData) {
        Log.d(TAG, "onSuccess =  " + loginResponseData.toString());
        Toast.makeText(context, "login Success = " + loginResponseData.getData().getName(),
            Toast.LENGTH_LONG).show();
      }

      @Override
      public void onFailure(int errorCode, BaseErrorResponseData baseErrorResponseData) {
        Log.d(TAG, "onFailure  loginWithUserName" );
        handleLoginResponseError(context, false, userName, pwd, baseErrorResponseData);
      }

    });
  }


  private void handleLoginResponseError(final Context context, final boolean isLoginWithEmail,
      final String userName,
      final String pwd, BaseErrorResponseData baseErrorResponseData) {

    Log.d(TAG, "onFailure =  " + baseErrorResponseData.toString());
    Toast.makeText(context, "login Failure "+baseErrorResponseData.getMessage(), Toast.LENGTH_LONG).show();
    if (baseErrorResponseData.getData().getError_code() == TTExceptionHandler.VERIFICATION_ERROR_CODE
        || baseErrorResponseData.getData().getError_code() == TTExceptionHandler.VERIFICATION_EMPTY_CODE) {

      String captcha = baseErrorResponseData.getData().getCaptcha();
      Log.d(TAG, "captcha =  " + captcha);
      //LoginManager.getInstance().login(email,pwd,code);

      byte[] decodedString = Base64.decode(captcha, Base64.DEFAULT);
      final Bitmap decodedByte = BitmapFactory
          .decodeByteArray(decodedString, 0, decodedString.length);

      BaseDialog baseDialog = new BaseDialog(context) {
        @Override
        protected View getView() {
          final View view = LayoutInflater.from(context)
              .inflate(R.layout.captcha_code, null);
          retrieveView(view, R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              EditText editText = retrieveView(view, R.id.et_code);
              String code = editText.getText().toString();
              if (isLoginWithEmail) {
                LoginManager.getInstance().loginWithEmail(context, userName, pwd, code);

              } else {
                LoginManager.getInstance().loginWithUserName(context, userName, pwd, code);

              }
              dismiss();
            }
          });

          ImageView imageView = retrieveView(view, R.id.img);
          imageView.setImageBitmap(decodedByte);
          return view;

        }
      };

      baseDialog.show();

    }

  }


}
