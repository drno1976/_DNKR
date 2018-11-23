package dnkr.dpap.ui.screens.sky;
import java.util.ArrayList;
import dnkr.dpap.model.planes.Plane;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.hexes.GeparsteHexRoute;
import dnkr.libhex.hexes.UniqueHexes;

public class Bewegungsfeld {
private final ArrayList<Hex> feldHexes;
private final ZielHexes zielHexes;

public Bewegungsfeld(Plane plane) {
  feldHexes = new UniqueHexes();
  zielHexes = new ZielHexes();
  for (GeparsteHexRoute hexRoute : plane.getBewegungsplaner().getHexRoutes()) {
    for (FacedHex facedHex : hexRoute) {
      feldHexes.add(facedHex);
    }
    zielHexes.add(hexRoute.getZiel());
//    System.out.println("hexRoute.getZiel().getSimplePosition() = " + hexRoute.getZiel().getSimplePosition());
  }
}

public ArrayList<Hex> getFeldHexes() {
  return feldHexes;
}

public ZielHexes getZielHexes() {
  return zielHexes;
}
}
