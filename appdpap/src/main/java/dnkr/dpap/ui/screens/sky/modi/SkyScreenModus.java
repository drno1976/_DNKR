package dnkr.dpap.ui.screens.sky.modi;
import dnkr.appbase.buttons.ButtonUi;
import dnkr.appbase.gdx.base.Modus;
import dnkr.dpap.data.Games;
import dnkr.dpap.data.PlaneListen;
import dnkr.dpap.data.uistates.UiState;
import dnkr.dpap.model.Plane;
import dnkr.dpap.ui.assets.DpapFabFabrik;
import dnkr.dpap.ui.base.HexScreenModus;
import dnkr.dpap.ui.screens.sky.SkyScreen;

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

protected ButtonUi getMenuButtonUi() {
  return skyScreen.getButtonUis().getMenuButtonUi();
}

protected DpapFabFabrik getFabFabrik() {
  return skyScreen.getButtonUis().getFabFabrik();
}

protected ButtonUi getActionButtonUi() {
  return skyScreen.getButtonUis().getActionButtonUi();
}
}
