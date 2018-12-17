package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.logik.DoneMovingClickedFab;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.hex.Hex;

public class MovingModusFinished extends MovingModus {
public MovingModusFinished(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void begin() {
  getActionButtonUi().addButton(getFabFabrik().getReplayFab(v -> doClickedReplay()));
  getMenuButtonUi().addButton(getFabFabrik().getDoneAllFab(new DoneMovingClickedFab(getSkyScreen())));
  getSkyScreen().getActorManager().getSelectionMarker().doDeactivate();
}

private void doClickedReplay() {
  System.out.println("Clicked replay");
  getActionButtonUi().removeButton("Replay");
  getMenuButtonUi().removeButton("DoneAll");
  getSkyScreen().getActorManager().resetMoving();
  setModusTo(new MovingModusReady(getSkyScreen()));
}

@Override
public void tappedAt(Vector2 stagexy) {
  Hex tappedHex = getHexFor(stagexy);
  if (isClickedPlane(tappedHex)) return;
}

private boolean isClickedPlane(Hex tappedHex) {
//  try {
//    final Plane planeAtHex = getPlaneListen().getPlanesOnMap().getByHex(tappedHex);
//    getUiState().getPlaneSelection().setSelected(planeAtHex);
//    setModusTo(getModusFor(planeAtHex));
//  } catch (PlaneNotFound planeNotFound) {
//    planeNotFound.printStackTrace();
//    return false;
//  }
  return true;
}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
}
}
