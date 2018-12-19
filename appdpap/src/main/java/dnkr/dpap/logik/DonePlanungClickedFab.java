package dnkr.dpap.logik;
import android.view.View;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.dpap.ui.screens.sky.SkyScreenClickedFab;
import dnkr.dpap.ui.screens.sky.modi.ResolvingModus;

public class DonePlanungClickedFab extends SkyScreenClickedFab {
public DonePlanungClickedFab(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void onClick(View v) {
  System.out.println("Clicked DONEALL-Planung");
  getMenuButtonUi().removeButton("DoneAll");
  getMenuButtonUi().removeButton("Next");
  getSkyScreen().getActorManager().getSelectionMarker().doDeactivate();
  getLayers().wegplanLayer.hide();
  getLayers().wegplanLayer.removeChildrenFromStage();
  System.out.println("Change to resolve");
  getActionButtonUi().removeAll();
  getSkyScreen().setModusTo(new ResolvingModus(getSkyScreen()));
}
}
