package dnkr.dpap.model.tokens.planes;
import dnkr.appbase.base.MovingHextoken;
import dnkr.dpap.model.bewegungen.Bewegungsplaner;
import dnkr.dpap.model.bewegungen.PlaneBewegungsplan;
import dnkr.dpap.model.bewegungen.PlaneRouten;
import dnkr.libhex.routen.Bewegungsplan;

public class Plane extends MovingHextoken {
private final PlaneBewegungsplan planeBewegungsplan;
private PlaneType type;

public Plane(String id) {
  super(id);
  planeBewegungsplan = new PlaneBewegungsplan(this);
}

@Override
public Bewegungsplan getBewegungsplan() {
  return planeBewegungsplan;
}

public PlaneType getType() {
  return type;
}

public void setType(PlaneType type) {
  this.type = type;
}

public Bewegungsplaner getBewegungsplaner() {
  return new Bewegungsplaner(hexOrt.getHex(), new PlaneRouten(this));
}
}
