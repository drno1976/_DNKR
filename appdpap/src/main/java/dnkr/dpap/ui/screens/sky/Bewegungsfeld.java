package dnkr.dpap.ui.screens.sky;
import java.util.ArrayList;
import java.util.HashMap;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.hexes.GeparsteHexRoute;
import dnkr.libhex.hexes.UniqueHexes;

public class Bewegungsfeld {
private final ArrayList<Hex> feldHexes;
private final ZielHexes zielHexes;
private final HashMap<String, GeparsteHexRoute> routeHashMap;

public Bewegungsfeld(Plane plane) {
  feldHexes = new UniqueHexes();
  zielHexes = new ZielHexes();
  routeHashMap = new HashMap<>();
  for (GeparsteHexRoute hexRoute : plane.getBewegungsplaner().getHexRoutes()) {
    for (FacedHex facedHex : hexRoute) {
      feldHexes.add(facedHex); //unique add
    }
    zielHexes.add(hexRoute.getZiel());
    routeHashMap.put(hexRoute.getZiel().getSimplePosition(), hexRoute);
  }
}

public ArrayList<Hex> getFeldHexes() {
  return feldHexes;
}

public ZielHexes getZielHexes() {
  return zielHexes;
}

public GeparsteHexRoute getRouteFor(Hex tappedHex) {
  return routeHashMap.get(tappedHex.getSimplePosition());
}
}
