package dnkr.dpap.model;
import dnkr.libhex.FacedHex;

public class PlaneBewegungsplan extends Bewegungsplan {
private final Plane plane;

public PlaneBewegungsplan(Plane plane) {
  super();
  this.plane = plane;
}

@Override
public void init() {
  final FacedHex hex = plane.getHexOrt().getHex().cloned();
  setZielHex(hex.getNextHex().getNextHex().getNextHex().getNextHex().getNextHex().getNextHex());
}
}
