package dnkr.appbase.buttons;
import dnkr.appbase.gdx.base.GdxUi;

public class MenuButtonUi extends ButtonUi {
public MenuButtonUi(GdxUi gdxUi) {
  super(gdxUi, ButtonUiParams.getFabrik().getLayoutParamsForRechtsOben());
}
//private LinearLayout createMenubuttons( ) {
//  LinearLayout layoutButtons = createLinearLayout();
//  layoutButtons.addView(getDoneAllFab(getGdxUiController()));
//  layoutButtons.addView(getChangeUserroleFab(getGdxUiController()));
//  layoutButtons.addView(getDebugFab(getGdxUiController()));
//  return layoutButtons;
//}
//
//public void show(FloatingActionButton fab) {
//  UiHandler.run(() -> fab.setVisibility(View.VISIBLE));
//}
//
//public void hide(FloatingActionButton fab) {
//  UiHandler.run(() -> fab.setVisibility(View.GONE));
//}
}
