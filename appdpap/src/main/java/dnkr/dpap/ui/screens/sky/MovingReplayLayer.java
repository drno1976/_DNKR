package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.ui.base.actors.HextokenVisual;
import dnkr.dpap.ui.base.actors.MovingReplay;

abstract class MovingReplayLayer extends Layer implements MovingReplay {
public MovingReplayLayer(ActorManager actorManager) {
  super(actorManager);
}

public void prepareMoving() {
  for (Actor child : this.getChildren()) {
    ((HextokenVisual) child).prepareMoving();
  }
}

public void resetMoving() {
  for (Actor child : this.getChildren()) {
    ((HextokenVisual) child).resetMoving();
  }
}
}
