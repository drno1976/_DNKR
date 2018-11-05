package dnkr.dpap.ui.screens.sky;
import android.view.View;
import dnkr.dpap.ui.screens.sky.modi.MovingModusReady;

public class DonePlanungClickedFab extends SkyScreenClickedFab {
public DonePlanungClickedFab(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void onClick(View v) {
  System.out.println("Clicked DONEALL-Planung");
  getMenuButtonUi().removeButton("DoneAll");
  getMenuButtonUi().removeButton("Next");
  skyScreen.getActorManager().getSelectionMarker().doDeactivate();
  getLayers().wegplanLayer.removeChildrenFromStage();
  System.out.println("Change to resolve");
  getActionButtonUi().removeAll();
  skyScreen.setModusTo(new MovingModusReady(skyScreen));
}
}
