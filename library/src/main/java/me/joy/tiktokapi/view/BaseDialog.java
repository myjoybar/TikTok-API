package me.joy.tiktokapi.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/**
 * Created by Joy on 2019-06-28
 */
public abstract class BaseDialog extends Dialog {

  private static final String TAG = "BaseDialog";
  public Context context;


  public BaseDialog(Context context) {
    super(context);
    initContext(context);
  }

  public BaseDialog(Context context, int theme) {
    super(context, theme);
    initContext(context);

  }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Window win = this.getWindow();
    win.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    win.getDecorView().setPadding(0, 0, 0, 0);
    WindowManager.LayoutParams lp = win.getAttributes();
    lp.width = LayoutParams.MATCH_PARENT;
    lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
//    win.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
    win.setGravity(Gravity.CENTER);
    win.setAttributes(lp);
    setContentView(getView());

  }

  @Override
  public void show() {
    if (context != null && !((Activity) context).isFinishing()) {
      super.show();
    }

  }

  private void initContext(Context context) {
    this.context = context;
//    if (!(context instanceof Activity)) {
//      // need dynamic permission request
//      this.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
//    }
  }

  protected abstract View getView();

  protected <T extends View> T retrieveView(View parent, int viewId) {
    View view = parent.findViewById(viewId);
    return (T) view;
  }

  @Override
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
  }

}
