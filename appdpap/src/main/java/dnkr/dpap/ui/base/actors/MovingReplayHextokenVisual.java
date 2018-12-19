package dnkr.dpap.ui.base.actors;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;

public abstract class MovingReplayHextokenVisual extends HextokenVisual implements HasMovingReplay {
public MovingReplayHextokenVisual(ActorManager actorManager, Hextoken hextoken) {
  super(actorManager, hextoken);
}
//public MovingHextoken getMovingHextoken() {
//  return (MovingHextoken) getUserObject();
//}
}
