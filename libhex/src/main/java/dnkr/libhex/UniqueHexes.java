package dnkr.libhex;
public class UniqueHexes extends java.util.ArrayList<dnkr.libhex.Hex> {
@Override
public boolean add(Hex addHex) {
  for (Hex hex : this) {
    if (hex.isAt(addHex)) return false;
  }
  return super.add(addHex);
}
}
