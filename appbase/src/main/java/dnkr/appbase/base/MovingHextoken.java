package dnkr.appbase.base;
import dnkr.libhex.HasHexMoving;
import dnkr.libhex.routen.Bewegungsplan;

public abstract class MovingHextoken extends Hextoken implements HasHexMoving {
public MovingHextoken(String id) {
  super(id);
}

public abstract Bewegungsplan getBewegungsplan();
}
