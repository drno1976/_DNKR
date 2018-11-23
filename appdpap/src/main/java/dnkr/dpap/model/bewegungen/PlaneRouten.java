package dnkr.dpap.model.bewegungen;
import dnkr.dpap.model.planes.Plane;

public class PlaneRouten extends RoutenAsSchrittStrings {
public PlaneRouten(Plane plane) {
  for (PlaneManoever manoever : plane.getType().getPlaneManoevers().values()) {
    add(manoever.getSchrittString());
  }
}
}
