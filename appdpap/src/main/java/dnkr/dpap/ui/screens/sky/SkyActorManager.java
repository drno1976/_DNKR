package dnkr.dpap.ui.screens.sky;
import android.support.annotation.NonNull;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.FpsLabel;
import dnkr.dpap.ui.base.actors.SelectionMarker;

public class SkyActorManager extends ActorManager {
private final SkyScreen screen;
private final SelectionMarker selectionMarker;
private final SkyScreenLayers layers;

public SkyActorManager(@NonNull SkyScreen skyScreen) {
  super(skyScreen);
  this.screen = skyScreen;
  layers = new SkyScreenLayers(this);
//  pfadSchritteGroup = new PfadSchritteGroup(this);
//  pathfindingCellsLayer = new PathfindingCellsLayer(this);
  selectionMarker = new SelectionMarker(this);
}

@Override
public void fillStage() {
  removeAllActorsfromStage();
  addToStage(selectionMarker);
  addToStage(layers.wegplanLayer);
  addToStage(layers.planeLayer);
  addToStage(layers.wegplanungLayer);
  addToStage(new FpsLabel());
}

public SelectionMarker getSelectionMarker() {
  return selectionMarker;
}

public void prepareMoving() {
  layers.planeLayer.prepareMoving();
}

public void resetMoving() {
  layers.planeLayer.resetMoving();
}

@Override
public void doModelChanged() {
  layers.planeLayer.doModelChanged();
  layers.wegplanLayer.doModelChanged();
}

public SkyScreenLayers getLayers() {
  return layers;
}
}
