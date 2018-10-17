package dnkr.dpap.ui.sky.modi;
import dnkr.appbase.gdx.base.Modus;
import dnkr.dpap.data.Games;
import dnkr.dpap.data.PlaneListen;
import dnkr.dpap.data.uistates.UiState;
import dnkr.dpap.model.Plane;
import dnkr.dpap.ui.base.HexScreenModus;
import dnkr.dpap.ui.sky.SkyScreen;

class SkyScreenModus extends HexScreenModus {
private final SkyScreen skyScreen;

public SkyScreenModus(SkyScreen skyScreen) {
  super(skyScreen);
  this.skyScreen = skyScreen;
}

public SkyScreen getSkyScreen() {
  return skyScreen;
}

public UiState getUiState() {
  return Games.getGameData().getUiState();
}

protected PlaneListen getPlaneListen() {
  return Games.getGameData().getPlaneListen();
}

protected Modus getModusFor(Plane plane) {
  return new SkyScreenModusSelectedOwn(getSkyScreen());
}
}
