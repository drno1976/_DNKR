package dnkr.dpap.model;
import java.util.ArrayList;
import dnkr.libhex.FacedHex;
import dnkr.libhex.GeparsteHexRoute;
import dnkr.libhex.HexRoute;

public class Bewegungsplaner {
private final ArrayList<HexRoute> hexRoutes;

public Bewegungsplaner(FacedHex start, RoutenAsSchrittStrings routenAsSchrittStrings) {
  hexRoutes = new ArrayList<>();
  for (String schrittString : routenAsSchrittStrings) {
    final HexRoute route = new GeparsteHexRoute(start, schrittString);
    hexRoutes.add(route);
  }
}

public ArrayList<HexRoute> getHexRoutes() {
  return hexRoutes;
}
}
