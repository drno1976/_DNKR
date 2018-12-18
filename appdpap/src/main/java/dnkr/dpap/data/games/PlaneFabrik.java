package dnkr.dpap.data.games;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.model.tokens.planes.PlaneType;

class PlaneFabrik extends DataFabrik {
private Plane plane;

public PlaneFabrik(GameData data) {
  super(data);
}

public PlaneFabrik create(String id) {
  plane = new Plane(id);
  getData().getPlaneListen().addNewPlane(plane);
  return this;
}

public PlaneFabrik as(String typeID) {
  plane.setType(getPlaneTypeById(typeID));
  return this;
}

private PlaneType getPlaneTypeById(String typeID) {
  return getData().getPlaneTypes().getById(typeID);
}

public void at(int x, int y, byte facing) {
  plane.getHexOrt().getHex().setTo(x,y,facing);
}

public Plane last() {
  return plane;
}
}
