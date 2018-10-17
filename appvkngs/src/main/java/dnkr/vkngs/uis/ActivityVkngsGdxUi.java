package dnkr.vkngs.uis;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import dnkr.appbase.activitys.FullscreenApplication;
import dnkr.vkngs.data.Games;

public class ActivityVkngsGdxUi extends FullscreenApplication {
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  doFullscreen();
  Games.checkGameData(this);
  RelativeLayout layoutGameUi = new RelativeLayout(this); // Create the layoutGameUi
  final View gdxView = initializeForView(new VkngsTiledGdxUi(getContext(), layoutGameUi));
  layoutGameUi.addView(gdxView); // Add the libgdx view
//  adView = admobHelper.createNewAdView(this);
//  layoutGameUi.addView(adView, getLayoutForAdmob());// Add the AdMob view
  setContentView(layoutGameUi); // Hook it all up
}
}
