package dnkr.dpap.logik.turns;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.hex.FacedHex;

class MovementResolver extends AbstractResolver {
@Override
public void doResolve() {
//  ermittleKollisionen();
//  entferneKollidierte();
  bewegeWieGeplant();
}

private void bewegeWieGeplant() {
  for (Plane plane : getData().getPlaneListen().getPlanesOnMap().asList()) {
    final FacedHex zielHex = plane.getBewegungsplan().getZielHex();
    plane.getHexOrt().getHex().setLike(zielHex);
    //    plane.getBewegungsplan().getSchweif().doCreateFrom(plane.getBewegungsplan().getHexweg());
    plane.getBewegungsplan().init();
  }
}
}
