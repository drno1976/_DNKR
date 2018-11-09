package dnkr.libhex.hexes;
import java.util.ArrayList;
import dnkr.libhex.hex.FacedHex;

public class HexRoute extends ArrayList<FacedHex> {
public FacedHex getZiel() {
  if (isEmpty()) return null;
  return get(this.size() - 1);
}
}
