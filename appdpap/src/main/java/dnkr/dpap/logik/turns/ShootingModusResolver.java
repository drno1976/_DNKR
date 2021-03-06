package dnkr.dpap.logik.turns;
import dnkr.dpap.data.games.TorpedoFabrik;
import dnkr.dpap.model.tokens.planes.Plane;

public class ShootingModusResolver extends AbstractResolver {
@Override
public void doResolve() {
  starteTorpedoes();
}

private void starteTorpedoes() {
  for (Plane plane : getData().getPlaneListen().getPlanesOnMap().asList()) {
    if (plane.getId().equals("Kraut.2")) {
      final TorpedoFabrik tf = new TorpedoFabrik(getData());
      tf.createFrom(plane);
    }
//    final FacedHex zielHex = plane.getBewegungsplan().getZielHex();
//    plane.getHexOrt().getHex().setLike(zielHex);
    //    plane.getBewegungsplan().getSchweif().doCreateFrom(plane.getBewegungsplan().getHexweg());
  }
}
}
