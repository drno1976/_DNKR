package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class PlaneType extends IdObject {
private final RoutenAsSchrittStrings routenAsSchrittStrings;
private final PlaneManoevers planeManoevers;

public PlaneType(String id) {
  super(id);
  routenAsSchrittStrings = new RoutenAsSchrittStrings();
  planeManoevers = new PlaneManoevers();
}

public RoutenAsSchrittStrings getRouten() {
  return routenAsSchrittStrings;
}

public PlaneManoevers getPlaneManoevers() {
  return planeManoevers;
}

}
