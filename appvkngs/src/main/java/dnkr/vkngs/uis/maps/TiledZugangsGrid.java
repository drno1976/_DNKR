package dnkr.vkngs.uis.maps;
import android.support.annotation.NonNull;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import dnkr.appbase.gdx.tiled.CellPos;
import dnkr.appbase.gdx.tiled.TiledMapHelper;

class TiledZugangsGrid extends ZugangsGrid {
private TiledMapTileLayer walls;

public TiledZugangsGrid(@NonNull TiledMapHelper mapHelper) {
  super(mapHelper.getMap());
  walls = (TiledMapTileLayer) mapHelper.getTiledMap().getLayers().get("walls");
  if (walls!=null)  parseWallLayer();
}

private void parseWallLayer() {
  for (int x = 0; x < walls.getWidth(); x++) {
    for (int y = 0; y < walls.getHeight(); y++) {
      parseCellAt(x, y, walls.getCell(x, y));
    }
  }
}

private void parseCellAt(int x, int y, TiledMapTileLayer.Cell cell) {
  if (cell == null) return;
  final int id = cell.getTile().getId();
  System.out.println("id = " + id);
}

private void printeLayers(@NonNull TiledMapHelper mapHelper) {
  final MapLayers layers = mapHelper.getTiledMap().getLayers();
  for (MapLayer layer : layers) {
    System.out.println("layer = " + layer.getName());
  }
}

@Override
public boolean isAccess(CellPos from, CellPos to) {
  final TiledMapTileLayer.Cell fromCell = walls.getCell(from.x, from.y);
  final TiledMapTileLayer.Cell toCell = walls.getCell(to.x, to.y);
  if (fromCell == null) {
    if (toCell == null)
      return true;
  }
  return false;
}
}
