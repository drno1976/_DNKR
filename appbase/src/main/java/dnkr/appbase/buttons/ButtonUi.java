package dnkr.appbase.buttons;
import android.support.design.widget.FloatingActionButton;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import dnkr.appbase.activitys.UiHandler;
import dnkr.appbase.gdx.base.GdxUi;

public class ButtonUi {
private final GdxUi gdxUi;
private final LinearLayout layoutButtons;

public ButtonUi(GdxUi gdxUi) {
  this(gdxUi, ButtonUiParams.getFabrik().getLayoutParamsForRechtsOben());
}

public ButtonUi(GdxUi gdxUi, RelativeLayout.LayoutParams params) {
  this.gdxUi = gdxUi;
  layoutButtons = createLinearLayout();
  UiHandler.run(() -> gdxUi.getLayoutGameUi().addView(layoutButtons, params));
}

private LinearLayout createLinearLayout() {
  LinearLayout layoutMenuButtons = new LinearLayout(gdxUi.getContext());
  layoutMenuButtons.setOrientation(LinearLayout.VERTICAL);
  layoutMenuButtons.setGravity(Gravity.END);
  layoutMenuButtons.setPadding(3, 3, 3, 3);
  return layoutMenuButtons;
}

public void removeFrom(RelativeLayout layoutGameUi) {
  UiHandler.run(() -> layoutGameUi.removeView(layoutButtons));
}

public void hide() {
  UiHandler.run(() -> gdxUi.getLayoutGameUi().removeView(layoutButtons));
}

//protected void setMarginFor(FloatingActionButton fab) {
//  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//          LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//  params.setMargins(0, 30, 0, 0);
//  fab.setLayoutParams(params);
//}
//
//public void removeFromGameUi() {
//  removeFrom(gdxUiController.getLayoutGameUi());
//}
//
public FloatingActionButton addButton(FloatingActionButton fab) {
  UiHandler.run(() -> layoutButtons.addView(fab));
  return fab;
}

public void removeButton(String buttonId) {
  final View viewWithTag = layoutButtons.findViewWithTag(buttonId);
  if (viewWithTag == null) {
    System.out.println("Not found: " + buttonId);
  } else {
    UiHandler.run(() -> layoutButtons.removeView(viewWithTag));
    System.out.println("Removed = " + buttonId);
  }
}

public void removeAll() {
  UiHandler.run(() -> layoutButtons.removeAllViews());
}
}
