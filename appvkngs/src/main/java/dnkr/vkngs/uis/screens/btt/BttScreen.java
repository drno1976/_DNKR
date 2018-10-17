package dnkr.vkngs.uis.screens.btt;
import android.support.annotation.NonNull;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import dnkr.appbase.gdx.tiled.TiledStageScreen;
import dnkr.appbase.gdx.tiled.TiledStageScreenModus;
import dnkr.vkngs.data.GameData;
import dnkr.vkngs.data.Games;
import dnkr.vkngs.uis.VkngsTiledGdxUi;
import dnkr.vkngs.uis.maps.TiledMapPathFinding;

public class BttScreen extends TiledStageScreen {
private final BttActorManager bttActorManager;
private final GameData gameData;
private final TiledMapPathFinding pathFinding;

public BttScreen(VkngsTiledGdxUi gdxUi) {
  super(gdxUi);
  gameData = Games.getGameData();
  bttActorManager = new BttActorManager(this);
  pathFinding = new TiledMapPathFinding(getMapHelper());
}

public GameData getGameData() {
  return gameData;
}

public BttActorManager getBttActorManager() {
  return bttActorManager;
}

@Override
protected TiledMap ladeTmxMap() {
  return new TmxMapLoader().load(getCurrentTmxFileName());
}

@Override
public void show() {
  super.show();
  bttActorManager.fillStage();
}

@NonNull
@Override
protected TiledStageScreenModus chooseModusAtShow() {
  return new BlaupauseModusDebug(this);
//  return new BlaupauseModusSelectedSlot(this);
}

@NonNull
private String getCurrentTmxFileName() {
//  return "stole/blueprint104.tmx";
  return "maps/testmap_001.tmx";
}

public TiledMapPathFinding getPathFinding() {
  return pathFinding;
}
}
