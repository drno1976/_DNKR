package dnkr.dpap.ui.screens.sky;
import dnkr.appbase.gdx.actors.ActorManager;

class MovingHextokenLayer extends MovingReplayLayer {
public MovingHextokenLayer(ActorManager actorManager) {
  super(actorManager);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
}
}
