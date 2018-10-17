package dnkr.appbase.gdx.tiled;
import android.util.Size;

public class MapSizes {
private Size map, tilePixel, mapPixel;

MapSizes() {
  map = new Size(0, 0);
  tilePixel = new Size(0, 0);
  mapPixel = new Size(0, 0);
}

public Size getMap() {
  return map;
}

public void setMap(Size map) {
  this.map = map;
  berecheMapPixel();
}

private void berecheMapPixel() {
  mapPixel = new Size(map.getWidth() * tilePixel.getWidth(),
          map.getHeight() * tilePixel.getHeight());
}

public Size getTilePixel() {
  return tilePixel;
}

public void setTilePixel(Size tilePixel) {
  this.tilePixel = tilePixel;
  berecheMapPixel();
}

public Size getMapPixel() {
  return mapPixel;
}

public int getAnzahlZellen() {
  return map.getHeight() * map.getWidth();
}

@Override
public String toString() {
  return "MapSizes{" +
          "map=" + map +
          ", tilePixel=" + tilePixel +
          ", mapPixel=" + mapPixel +
          '}';
}
}
