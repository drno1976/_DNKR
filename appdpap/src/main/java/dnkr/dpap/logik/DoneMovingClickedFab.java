package dnkr.dpap.logik;
import android.view.View;
import dnkr.dpap.logik.turns.TurnResolver;
import dnkr.dpap.ui.screens.sky.SkyScreen;
import dnkr.dpap.ui.screens.sky.SkyScreenClickedFab;
import dnkr.dpap.ui.screens.sky.modi.PlanungModusUnselected;

public class DoneMovingClickedFab extends SkyScreenClickedFab {
public DoneMovingClickedFab(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void onClick(View v) {
  System.out.println("Clicked DONEALL-Moving");
  getMenuButtonUi().removeButton("DoneAll");
  getActionButtonUi().removeAll();
  new TurnResolver().doResolve();
  
  //check Spielende
  //verzweige gemäß resultat
  getSkyScreen().getActorManager().doModelChanged();
  //ändere actors
  getSkyScreen().setModusTo(new PlanungModusUnselected(getSkyScreen()));
}
}
