package dnkr.appbase.gdx.actors;
import dnkr.appbase.gdx.tiled.TiledMapHelper;
import dnkr.appbase.gdx.tiled.TiledStageScreen;

public abstract class TiledActorManager extends ActorManager {
private final TiledMapHelper mapHelper;

public TiledActorManager(TiledStageScreen screen) {
  super(screen);
  mapHelper = screen.getMapHelper();
}

public TiledMapHelper getMapHelper() {
  return mapHelper;
}
}
