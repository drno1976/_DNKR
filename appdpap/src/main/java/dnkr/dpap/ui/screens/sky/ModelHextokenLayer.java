package dnkr.dpap.ui.screens.sky;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.ui.base.actors.GenericHextokenVisual;

class ModelHextokenLayer extends HextokenLayer {
public ModelHextokenLayer(ActorManager actorManager) {
  super(actorManager);
}

@Override
public void doModelChanged() {
  super.doModelChanged();
  for (Hextoken hextoken : Games.getGameData().getHextokenMap().values()) {
    if (hextoken instanceof Torpedo) {
      addActor(new GenericHextokenVisual(getActorManager(), hextoken));
    }
  }
}
}
