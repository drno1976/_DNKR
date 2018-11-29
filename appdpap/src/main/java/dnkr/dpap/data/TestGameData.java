package dnkr.dpap.data;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.model.planes.PlaneTypes;
import dnkr.libhex.hex.FacedHex;

class TestGameData extends FabrikGameData {
public TestGameData() {
  super();
  createPlanes();
//  createPlanesViele();
  for (Plane plane : this.getPlaneListen().getPlanesOnMap().asList()) {
    plane.getBewegungsplan().init();
  }
}

private void createPlanes() {
  planes.create("Kraut.1").as(PlaneTypes.VALKYR).at(5, 5, FacedHex.N);
  planes.create("Kraut.2").as(PlaneTypes.KYRASSIER).at(7, 5, FacedHex.N);
  planes.create("Raptor.1").as(PlaneTypes.HORNET).at(5, 25, FacedHex.S);
  planes.create("Raptor.2").as(PlaneTypes.WASP).at(7, 25, FacedHex.S);
  
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
