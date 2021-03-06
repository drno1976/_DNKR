package dnkr.dpap.model.bewegungen;
import java.util.ArrayList;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hexes.GeparsteHexRoute;
import dnkr.libhex.routen.RoutenAsSchrittStrings;

public class Bewegungsplaner {
private final ArrayList<GeparsteHexRoute> hexRoutes;

public Bewegungsplaner(FacedHex start, RoutenAsSchrittStrings routenAsSchrittStrings) {
  hexRoutes = new ArrayList<>();
  for (String schrittString : routenAsSchrittStrings) {
    hexRoutes.add(new GeparsteHexRoute(start, schrittString));
  }
}

public ArrayList<GeparsteHexRoute> getHexRoutes() {
  return hexRoutes;
}
}
