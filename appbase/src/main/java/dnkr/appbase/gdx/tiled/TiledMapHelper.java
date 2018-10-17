package dnkr.appbase.gdx.tiled;
import android.support.annotation.NonNull;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import java.util.ArrayList;

public class TiledMapHelper extends TiledMapSizes {
public TiledMapHelper(TiledMap tiledMap) {
  super(tiledMap);
}

public CellPos getCellCoordinatesFor(Vector2 stageCoordinates) {
  int x = (int) (stageCoordinates.x / getTilePixel().getWidth());
  int y = (int) ((getMapPixel().getHeight() - stageCoordinates.y) / getTilePixel().getHeight());
  return new CellPos(x, y);
}

public Vector2 getStageCoordinatesFor(CellPos cellPos) {
  final Vector2 stageCoordinates = new Vector2();
  stageCoordinates.x = cellPos.getX() * getTilePixel().getWidth();
  stageCoordinates.y = cellPos.getY() * getTilePixel().getHeight();
  stageCoordinates.y = getMapPixel().getHeight() - stageCoordinates.y - getTilePixel().getHeight();
  return stageCoordinates;
}

public int getIndexFor(@NonNull CellPos pos) {
  return pos.y * getMap().getHeight() + pos.x;
}

public boolean isNotOnMap(CellPos pos) {
  return !isOnMap(pos);
}

public boolean isOnMap(CellPos pos) {
  if (pos.x < 0) return false;
  if (pos.y < 0) return false;
  if (pos.x > (getMap().getWidth() - 1)) return false;
  if (pos.y > (getMap().getHeight() - 1)) return false;
  return true;
}

public ArrayList<Vector2> getStageCoordinatesFor(ArrayList<CellPos> path) {
  final ArrayList<Vector2> vector2s = new ArrayList<>();
  for (CellPos cellPos : path) {
    vector2s.add(getStageCoordinatesFor(cellPos));
  }
  return vector2s;
}
}
