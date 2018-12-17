package dnkr.appbase.gdx.base;
import android.util.Log;
import com.badlogic.gdx.math.Vector2;

public abstract class Modus implements StageInputListener {

protected Modus() {
}

abstract public void begin();


@Override
public void tappedAt(Vector2 stageCoordinates) {
  Log.v(getClass().getSimpleName(), "Tapped = " + stageCoordinates);
}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
  System.out.println("Longpressed = " + stageCoordinates);
}
}
