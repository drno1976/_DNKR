package dnkr.dpap.ui.screens.sky;
import android.support.annotation.NonNull;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.FpsLabel;
import dnkr.dpap.ui.base.actors.MovingReplay;
import dnkr.dpap.ui.base.actors.SelectionMarker;

public class SkyActorManager extends ActorManager implements MovingReplay {
private final SkyScreen screen;
private final SelectionMarker selectionMarker;
private final SkyScreenLayers layers;

public SkyActorManager(@NonNull SkyScreen skyScreen) {
  super(skyScreen);
  this.screen = skyScreen;
  layers = new SkyScreenLayers(this);
  selectionMarker = new SelectionMarker(this);
}

@Override
public void fillStage() {
  removeAllActorsfromStage();
  addToStage(selectionMarker);
  addToStage(layers.wegplanLayer);
  addToStage(layers.planeLayer);
  addToStage(layers.wegplanungLayer);
  addToStage(layers.hextokenLayer);
  addToStage(new FpsLabel());
}

public SelectionMarker getSelectionMarker() {
  return selectionMarker;
}

public void prepareMoving() {
  layers.planeLayer.prepareMoving();
  layers.hextokenLayer.prepareMoving();
}

public void resetMoving() {
  layers.planeLayer.resetMoving();
  layers.hextokenLayer.resetMoving();
}

@Override
public void doModelChanged() {
  layers.planeLayer.doModelChanged();
  layers.wegplanLayer.doModelChanged();
  layers.hextokenLayer.doModelChanged();
}

public SkyScreenLayers getLayers() {
  return layers;
}
}
