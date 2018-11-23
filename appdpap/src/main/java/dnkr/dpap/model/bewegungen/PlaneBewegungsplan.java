package dnkr.dpap.model.bewegungen;
import dnkr.dpap.model.planes.Plane;

public class PlaneBewegungsplan extends Bewegungsplan {
private final Plane plane;

public PlaneBewegungsplan(Plane plane) {
  super();
  this.plane = plane;
}

@Override
public void init() {
  final PlaneManoever manoever = plane.getType().getPlaneManoevers().getVorwaerts();
//  final FacedHex ziel = new GeparsteHexRoute(plane.getHexOrt().getHex(), manoever.getSchrittString()).getZiel();
//  setZielHex(ziel);
  setZielHex(manoever.getZielGestartetVon(plane.getHexOrt().getHex()));
//  final FacedHex hex = plane.getHexOrt().getHex().cloned();
//  setZielHex(hex.getNextHex().getNextHex().getNextHex().getNextHex().getNextHex().getNextHex());
}
}
