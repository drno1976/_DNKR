package dnkr.dpap.model;
import java.util.ArrayList;
import dnkr.libhex.FacedHex;
import dnkr.libhex.GeparsteHexRoute;

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
