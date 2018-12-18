package dnkr.dpap.data.games;
import dnkr.appbase.base.HextokenMap;
import dnkr.dpap.data.uistates.UiState;
import dnkr.dpap.model.tokens.planes.PlaneTypes;

public class GameData {
private final UiState uiState;
private final PlaneListen planeListen;
private final HextokenMap hextokenMap;

public MetaDaten getMetaDaten() {
  return metaDaten;
}

private final MetaDaten metaDaten;
private final PlaneTypes planeTypes;

public GameData() {
  planeTypes = new PlaneTypes();
  uiState = new UiState();
  planeListen = new PlaneListen(this);
  metaDaten = new MetaDaten();
  hextokenMap = new HextokenMap();
}

public UiState getUiState() {
  return uiState;
}

public PlaneListen getPlaneListen() {
  return planeListen;
}

public String getNextId() {
  return metaDaten.getNextId();
}

public PlaneTypes getPlaneTypes() {
  return planeTypes;
}

public HextokenMap getHextokenMap() {
  return hextokenMap;
}
}
