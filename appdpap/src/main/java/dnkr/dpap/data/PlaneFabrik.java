package dnkr.dpap.data;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.model.planes.PlaneType;

class PlaneFabrik {
private final GameData data;
private Plane plane;

public PlaneFabrik(GameData data) {
  this.data = data;
}

public PlaneFabrik create(String id) {
  plane = new Plane(id);
  data.getPlaneListen().addNewPlane(plane);
  return this;
}

public PlaneFabrik as(String typeID) {
  plane.setType(getPlaneTypeById(typeID));
  return this;
}

private PlaneType getPlaneTypeById(String typeID) {
  return data.getPlaneTypes().getById(typeID);
}

public void at(int x, int y, byte facing) {
  plane.getHexOrt().getHex().setTo(x,y,facing);
}

public Plane last() {
  return plane;
}
}
