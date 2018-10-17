package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class Plane extends IdObject implements HasHexOrt {
private final HexOrt hexOrt;
private PlaneType type;

public Plane(String id) {
  super(id);
  hexOrt = new HexOrt();
}

@Override
public HexOrt getHexOrt() {
  return hexOrt;
}

public void setType(PlaneType type) {
  this.type = type;
}

public PlaneType getType() {
  return type;
}
}
