package dnkr.appbase.gdx.base;
import com.badlogic.gdx.math.Vector2;

public interface StageInputListener {
void tappedAt(Vector2 stageCoordinates);

void longPressedAt(Vector2 stageCoordinates);

}
