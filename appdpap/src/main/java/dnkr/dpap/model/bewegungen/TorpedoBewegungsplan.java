package dnkr.dpap.model.bewegungen;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.libhex.routen.Bewegungsplan;

public class TorpedoBewegungsplan extends Bewegungsplan {
private final Torpedo torpedo;

public TorpedoBewegungsplan(Torpedo torpedo) {
  super();
  this.torpedo = torpedo;
}

@Override
public void init() {
  setZielHex(torpedo.getHexOrt().getHex().getNextHex(9));
}
}
