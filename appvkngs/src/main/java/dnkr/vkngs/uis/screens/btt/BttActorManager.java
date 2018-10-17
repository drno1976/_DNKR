package dnkr.vkngs.uis.screens.btt;
import android.support.annotation.NonNull;
import dnkr.appbase.gdx.actors.TiledActorManager;
import dnkr.vkngs.data.GameData;
import dnkr.vkngs.uis.actors.FigurLayer;

public class BttActorManager extends TiledActorManager {
@NonNull
protected final BttScreen bttScreen;
//private final PfadSchritteGroup pfadSchritteGroup;
//private final PathfindingCellsLayer pathfindingCellsLayer;
private final FigurLayer figurLayer;

public BttActorManager(@NonNull BttScreen bttScreen) {
  super(bttScreen);
  this.bttScreen = bttScreen;
//  pfadSchritteGroup = new PfadSchritteGroup(this);
//  pathfindingCellsLayer = new PathfindingCellsLayer(this);
  figurLayer = new FigurLayer(this);
}

@Override
public void fillStage() {
//  getStage().addActor(pfadSchritteGroup);
  //removeAllActorsfromStage();
  addToStage(figurLayer);
//  getStage().addActor(pathfindingCellsLayer);
}

public GameData getGameData() {
  return bttScreen.getGameData();
}
//public PfadSchritteGroup getPfadSchritteGroup() {
//  return pfadSchritteGroup;
//}

//public PathfindingCellsLayer getPathfindingCellsLayer() {
//  return pathfindingCellsLayer;
//}
}
