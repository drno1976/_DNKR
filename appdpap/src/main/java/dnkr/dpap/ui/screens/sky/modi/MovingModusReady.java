package dnkr.dpap.ui.screens.sky.modi;
import com.badlogic.gdx.math.Vector2;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.libhex.hex.Hex;

public class MovingModusReady extends MovingModus {
public MovingModusReady(SkyScreen skyScreen) {
  super(skyScreen);
  getActionButtonUi().addButton(getFabFabrik().getPlayFab(v -> doClickedPlay()));
  skyScreen.getActorManager().getSelectionMarker().doDeactivate();
}

private void doClickedPlay() {
  System.out.println("Clicked play");
  getSkyScreen().getActorManager().prepareMoving();
  getActionButtonUi().removeButton("Play");
  setModusTo(new MovingModusFinished(getSkyScreen()));
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
