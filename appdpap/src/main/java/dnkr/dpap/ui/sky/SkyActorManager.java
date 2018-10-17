package dnkr.dpap.ui.sky;
import android.support.annotation.NonNull;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.FpsLabel;
import dnkr.dpap.ui.base.SelectionMarker;

public class SkyActorManager extends ActorManager {
private final SkyScreen screen;
private final PlaneLayer planeLayer;
private final SelectionMarker selectionMarker;

public SkyActorManager(@NonNull SkyScreen skyScreen) {
  super(skyScreen);
  this.screen = skyScreen;
//  pfadSchritteGroup = new PfadSchritteGroup(this);
//  pathfindingCellsLayer = new PathfindingCellsLayer(this);
  planeLayer = new PlaneLayer(this);
  selectionMarker = new SelectionMarker(this);
}

@Override
public void fillStage() {
  removeAllActorsfromStage();
  addToStage(selectionMarker);
  addToStage(planeLayer);
  addToStage(new FpsLabel());
}

public SelectionMarker getSelectionMarker() {
  return selectionMarker;
}
}
