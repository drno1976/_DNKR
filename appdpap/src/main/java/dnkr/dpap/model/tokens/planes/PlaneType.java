package dnkr.dpap.model.tokens.planes;
import dnkr.dpap.model.bewegungen.PlaneManoevers;
import dnkr.libbase.IdObject;

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
