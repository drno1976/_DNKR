package dnkr.dpap.model.bewegungen;
import dnkr.libhex.hex.FacedHex;

public class Bewegungsplan {
private FacedHex zielHex;

public void init() {
}

public FacedHex getZielHex() {
  return zielHex;
}

public void setZielHex(FacedHex zielHex) {
  this.zielHex = zielHex;
}
}
