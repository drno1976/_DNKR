package dnkr.dpap.ui.screens.sky;
public class SkyScreenLayers {
public final PlaneLayer planeLayer;
public final WegplanLayer wegplanLayer;
public final WegplanungLayer wegplanungLayer;

public SkyScreenLayers(SkyActorManager actorManager) {
  planeLayer = new PlaneLayer(actorManager);
  wegplanLayer = new WegplanLayer(actorManager);
  wegplanungLayer = new WegplanungLayer(actorManager);
}
}