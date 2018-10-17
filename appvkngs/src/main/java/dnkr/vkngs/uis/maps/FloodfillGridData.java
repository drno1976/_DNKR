package dnkr.vkngs.uis.maps;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import dnkr.appbase.gdx.tiled.CellPos;
import dnkr.appbase.gdx.tiled.TiledMapHelper;

public class FloodfillGridData extends GridData {
private final Tiefengrenze tiefengrenze;

public FloodfillGridData(@NonNull TiledMapHelper mapHelper) {
  super(mapHelper);
  tiefengrenze = new Tiefengrenze();
}

public void doFloodfill(CellPos from) {
  doClear();
  tiefengrenze.reset();
  getFrontier().add(from);
  camefrom[mapHelper.getIndexFor(from)] = null;
  costfor[mapHelper.getIndexFor(from)] = new ValueCellPoint(from, (byte) 0);
  while ((!getFrontier().isEmpty()) && tiefengrenze.isInMaxDepth()) {
    tiefengrenze.inc();
    final CellPos current = getFrontier().poll();
    for (CellPos next : getNachbarnAuchDiagonalFor(current)) {
      if (mapHelper.isNotOnMap(next)) continue;
      if (getZugangsGrid().isAccess(current, next)) {
        byte costnext = (byte) (costfor[mapHelper.getIndexFor(current)].getValue() + getCostFor(getRichtung(current, next)));
        if (camefrom[mapHelper.getIndexFor(next)] == null) {
          getFrontier().add(next);
          camefrom[mapHelper.getIndexFor(next)] = new ValueCellPoint(current, getRichtung(current, next));
          costfor[mapHelper.getIndexFor(next)] = new ValueCellPoint(next, costnext);
        } else {
          if (costnext < costfor[mapHelper.getIndexFor(next)].getValue()) {
            getFrontier().add(next);
            camefrom[mapHelper.getIndexFor(next)] = new ValueCellPoint(current, getRichtung(current, next));
            costfor[mapHelper.getIndexFor(next)] = new ValueCellPoint(next, costnext);
          }
        }
      }
    }
  }
}

public ArrayList<CellPos> getNachbarnAuchDiagonalFor(CellPos current) {
  return new DiagonalCellPointNachbarn(current);
}

private byte getCostFor(byte richtung) {
  if (richtung % 2 == 0) return 2;
  return 3;
}

private byte getRichtung(CellPos current, @NonNull CellPos next) {
  return next.getDelta(current).getRichtungAsByte();
}

public void setMaxDepth(int maxDepth) {
  tiefengrenze.setMaxDepth(maxDepth);
}

public ArrayList<CellPos> getNachbarnKreuzFor(CellPos current) {
  return new CellPointNachbarn(current);
}

}
