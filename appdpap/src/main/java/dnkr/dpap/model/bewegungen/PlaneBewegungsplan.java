package dnkr.dpap.model.bewegungen;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.hexes.GeparsteHexRoute;
import dnkr.libhex.routen.Bewegungsplan;

public class PlaneBewegungsplan extends Bewegungsplan {
private final Plane plane;
private GeparsteHexRoute geparsteHexRoute;

public PlaneBewegungsplan(Plane plane) {
  super();
  this.plane = plane;
}

@Override
public void init() {
  final PlaneManoever manoever = plane.getType().getPlaneManoevers().getVorwaerts();
  setRoute(manoever.getGeparsteRouteVon(plane.getHexOrt().getHex()));
}
}
