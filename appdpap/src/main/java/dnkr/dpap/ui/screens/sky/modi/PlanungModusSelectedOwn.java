package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.model.Plane;
import dnkr.dpap.model.PlaneNotFound;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.Hex;

public class PlanungModusSelectedOwn extends PlanungModus {
public PlanungModusSelectedOwn(SkyScreen skyScreen) {
  super(skyScreen);
  skyScreen.getActorManager().getSelectionMarker().doActivate();
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedSelected(tappedHex)) return;
  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedSelected(Hex tappedHex) {
  return getUiState().getPlaneSelection().getSelected().getHexOrt().isAt(tappedHex);
}

private boolean isClickedPlane(Hex tappedHex) {
  try {
    final Plane planeAtHex = getPlaneListen().getPlanesOnMap().getByHex(tappedHex);
    getUiState().getPlaneSelection().setSelected(planeAtHex);
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
