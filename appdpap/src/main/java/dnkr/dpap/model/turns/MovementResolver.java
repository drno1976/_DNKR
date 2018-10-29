package dnkr.dpap.model.turns;
import dnkr.dpap.data.Games;
import dnkr.dpap.model.Plane;
import dnkr.libhex.FacedHex;

class MovementResolver implements Resolver {
@Override
public void doResolve() {
//  ermittleKollisionen();
//  entferneKollidierte();
  bewegeWieGeplant();
}

private void bewegeWieGeplant() {
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    final FacedHex zielHex = plane.getBewegungsplan().getZielHex();
    plane.getHexOrt().getHex().setLike(zielHex);
    //    plane.getBewegungsplan().getSchweif().doCreateFrom(plane.getBewegungsplan().getHexweg());
    plane.getBewegungsplan().init();
  }
}
}
