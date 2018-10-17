package dnkr.appbase.gdx.actors;
import android.support.annotation.NonNull;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import dnkr.appbase.gdx.assets.TextureManager;
import dnkr.appbase.gdx.base.ModusStageScreen;

public abstract class ActorManager {
private final ModusStageScreen screen;

public ActorManager(@NonNull ModusStageScreen screen) {
  this.screen = screen;
}

public abstract void fillStage();

public TextureManager getTextureManager() {
  return screen.getGdxUi().getTextureManager();
}

public void removeAllActorsfromStage() {
  for (Actor actor : screen.getStage().getActors()) {
    actor.clearActions();
    actor.addAction(Actions.removeActor());
  }
}

public void addToStage(Actor actor) {
  screen.getStage().addActor(actor);
}
}
