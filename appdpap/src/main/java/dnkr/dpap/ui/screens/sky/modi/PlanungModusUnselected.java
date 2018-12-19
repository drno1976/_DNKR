package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import java.util.Collection;
import dnkr.dpap.logik.DonePlanungClickedFab;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.model.tokens.planes.PlaneNotFound;
import dnkr.dpap.ui.screens.sky.ClickedFabMenu;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.hex.Hex;

public class PlanungModusUnselected extends PlanungModus {
public PlanungModusUnselected(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void begin() {
  getMenuButtonUi().removeAll();
  getMenuButtonUi().addButton(getFabFabrik().getMenuFab(new ClickedFabMenu(getSkyScreen())));
  getMenuButtonUi().addButton(getFabFabrik().getDoneAllFab(new DonePlanungClickedFab(getSkyScreen())));
  getMenuButtonUi().addButton(getFabFabrik().getNextFab(v -> doClickedNext()));
  getSkyScreen().getActorManager().getSelectionMarker().doDeactivate();
  getSkyScreen().getActorManager().getLayers().wegplanLayer.show();
  getSkyScreen().getActorManager().getLayers().wegplanLayer.doModelChanged();
}

private void doClickedNext() {
  System.out.println("Clicked NEXT");
  final Collection<Plane> list = getPlaneListen().getPlanesOnMap().asList();
  if (list.isEmpty()) return;
  getPlaneSelection().setSelected(list.iterator().next());
  setModusTo(getModusFor(getPlaneSelection().getSelected()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedPlane(Hex tappedHex) {
  try {
    final Plane planeAtHex = getPlaneListen().getPlanesOnMap().getByHex(tappedHex);
    getPlaneSelection().setSelected(planeAtHex);
    setModusTo(getModusFor(planeAtHex));
  } catch (PlaneNotFound planeNotFound) {
    planeNotFound.printStackTrace();
    return false;
  }
  return true;
}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
//  tiefe = 3;
//  pathFinding.setMaxDepth(tiefe);
//  pathFinding.gridData.doFloodfill(getUiState().getSlotSelection().getSelected().getCellPos());
//  getSkyScreen().getSkyActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
}
}
