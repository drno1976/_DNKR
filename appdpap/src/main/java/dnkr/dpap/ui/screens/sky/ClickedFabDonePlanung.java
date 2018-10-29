package dnkr.dpap.ui.screens.sky;
import android.view.View;
import dnkr.dpap.ui.screens.sky.modi.MovingModusReady;

public class ClickedFabDonePlanung implements View.OnClickListener {
private final SkyScreen skyScreen;

public ClickedFabDonePlanung(SkyScreen skyScreen) {
  this.skyScreen = skyScreen;
}

@Override
public void onClick(View v) {
  System.out.println("Clicked DONEALL-Planung");
  skyScreen.getButtonUis().getMenuButtonUi().removeButton("DoneAll");
  skyScreen.getButtonUis().getMenuButtonUi().removeButton("Next");
  System.out.println("Change to resolve");
  skyScreen.getButtonUis().getActionButtonUi().removeAll();
  skyScreen.setModusTo(new MovingModusReady(skyScreen));
}
}
