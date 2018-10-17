package dnkr.appbase.gdx.tiled;
import android.support.annotation.NonNull;
import android.util.Size;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.TiledMap;

class TiledMapSizes extends MapSizes {
private static final Class<Integer> INTEGER = Integer.class;
@NonNull
private final TiledMap tiledMap;

public TiledMapSizes(@NonNull TiledMap tiledMap) {
  super();
  this.tiledMap = tiledMap;
  MapProperties p = tiledMap.getProperties();
  setMap(new Size(p.get("width", INTEGER), p.get("height", INTEGER)));
  setTilePixel(new Size(p.get("tilewidth", INTEGER), p.get("tileheight", INTEGER)));
}

@NonNull
public TiledMap getTiledMap() {
  return tiledMap;
}
}
