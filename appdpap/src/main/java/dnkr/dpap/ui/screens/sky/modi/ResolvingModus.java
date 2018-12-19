package dnkr.dpap.ui.screens.sky.modi;
import dnkr.dpap.logik.turns.ShootingModusResolver;
import dnkr.dpap.ui.screens.sky.SkyScreen;

public class ResolvingModus extends SkyScreenModus {
public ResolvingModus(SkyScreen skyScreen) {
  super(skyScreen);
}

@Override
public void begin() {
  getSkyScreen().getActorManager().getSelectionMarker().doDeactivate();
  new ShootingModusResolver().doResolve();
  getSkyScreen().getActorManager().doModelChanged();
  getSkyScreen().setModusTo(new MovingModusReady(getSkyScreen()));
}
}
