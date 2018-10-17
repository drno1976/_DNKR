package dnkr.appbase.gdx.base;
import android.support.annotation.NonNull;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

abstract class ScreenInput implements GestureDetector.GestureListener {
protected final OrthographicCamera camera;
private final ZoomGrenzen zoomGrenzen;
PanningChecker panningChecker;
private float initialScale;

ScreenInput(@NonNull OrthographicCamera camera) {
  this.camera = camera;
  initialScale = camera.zoom;
  zoomGrenzen = new ZoomGrenzen(0.15f, 3);
  panningChecker = new PanningChecker(camera);
}

public ZoomGrenzen getZoomGrenzen() {
  return zoomGrenzen;
}

@Override
public boolean touchDown(float x, float y, int pointer, int button) {
  initialScale = camera.zoom;
  return false;
}

@Override
public boolean fling(float velocityX, float velocityY, int button) {
  return false;
}

@Override
public boolean pan(float x, float y, float deltaX, float deltaY) {
  camera.translate(-deltaX * camera.zoom, deltaY * camera.zoom, 0);
  panningChecker.panned();
  return true;
}

@Override
public boolean panStop(float x, float y, int pointer, int button) {
  return false;
}

@Override
public boolean zoom(float initialDistance, float distance) {
  //float ratio = initialDistance / distance;
  zoomTo(initialDistance / distance * initialScale);
  return true;
}

@Override
public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
  return false;
}

@Override
public void pinchStop() {
}

public void zoomTo(float zoomto) {
  camera.zoom = MathUtils.clamp(zoomto, zoomGrenzen.getMin(), zoomGrenzen.getMax());
//  Log.v(getClass().getSimpleName(), "Zoomed = " + camera.zoom);
}

public void setPanningChecker(PanningChecker panningChecker) {
  this.panningChecker = panningChecker;
}
}
