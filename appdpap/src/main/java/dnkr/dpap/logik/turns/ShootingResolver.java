package dnkr.dpap.logik.turns;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.model.tokens.planes.Plane;

public class ShootingResolver implements Resolver {
@Override
public void doResolve() {
//  ermittleKollisionen();
//  entferneKollidierte();
  bewegeWieGeplant();
}

private void bewegeWieGeplant() {
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
  }
}
}
