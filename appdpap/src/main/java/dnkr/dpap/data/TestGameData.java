package dnkr.dpap.data;
import dnkr.dpap.model.Plane;
import dnkr.dpap.model.PlaneTypes;
import dnkr.libhex.FacedHex;

class TestGameData extends FabrikGameData {
public TestGameData() {
  super();
  createPlanes();
//  createPlanesViele();
}

private void createPlanes() {
  planes.create("Kraut.1").as(PlaneTypes.VALKYR).at(5, 5, FacedHex.N);
  planes.create("Kraut.2").as(PlaneTypes.HORNET).at(6, 6, FacedHex.NE);
}

private void createPlanesViele() {
  for (int x = 1; x < 10; x++) {
    final Plane plane = new Plane(getNextId());
    plane.getHexOrt().getHex().setTo(x, 0);
    getPlaneListen().addNewPlane(plane);
  }
  for (int y = 1; y < 10; y++) {
    final Plane plane = new Plane(getNextId());
    plane.getHexOrt().getHex().setTo(0, y);
    getPlaneListen().addNewPlane(plane);
  }
}
}
