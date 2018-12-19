package dnkr.dpap.data.games;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.hex.FacedHex;

public class TorpedoFabrik extends DataFabrik {
public TorpedoFabrik(GameData data) {
  super(data);
}

public void createFrom(Plane plane) {
  final Torpedo torpedo = new Torpedo(calculateId(plane));
  final FacedHex start = plane.getHexOrt().getHex();
  torpedo.getHexOrt().getHex().setLike(start);
  torpedo.getBewegungsplan().setZielHex(start.getNextHex(9));
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
