package dnkr.appbase.gdx.base;
import android.util.Log;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;

public class StageScreenInput extends ScreenInput {
private final ModusStage modusStage;

public StageScreenInput(ModusStage modusStage) {
  super((OrthographicCamera) modusStage.getCamera());
  this.modusStage = modusStage;
}

@Override
public boolean tap(float x, float y, int count, int button) {
  Log.v(getClass().getSimpleName(), "Tapped on screen: " + x + ":" + y);
  final Vector2 stageCoordinates = modusStage.screenToStageCoordinates(new Vector2(x, y));
  Log.v(getClass().getSimpleName(), "Tapped on modusStage : " + stageCoordinates);
  modusStage.getInputListener().tappedAt(stageCoordinates);
  return true;
}

@Override
public boolean longPress(float x, float y) {
  Log.v(getClass().getSimpleName(), "Longpressed on screen: " + x + ":" + y);
  final Vector2 stageCoordinates = modusStage.screenToStageCoordinates(new Vector2(x, y));
  Log.v(getClass().getSimpleName(), "Longpressed on modusStage : " + stageCoordinates);
  modusStage.getInputListener().longPressedAt(stageCoordinates);
  return true;
}

public void setCameraPosition(int x, int y) {
  camera.position.x = x;
  camera.position.y = y;
  panningChecker.panned();
}
}
