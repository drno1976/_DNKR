package dnkr.dpap.model.tokens.planes;
import dnkr.appbase.base.Hextoken;
import dnkr.dpap.model.bewegungen.Bewegungsplaner;
import dnkr.dpap.model.bewegungen.PlaneBewegungsplan;
import dnkr.dpap.model.bewegungen.PlaneRouten;
import dnkr.libhex.routen.Bewegungsplan;

public class Plane extends Hextoken {
private PlaneType type;
private final Bewegungsplan bewegungsplan;

public Plane(String id) {
  super(id);
  bewegungsplan = new PlaneBewegungsplan(this);
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
