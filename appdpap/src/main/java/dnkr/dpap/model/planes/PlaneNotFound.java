package dnkr.dpap.model.planes;
import android.util.Log;

public class PlaneNotFound extends Throwable {
public PlaneNotFound(String message) {
  super(message);
}


public void logge() {
  Log.v(getClass().getName(), this.getMessage());
}
}
