package dnkr.libhex.hexes;
import dnkr.libhex.hex.Hex;

public class UniqueHexes extends java.util.ArrayList<Hex> {
@Override
public boolean add(Hex addHex) {
  for (Hex hex : this) {
    if (hex.isAt(addHex)) return false;
  }
  return super.add(addHex);
}
}
