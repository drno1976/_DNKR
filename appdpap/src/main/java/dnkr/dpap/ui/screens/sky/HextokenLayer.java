package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.ui.base.actors.PlaneVisual;

class HextokenLayer extends Layer {
public HextokenLayer(ActorManager actorManager) {
  super(actorManager);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    addActor(create(plane));
  }
}

private PlaneVisual create(Plane plane) {
  return new PlaneVisual(getActorManager(), plane);
}

public void prepareMoving() {
  for (Actor child : this.getChildren()) {
    ((PlaneVisual) child).prepareMoving();
  }
}

public void resetMoving() {
  for (Actor child : this.getChildren()) {
    ((PlaneVisual) child).resetMoving();
  }
}
}
