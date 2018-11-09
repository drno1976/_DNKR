package dnkr.libhex;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;

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
