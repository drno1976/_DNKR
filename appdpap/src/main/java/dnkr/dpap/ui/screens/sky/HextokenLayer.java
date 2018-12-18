package dnkr.dpap.ui.screens.sky;
import dnkr.appbase.gdx.actors.ActorManager;

class HextokenLayer extends MovingReplayLayer {
public HextokenLayer(ActorManager actorManager) {
  super(actorManager);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
//  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
//    addActor(create(plane));
//  }
}
//private PlaneVisual create(Plane plane) {
//  return new PlaneVisual(getActorManager(), plane);
//}


}
