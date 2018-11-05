package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.Hex;

public class PlanungModusMoveplotting extends PlanungModus {
public PlanungModusMoveplotting(SkyScreen skyScreen) {
  super(skyScreen);
  skyScreen.getActorManager().getSelectionMarker().doActivate();
  skyScreen.getActorManager().getLayers().wegplanungLayer.doModelChanged();
  getActionButtonUi().removeAll();
  getActionButtonUi().addButton(getFabFabrik().getCancelFab(v -> doClickedCancel()));
}

private void doClickedCancel() {
  getActionButtonUi().removeAll();
  setModusTo(new PlanungModusSelectedOwn(getSkyScreen()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedSelected(tappedHex)) {
    doClickedCancel();
    return;
  }
//  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedSelected(Hex tappedHex) {
  return getUiState().getPlaneSelection().getSelected().getHexOrt().isAt(tappedHex);
}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
//  tiefe = 3;
//  pathFinding.setMaxDepth(tiefe);
//  pathFinding.gridData.doFloodfill(getUiState().getSlotSelection().getSelected().getCellPos());
//  getSkyScreen().getSkyActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
}

}
