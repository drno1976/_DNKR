package dnkr.dpap.logik.turns;
import dnkr.appbase.base.MovingHextoken;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.hex.FacedHex;

class MovementResolver extends AbstractResolver {
@Override
public void doResolve() {
//  ermittleKollisionen();
//  entferneKollidierte();
  bewegeWieGeplantPlanes();
  bewegeWieGeplantTorpedoes();
}

private void bewegeWieGeplantPlanes() {
  for (Plane plane : getData().getPlaneListen().getPlanesOnMap().asList()) {
    bewegeWieGeplantMovingHextoken(plane);
  }
}

private void bewegeWieGeplantTorpedoes() {
  for (MovingHextoken hextoken : Games.getGameData().getMovingHextokenMap().values()) {
    if (hextoken instanceof Torpedo) {
      bewegeWieGeplantMovingHextoken(hextoken);
    }
  }
}

private void bewegeWieGeplantMovingHextoken(MovingHextoken plane) {
  final FacedHex zielHex = plane.getBewegungsplan().getZielHex();
  plane.getHexOrt().getHex().setLike(zielHex);
  //    plane.getBewegungsplan().getSchweif().doCreateFrom(plane.getBewegungsplan().getHexweg());
  plane.getBewegungsplan().init();
}
}
