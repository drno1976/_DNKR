package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.ui.screens.sky.Bewegungsfeld;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.Hex;

public class PlanungModusMoveplotting extends PlanungModus {
private final Bewegungsfeld bewegungsfeld;

public PlanungModusMoveplotting(SkyScreen skyScreen) {
  super(skyScreen);
  skyScreen.getActorManager().getSelectionMarker().doActivate();
  bewegungsfeld = new Bewegungsfeld(getPlaneSelection().getSelected());
  skyScreen.getActorManager().getLayers().wegplanungLayer.setBewegungsfeld(bewegungsfeld);
  skyScreen.getActorManager().getLayers().wegplanungLayer.doModelChanged();
  getActionButtonUi().removeAll();
  getActionButtonUi().addButton(getFabFabrik().getCancelFab(v -> doClickedCancel()));
}

private void doClickedCancel() {
  getActionButtonUi().removeAll();
  getSkyScreen().getActorManager().getLayers().wegplanungLayer.removeChildrenFromStage();
  setModusTo(new PlanungModusSelectedOwn(getSkyScreen()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedSelected(tappedHex)) {
    doClickedCancel();
    return;
  }
  if (isClickedZielHex(tappedHex)) return;
//  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedSelected(Hex tappedHex) {
  return getPlaneSelection().getSelected().getHexOrt().isAt(tappedHex);
}

private boolean isClickedZielHex(Hex tappedHex) {
  return false;
}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
//  tiefe = 3;
//  pathFinding.setMaxDepth(tiefe);
//  pathFinding.gridData.doFloodfill(getUiState().getSlotSelection().getSelected().getCellPos());
//  getSkyScreen().getSkyActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
}
}
