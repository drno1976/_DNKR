package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class PlaneType extends IdObject {
public PlaneType(String id) {
  super(id);
}

public RoutenAsSchrittStrings getRouten() {
  return new RoutenAsSchrittStrings();
}
}
