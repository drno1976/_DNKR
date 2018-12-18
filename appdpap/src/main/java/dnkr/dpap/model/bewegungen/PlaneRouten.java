package dnkr.dpap.model.bewegungen;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.routen.RoutenAsSchrittStrings;

public class PlaneRouten extends RoutenAsSchrittStrings {
public PlaneRouten(Plane plane) {
  for (PlaneManoever manoever : plane.getType().getPlaneManoevers().values()) {
    add(manoever.getSchrittString());
  }
}
}
