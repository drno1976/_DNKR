package dnkr.appbase.gdx.tiled;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;

class TiledMapZoomGrenzen {
private final TiledMap tiledMap;
private final int mapPixelWidth, mapPixelHeight;

public TiledMapZoomGrenzen(TiledMap tiledMap) {
  this.tiledMap = tiledMap;
  final MapSizes tmp = new TiledMapSizes(tiledMap);
  mapPixelWidth = tmp.getMapPixel().getWidth();
  System.out.println("mapPixelWidth = " + mapPixelWidth);
  mapPixelHeight = tmp.getMapPixel().getHeight();
  System.out.println("mapPixelHeight = " + mapPixelHeight);
}

public float getMaxFor(OrthographicCamera camera) {
  float maxx=1;
  float maxy=1;
  if (mapPixelWidth>0) {
    final float xHalf = camera.viewportWidth / 2;
    System.out.println("xHalf = " + xHalf);
    maxx =  1/ ( xHalf / mapPixelWidth);
  }
  System.out.println("maxx = " + maxx);
  if (mapPixelHeight>0) {
    final float yHalf = camera.viewportHeight / 2;
    System.out.println("yHalf = " + yHalf);
    maxy =  1/( yHalf / mapPixelHeight);
  }
  System.out.println("maxy = " + maxy);
  return Math.max(maxx,maxy);
}
}
