package dnkr.dpap.ui.screens.sky;
import android.view.View;
import dnkr.appbase.buttons.ButtonUi;

public abstract class SkyScreenClickedFab implements View.OnClickListener {
protected final SkyScreen skyScreen;

public SkyScreenClickedFab(SkyScreen skyScreen) {
  this.skyScreen = skyScreen;
}

@Override
public abstract void onClick(View v);

public ButtonUi getActionButtonUi() {
  return skyScreen.getButtonUis().getActionButtonUi();
}

public SkyScreenLayers getLayers() {
  return skyScreen.getActorManager().getLayers();
}

public ButtonUi getMenuButtonUi() {
  return skyScreen.getButtonUis().getMenuButtonUi();
}
}
