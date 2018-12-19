package dnkr.dpap.ui.screens.sky.layers;
import dnkr.appbase.base.MovingHextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.ui.base.actors.MovingHextokenVisual;

class ModelMovingHextokenLayer extends MovingHextokenLayer {
public ModelMovingHextokenLayer(ActorManager actorManager) {
  super(actorManager);
}

@Override
public void doModelChanged() {
  super.doModelChanged();
  for (MovingHextoken hextoken : Games.getGameData().getMovingHextokenMap().values()) {
    if (hextoken instanceof Torpedo) {
      addActor(new MovingHextokenVisual(getActorManager(), hextoken));
    }
  }
}
}
