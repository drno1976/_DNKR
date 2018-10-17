package dnkr.vkngs.uis.maps;
import dnkr.appbase.gdx.tiled.CellPos;

public class ValueCellPoint extends CellPos {
private byte value;

public ValueCellPoint(CellPos current, byte value) {
  super(current);
  this.value = value;
}

public byte getValue() {
  return value;
}

public void setValue(byte value) {
  this.value = value;
}
}
