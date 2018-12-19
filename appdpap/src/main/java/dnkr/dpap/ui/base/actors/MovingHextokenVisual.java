package dnkr.dpap.ui.base.actors;
import dnkr.appbase.base.MovingHextoken;
import dnkr.appbase.gdx.actors.ActorManager;

public abstract class MovingHextokenVisual extends HextokenVisual implements HasMovingReplay {
public MovingHextokenVisual(ActorManager actorManager, MovingHextoken movingHextoken) {
  super(actorManager, movingHextoken);
}

public MovingHextoken getMovingHextoken() {
  return (MovingHextoken) getUserObject();
}
}
