package me.joy.tiktokapi.response.exception;

import me.joy.tiktokapi.response.BaseErrorResponseData;

/**
 * Created by Joy on 2019-06-27
 */
public class TTExceptionHandler {

  private static final String TAG = "ExceptionHandler";

  private static class ExceptionHandlerHolder {

    private static TTExceptionHandler INSTANCE = new TTExceptionHandler();
  }

  public static TTExceptionHandler getInstance() {
    return ExceptionHandlerHolder.INSTANCE;
  }

  public static final int VERIFICATION_ERROR_CODE = 1102;
  public static final int VERIFICATION_EMPTY_CODE = 1101;

  public void handle(BaseErrorResponseData baseErrorResponseData) {
//    if (baseErrorResponseData.getError_code() == VERIFICATION_ERROR_CODE||baseErrorResponseData.getError_code() == VERIFICATION_EMPTY_CODE) {
//
//      String captcha = baseErrorResponseData.getCaptcha();
//      Log.d(TAG, "captcha =  " + captcha);
//      //LoginManager.getInstance().login(email,pwd,code);
//
//      byte[] decodedString = Base64.decode(captcha, Base64.DEFAULT);
//      final Bitmap decodedByte = BitmapFactory
//          .decodeByteArray(decodedString, 0, decodedString.length);
//
//      BaseDialog baseDialog = new BaseDialog(TTCommonFieldsManager.getInstance().getContext()) {
//        @Override
//        protected View getView() {
////          View view = LayoutInflater.from(TTCommonFieldsManager.getInstance().getContext())
////              .inflate(R.layout.captcha_code, null);
////
////          retrieveView(R.id.btn).setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////
////              EditText editText = retrieveView(R.id.et_code);
////              String code = editText.getText().toString();
////              LoginManager.getInstance().login(email,pwd,code);
////            }
////          });
//
////          ImageView imageView = retrieveView(R.id.img);
////          imageView.setImageBitmap(decodedByte);
//          Button button = new Button(TTCommonFieldsManager.getInstance().getContext());
//          button.setText("AAAAA");
//          return button;
//
//        }
//      };
//      baseDialog.show();
//
//
//    }
//




  }


  private void showCaptchaDialog(){}



}
