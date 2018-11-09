package dnkr.libhex;
public class GeparsteHexRoute extends HexRoute {
public GeparsteHexRoute(FacedHex start, String schrittString) {
  FacedHex hex = start.cloned();
  for (int i = 0; i < schrittString.length(); i++) {
    final char c = schrittString.charAt(i);
    if (c == 'v') {
      final FacedHex nextHex = hex.getNextHex();
      add(nextHex);
      hex = nextHex;
    }
    if (c == 'l') {
      if (schrittString.charAt(i + 1) == 'r') {
        i++;
        add(hex.turnLeft().getNextHex().turnRight());
      } else {
        hex.turnLeft();
      }
    }
    if (c == 'r') {
      if (schrittString.charAt(i + 1) == 'l') {
        i++;
        add(hex.turnRight().getNextHex().turnLeft());
      } else {
        hex.turnRight();
      }
    }
  }
}
}
