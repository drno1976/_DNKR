package dnkr.dpap.ui;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import dnkr.appbase.activitys.FullscreenApplication;
import dnkr.dpap.data.Games;

public class ActivityGdx extends FullscreenApplication {
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  doFullscreen();
  Games.checkGameData(this);
  RelativeLayout layoutGameUi = new RelativeLayout(this); // Create the layoutGameUi
  final View gdxView = initializeForView(new DpapGdxUi(getContext(), layoutGameUi));
  layoutGameUi.addView(gdxView); // Add the libgdx view
//  adView = admobHelper.createNewAdView(this);
//  layoutGameUi.addView(adView, getLayoutForAdmob());// Add the AdMob view
  setContentView(layoutGameUi); // Hook it all up
  
}
}
