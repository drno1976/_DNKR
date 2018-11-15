package dnkr.dpap.model;
import dnkr.appbase.base.IdObject;

public class PlaneType extends IdObject {
private final PlaneManoevers planeManoevers;

public PlaneType(String id) {
  super(id);
  planeManoevers = new PlaneManoevers();
}

public PlaneManoevers getPlaneManoevers() {
  return planeManoevers;
}
}
