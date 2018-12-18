package dnkr.dpap.logik.turns;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.planes.Plane;
import dnkr.libhex.hex.FacedHex;

public class ShootingModusResolver implements Resolver {
@Override
public void doResolve() {
//  ermittleKollisionen();
//  entferneKollidierte();
  starteTorpedoes();
}

private void starteTorpedoes() {
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    final FacedHex zielHex = plane.getBewegungsplan().getZielHex();
    plane.getHexOrt().getHex().setLike(zielHex);
    //    plane.getBewegungsplan().getSchweif().doCreateFrom(plane.getBewegungsplan().getHexweg());
    plane.getBewegungsplan().init();
  }
}
}
