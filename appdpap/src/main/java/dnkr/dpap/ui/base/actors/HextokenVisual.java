package dnkr.dpap.ui.base.actors;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.HexGroupVisual;

public abstract class HextokenVisual extends HexGroupVisual implements MovingReplay {
public HextokenVisual(ActorManager actorManager, Hextoken hextoken) {
  super(actorManager, hextoken);
}
}
