package dnkr.vkngs.uis.maps;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Stack;
import dnkr.appbase.gdx.tiled.CellPos;
import dnkr.appbase.gdx.tiled.TiledMapHelper;

public class TiledMapPathFinding extends TiledMapHelper {
public final FloodfillGridData gridData;

public TiledMapPathFinding(@NonNull TiledMapHelper mapHelper) {
  super(mapHelper.getTiledMap());
  gridData = new FloodfillGridData(mapHelper);
  //TODO int[] für cost richtung und camefrom -> weniger als 50k neue cellpoints...
}

public ArrayList<CellPos> getPath(CellPos from, CellPos to) {
  final Stack<CellPos> path = new Stack<>();
  CellPos current = to;
  if (gridData.camefrom[getIndexFor(current)] != null) {
    while (current.isNotAt(from)) {
      path.push(current);
      current = gridData.camefrom[getIndexFor(current)];
    }
    path.push(from);
  }
  ArrayList<CellPos> pfad = new ArrayList<>(path.size());
  while (!path.empty()) {
    pfad.add(path.pop());
  }
  return pfad;
}


public void setMaxDepth(int maxDepth) {
  gridData.setMaxDepth(maxDepth);
  
}
}
