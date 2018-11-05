package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.data.Games;
import dnkr.dpap.model.Plane;
import dnkr.dpap.ui.base.actors.PlaneVisual;

class PlaneLayer extends Layer {
public PlaneLayer(ActorManager actorManager) {
  super(actorManager);
  doModelChanged();
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

@Override
public void doModelChanged() {
  removeChildrenFromStage();
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    addActor(create(plane));
  }
}
}
