package dnkr.dpap.model;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;

public class HexOrt {
private final FacedHex facedHex;

public HexOrt() {
  facedHex = new FacedHex();
}

public FacedHex getHex() {
  return facedHex;
}

public boolean isAt(Hex atHex) {
  return facedHex.isAt(atHex);
}
}
