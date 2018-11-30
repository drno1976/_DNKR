package dnkr.dpap.model.planes;
import dnkr.dpap.model.bewegungen.Bewegungsplan;
import dnkr.dpap.model.bewegungen.Bewegungsplaner;
import dnkr.dpap.model.bewegungen.PlaneBewegungsplan;
import dnkr.dpap.model.bewegungen.PlaneRouten;
import dnkr.libbase.IdObject;
import dnkr.libhex.HasHexOrt;
import dnkr.libhex.HexOrt;

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
  return new Bewegungsplaner(hexOrt.getHex(), new PlaneRouten(this));
}
}
