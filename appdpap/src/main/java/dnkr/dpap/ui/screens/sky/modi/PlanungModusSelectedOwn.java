package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.model.planes.PlaneNotFound;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.hex.Hex;

public class PlanungModusSelectedOwn extends PlanungModus {
public PlanungModusSelectedOwn(SkyScreen skyScreen) {
  super(skyScreen);

}

private void doClickedMoveplotting() {
  doClear();
  setModusTo(new PlanungModusMoveplotting(getSkyScreen()));
}

private void doClear() {
  getActionButtonUi().removeAll();
}

@Override
public void begin() {
  getSkyScreen().getActorManager().getSelectionMarker().doActivate();
  getSkyScreen().getActorManager().getLayers().wegplanLayer.doModelChanged();
  getActionButtonUi().removeAll();
  getActionButtonUi().addButton(getFabFabrik().getMoveFab(v -> doClickedMoveplotting()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedSelected(tappedHex)) {
    doClickedMoveplotting();
    return;
  }
  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedSelected(Hex tappedHex) {
  return getPlaneSelection().getSelected().getHexOrt().isAt(tappedHex);
}

private boolean isClickedPlane(Hex tappedHex) {
  try {
    final Plane planeAtHex = getPlaneListen().getPlanesOnMap().getByHex(tappedHex);
    getPlaneSelection().setSelected(planeAtHex);
    doClear();
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
