package dnkr.appbase.activitys;
import android.os.Handler;
import android.os.Looper;
public class UiHandler {
public static void run(Runnable runnable) {
  new Handler(Looper.getMainLooper()).post(runnable);
}
}
