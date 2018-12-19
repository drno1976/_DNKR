package dnkr.dpap.ui.screens.sky.layers;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.ui.base.actors.PlaneVisual;

public class PlaneLayer extends MovingReplayLayer {
public PlaneLayer(ActorManager actorManager) {
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
}
