package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import java.util.Collection;
import dnkr.dpap.model.Plane;
import dnkr.dpap.model.PlaneNotFound;
import dnkr.dpap.ui.screens.sky.ClickedFabDonePlanung;
import dnkr.dpap.ui.screens.sky.ClickedFabMenu;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.Hex;

public class SkyScreenModusUnselected extends SkyScreenModus {
public SkyScreenModusUnselected(SkyScreen skyScreen) {
  super(skyScreen);
  getMenuButtonUi().addButton(getFabFabrik().getMenuFab(new ClickedFabMenu(skyScreen)));
  getMenuButtonUi().addButton(getFabFabrik().getDoneAllFab(new ClickedFabDonePlanung(skyScreen)));
  getMenuButtonUi().addButton(getFabFabrik().getNextFab(v -> doClickedNext()));
}

private void doClickedNext() {
  System.out.println("Clicked NEXT");
  final Collection<Plane> list = getPlaneListen().getPlanesOnMap().asList();
  if (list.isEmpty()) return;
  getUiState().getPlaneSelection().setSelected(list.iterator().next());
  setModusTo(getModusFor(getUiState().getPlaneSelection().getSelected()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedPlane(tappedHex)) return;
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
