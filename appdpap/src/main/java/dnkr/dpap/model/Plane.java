package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class Plane extends IdObject implements HasHexOrt {
private final HexOrt hexOrt;
private PlaneType type;
private final Bewegungsplan bewegungsplan;

public Plane(String id) {
  super(id);
  hexOrt = new HexOrt();
  bewegungsplan = new PlaneBewegungsplan(this);
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

public Bewegungsplan getBewegungsplan() {
  return bewegungsplan;
}

public Bewegungsplaner getBewegungsplaner() {
  return new Bewegungsplaner(hexOrt.getHex(), type.getRouten());
}
}
