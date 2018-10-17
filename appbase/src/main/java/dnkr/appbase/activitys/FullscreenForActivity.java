package dnkr.appbase.activitys;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class FullscreenForActivity {
public static void doFor(Window window) {
  //  requestWindowFeature(Window.FEATURE_NO_TITLE);
  window.setFlags(
          WindowManager.LayoutParams.FLAG_FULLSCREEN,
          WindowManager.LayoutParams.FLAG_FULLSCREEN);
  window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
  final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
          | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
          | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
          | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
          | View.SYSTEM_UI_FLAG_FULLSCREEN
          | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
  // This work only for android 4.4+
  window.getDecorView().setSystemUiVisibility(flags);
//  getWindow().setFlags(WindowManager.LayoutParams.);
//  setSystemUiVisibility(
//          View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                  | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                  | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                  | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                  | View.SYSTEM_UI_FLAG_FULLSCREEN
//                  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

}
}
