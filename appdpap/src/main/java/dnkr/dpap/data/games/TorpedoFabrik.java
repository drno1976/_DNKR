package dnkr.dpap.data.games;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.model.tokens.planes.Plane;

public class TorpedoFabrik extends DataFabrik {
public TorpedoFabrik(GameData data) {
  super(data);
}

public void createFrom(Plane plane) {
  final Torpedo torpedo = new Torpedo(calculateId(plane));
  torpedo.getHexOrt().getHex().setLike(plane.getHexOrt().getHex());
  getData().getMovingHextokenMap().put(torpedo);
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
