package dnkr.dpap.ui.screens.sky;
import android.view.View;
import dnkr.dpap.ui.screens.sky.modi.SkyScreenModusUnselected;

public class ClickedFabDoneMoving implements View.OnClickListener {
private final SkyScreen skyScreen;

public ClickedFabDoneMoving(SkyScreen skyScreen) {
  this.skyScreen = skyScreen;
}

@Override
public void onClick(View v) {
  System.out.println("Clicked DONEALL-Moving");
  skyScreen.getButtonUis().getMenuButtonUi().removeButton("DoneAll");
  skyScreen.getButtonUis().getActionButtonUi().removeAll();
  skyScreen.setModusTo(new SkyScreenModusUnselected(skyScreen));
}
}
