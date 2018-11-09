package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class PlaneType extends IdObject {
private final RoutenAsSchrittStrings routenAsSchrittStrings;

public PlaneType(String id) {
  super(id);
  routenAsSchrittStrings = new RoutenAsSchrittStrings();
}

public RoutenAsSchrittStrings getRouten() {
  return routenAsSchrittStrings;
}
}
