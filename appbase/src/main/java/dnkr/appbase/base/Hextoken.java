package dnkr.appbase.base;
import dnkr.libhex.HasHexOrt;
import dnkr.libhex.HexOrt;
import dnkr.libhex.ids.IdObject;

public class Hextoken extends IdObject implements HasHexOrt {
protected final HexOrt hexOrt;

public Hextoken(String id) {
  super(id);
  hexOrt = new HexOrt();
}

@Override
public HexOrt getHexOrt() {
  return hexOrt;
}
}
