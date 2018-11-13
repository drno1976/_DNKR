package dnkr.dpap.model;
class PlaneRouten extends RoutenAsSchrittStrings {
public PlaneRouten(Plane plane) {
  for (PlaneManoever manoever : plane.getType().getPlaneManoevers().values()) {
    add(manoever.getSchrittString());
  }
}
}
