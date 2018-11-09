package dnkr.libhex.hexes;
import dnkr.libhex.hex.FacedHex;

public class GeparsteHexRoute extends HexRoute {
private final String schrittString;

public GeparsteHexRoute(FacedHex start, String schrittString) {
  this.schrittString = schrittString;
  FacedHex hex = start.cloned();
  for (int i = 0; i < schrittString.length(); i++) {
    final char c = schrittString.charAt(i);
    if (c == 'v') {
      final FacedHex nextHex = hex.getNextHex();
      add(nextHex);
      hex = nextHex;
    }
    if (c == 'l') {
      if ((i + 1) < schrittString.length()) {
        if (schrittString.charAt(i + 1) == 'r') {
          i++;
          final FacedHex nextHex = hex.turnLeft().getNextHex().turnRight();
          add(nextHex);
          hex = nextHex;
        } else {
          hex.turnLeft();
        }
      }
    }
    if (c == 'r') {
      if (schrittString.charAt(i + 1) == 'l') {
        i++;
        final FacedHex nextHex = hex.turnRight().getNextHex().turnLeft();
        add(nextHex);
        hex = nextHex;
      } else {
        hex.turnRight();
      }
    }
  }
}

public String getSchrittString() {
  return schrittString;
}
}
