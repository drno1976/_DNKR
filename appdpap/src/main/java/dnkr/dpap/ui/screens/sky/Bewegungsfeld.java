package dnkr.dpap.ui.screens.sky;
import java.util.ArrayList;
import dnkr.dpap.model.Plane;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;

public class Bewegungsfeld {
private final ArrayList<Hex> hexes;

public Bewegungsfeld(Plane plane) {
  FacedHex start = plane.getHexOrt().getHex().cloned();
  hexes = new ArrayList<>();
  for (int i = 0; i < 6; i++) {
    final FacedHex nextHex = start.getNextHex();
    hexes.add(nextHex);
    start = nextHex;
  }
}

public ArrayList<Hex> getHexes() {
  return hexes;
}
}
