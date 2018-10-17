package dnkr.appbase.gdx.base;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class StageScreenModus extends Modus {
private final ModusStageScreen screen;

public StageScreenModus(ModusStageScreen stageScreen) {
  screen = stageScreen;
}

public Actor findActor(String name) {
  return screen.getStage().getRoot().findActor(name);
}

public void setModusTo(Modus modus) {
  screen.setModusTo(modus);
}
}
