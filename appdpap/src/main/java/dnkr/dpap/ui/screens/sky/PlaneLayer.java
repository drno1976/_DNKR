package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.actors.ActorLayer;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.dpap.data.Games;
import dnkr.dpap.model.Plane;
import dnkr.dpap.ui.base.PlaneActor;

class PlaneLayer extends ActorLayer {
public PlaneLayer(ActorManager actorManager) {
  super(actorManager);
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    addActor(create(plane));
  }
}

private PlaneActor create(Plane plane) {
  return new PlaneActor(getActorManager(), plane);
}

public void prepareMoving() {
  for (Actor child : this.getChildren()) {
    ((PlaneActor) child).prepareMoving();
  }
}

public void resetMoving() {
  for (Actor child : this.getChildren()) {
    ((PlaneActor) child).resetMoving();
  }
}
}
