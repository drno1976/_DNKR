package dnkr.dpap.ui.sky;
import dnkr.appbase.gdx.base.Modus;
import dnkr.appbase.gdx.base.ModusStageScreen;
import dnkr.dpap.ui.DpapGdxUi;
import dnkr.dpap.ui.base.ButtonUis;
import dnkr.dpap.ui.sky.modi.SkyScreenModusUnselected;

public class SkyScreen extends ModusStageScreen {
private final SkyActorManager actorManager;
private final ButtonUis buttonUis;

public SkyScreen(DpapGdxUi gdxUi) {
  super(gdxUi);
  actorManager = new SkyActorManager(this);
  buttonUis = new ButtonUis(gdxUi);
  buttonUis.getMenuButtonUi().addButton(buttonUis.getFabFabrik().getMenuFab(new ClickedFabMenu(this)));
  buttonUis.getMenuButtonUi().addButton(buttonUis.getFabFabrik().getDoneAllFab(new ClickedFabDonePlanung(this)));
}

public ButtonUis getButtonUis() {
  return buttonUis;
}

public SkyActorManager getActorManager() {
  return actorManager;
}

@Override
public void show() {
  super.show();
  setModusTo(chooseModusAtShow());
  actorManager.fillStage();
}

private Modus chooseModusAtShow() {
  return new SkyScreenModusUnselected(this);
}
}
