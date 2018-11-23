package dnkr.dpap.model.bewegungen;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hexes.GeparsteHexRoute;

public class Bewegungsplan {
private FacedHex zielHex;
private GeparsteHexRoute geparsteHexRoute;

public void init() {
}

public FacedHex getZielHex() {
  return zielHex;
}

public void setZielHex(FacedHex zielHex) {
  this.zielHex = zielHex;
}

public void setRoute(GeparsteHexRoute routeFor) {
  this.geparsteHexRoute = routeFor;
  setZielHex(routeFor.getZiel());
}

public GeparsteHexRoute getGeparsteHexRoute() {
  return geparsteHexRoute;
}
}
