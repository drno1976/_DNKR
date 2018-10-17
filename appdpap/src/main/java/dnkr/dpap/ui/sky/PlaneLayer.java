package dnkr.dpap.ui.sky;
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
}
