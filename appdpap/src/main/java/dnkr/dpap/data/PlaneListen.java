package dnkr.dpap.data;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.model.planes.PlaneMap;

public class PlaneListen {
private final PlaneMap planesOnMap, planesAll;
private final GameData gameData;

public PlaneListen(GameData gameData) {
  this.gameData = gameData;
  planesOnMap = new PlaneMap();
  planesAll = new PlaneMap();
}

public void addNewPlane(Plane plane) {
  planesAll.add(plane);
  planesOnMap.add(plane);
}

public PlaneMap getPlanesOnMap() {
  return planesOnMap;
}

public PlaneMap getPlanesAll() {
  return planesAll;
}
}
