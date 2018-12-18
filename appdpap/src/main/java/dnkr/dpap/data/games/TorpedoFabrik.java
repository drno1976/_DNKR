package dnkr.dpap.data.games;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.model.planes.Torpedo;

public class TorpedoFabrik extends DataFabrik {
public TorpedoFabrik(GameData data) {
  super(data);
}

public void createFrom(Plane plane) {
  final Torpedo torpedo = new Torpedo(calculateId(plane));
  torpedo.getHexOrt().getHex().setLike(plane.getHexOrt().getHex());
}

private String calculateId(Plane plane) {
  StringBuilder s = new StringBuilder();
  s.append("T-");
  s.append(plane.getId());
  s.append("-");
  s.append(plane.getHexOrt().getHex().getSimplePosition());
  s.append("-");
  s.append(getData().getMetaDaten().getTurnCounter());
  return s.toString();
}
}
