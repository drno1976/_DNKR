package dnkr.dpap.ui.screens.sky.modi;
import dnkr.dpap.data.uistates.PlaneSelection;
import dnkr.dpap.ui.screens.sky.SkyScreen;

abstract class PlanungModus extends SkyScreenModus {
public PlanungModus(SkyScreen skyScreen) {
  super(skyScreen);
}

protected PlaneSelection getPlaneSelection() {
  return getUiState().getPlaneSelection();
}
}
