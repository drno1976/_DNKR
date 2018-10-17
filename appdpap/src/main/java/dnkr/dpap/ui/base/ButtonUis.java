package dnkr.dpap.ui.base;
import dnkr.appbase.buttons.ButtonUi;
import dnkr.appbase.buttons.ButtonUiParams;
import dnkr.appbase.gdx.base.GdxUi;
import dnkr.dpap.ui.assets.DpapFabFabrik;

public class ButtonUis {
private final DpapFabFabrik fabFabrik;
private final ButtonUi menuButtonUi, actionButtonUi;

public ButtonUis(GdxUi gdxUi) {
  fabFabrik = new DpapFabFabrik(gdxUi.getContext());
  menuButtonUi = new ButtonUi(gdxUi, ButtonUiParams.getFabrik().getLayoutParamsForRechtsOben());
  actionButtonUi = new ButtonUi(gdxUi, ButtonUiParams.getFabrik().getLayoutParamsForRechtsUnten());
}

public ButtonUi getMenuButtonUi() {
  return menuButtonUi;
}

public ButtonUi getActionButtonUi() {
  return actionButtonUi;
}

public DpapFabFabrik getFabFabrik() {
  return fabFabrik;
}
}
