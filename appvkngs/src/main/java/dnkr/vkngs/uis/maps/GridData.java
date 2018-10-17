package dnkr.vkngs.uis.maps;
import android.support.annotation.NonNull;
import java.util.LinkedList;
import java.util.Queue;
import dnkr.appbase.gdx.tiled.CellPos;
import dnkr.appbase.gdx.tiled.TiledMapHelper;

public class GridData {
final ValueCellPoint[] camefrom, costfor;
private final Queue<CellPos> frontier;
public final TiledMapHelper mapHelper;
private final TiledZugangsGrid zugangsGrid;

public GridData(@NonNull TiledMapHelper mapHelper) {
  this.mapHelper = mapHelper;
  frontier = new LinkedList<>();
  camefrom = new ValueCellPoint[mapHelper.getAnzahlZellen()];
  costfor = new ValueCellPoint[mapHelper.getAnzahlZellen()];
  zugangsGrid = new TiledZugangsGrid(mapHelper);
}

public Queue<CellPos> getFrontier() {
  return frontier;
}

public ValueCellPoint[] getCamefrom() {
  return camefrom;
}

public ValueCellPoint[] getCostfor() {
  return costfor;
}

public void doClear() {
  frontier.clear();
  for (int i = 0; i < camefrom.length; i++) {
    camefrom[i] = null;
    costfor[i] = null;
  }
}

public TiledZugangsGrid getZugangsGrid() {
  return zugangsGrid;
}
}
