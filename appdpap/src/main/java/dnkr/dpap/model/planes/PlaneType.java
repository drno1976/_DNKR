package dnkr.dpap.model.planes;
import dnkr.appbase.base.IdObject;
import dnkr.dpap.model.bewegungen.PlaneManoevers;

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
