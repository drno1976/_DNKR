package dnkr.vkngs.uis.maps;
import java.util.ArrayList;
import dnkr.appbase.gdx.tiled.CellPos;

class DiagonalCellPointNachbarn extends ArrayList<CellPos> {
public DiagonalCellPointNachbarn(CellPos current) {
  if (((current.x + current.y) % 2) == 0) {  //drehrichtung variieren
    add(new CellPos(current.cloned().translate(1, 0)));
    add(new CellPos(current.cloned().translate(1, 1)));
    add(new CellPos(current.cloned().translate(0, 1)));
    add(new CellPos(current.cloned().translate(-1, 1)));
    add(new CellPos(current.cloned().translate(-1, 0)));
    add(new CellPos(current.cloned().translate(-1, -1)));
    add(new CellPos(current.cloned().translate(0, -1)));
    add(new CellPos(current.cloned().translate(1, -1)));
  } else {
    add(new CellPos(current.cloned().translate(1, -1)));
    add(new CellPos(current.cloned().translate(0, -1)));
    add(new CellPos(current.cloned().translate(-1, -1)));
    add(new CellPos(current.cloned().translate(-1, 0)));
    add(new CellPos(current.cloned().translate(-1, 1)));
    add(new CellPos(current.cloned().translate(0, 1)));
    add(new CellPos(current.cloned().translate(1, 1)));
    add(new CellPos(current.cloned().translate(1, 0)));
  }
}
}
