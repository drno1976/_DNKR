package dnkr.dpap.ui.sky;
import android.view.View;

class ClickedFabMenu implements View.OnClickListener {
private final SkyScreen skyScreen;

public ClickedFabMenu(SkyScreen skyScreen) {
  this.skyScreen = skyScreen;
}

@Override
public void onClick(View v) {
  System.out.println("Klicked MainMenu");
  
}
}
