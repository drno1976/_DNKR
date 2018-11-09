package dnkr.dpap.ui.screens.sky;
import java.util.ArrayList;
import dnkr.dpap.model.Plane;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;
import dnkr.libhex.HexRoute;
import dnkr.libhex.UniqueHexes;

public class Bewegungsfeld {
private final ArrayList<Hex> feldHexes;
private final ArrayList<FacedHex> zielHexes;

public Bewegungsfeld(Plane plane) {
  feldHexes = new UniqueHexes();
  zielHexes = new ArrayList<>();
  for (HexRoute hexRoute : plane.getBewegungsplaner().getHexRoutes()) {
    for (FacedHex facedHex : hexRoute) {
      feldHexes.add(facedHex);
    }
    zielHexes.add(hexRoute.getZiel());
  }
}

public ArrayList<Hex> getFeldHexes() {
  return feldHexes;
}

public ArrayList<FacedHex> getZielHexes() {
  return zielHexes;
}
}
