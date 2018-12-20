package dnkr.dpap.ui.screens.sky.layers.base;
import dnkr.appbase.gdx.actors.ActorManager;

public class MovingHextokenLayer extends MovingReplayLayer {
public MovingHextokenLayer(ActorManager actorManager) {
  super(actorManager);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
}
}
