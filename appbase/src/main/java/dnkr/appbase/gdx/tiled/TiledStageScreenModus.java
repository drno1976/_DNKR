package dnkr.appbase.gdx.tiled;
import android.support.annotation.NonNull;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.base.Modus;

public abstract class TiledStageScreenModus extends Modus {
@NonNull
private final TiledStageScreen screen;

public TiledStageScreenModus(@NonNull TiledStageScreen screen) {
  this.screen = screen;
}

public Actor findActor(String name) {
  return screen.getStage().getRoot().findActor(name);
}

public TiledMapHelper getMapHelper() {
  return screen.getMapHelper();
}
}
