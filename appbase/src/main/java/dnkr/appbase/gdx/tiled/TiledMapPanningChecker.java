package dnkr.appbase.gdx.tiled;
import android.support.annotation.NonNull;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.MathUtils;
import dnkr.appbase.gdx.base.PanningChecker;

class TiledMapPanningChecker extends PanningChecker {
private final OrthographicCamera camera;
private final int mapPixelWidth, mapPixelHeight;

public TiledMapPanningChecker(OrthographicCamera orthographicCamera, @NonNull TiledMap tiledMap) {
  super(orthographicCamera);
  this.camera = orthographicCamera;
  final MapSizes tmp = new TiledMapSizes(tiledMap);
  mapPixelWidth = tmp.getMapPixel().getWidth();
  mapPixelHeight = tmp.getMapPixel().getHeight();
}

@Override
public void panned() {
  camera.position.x = MathUtils.clamp(camera.position.x, 0, mapPixelWidth);
  camera.position.y = MathUtils.clamp(camera.position.y, 0, mapPixelHeight);
}
}
