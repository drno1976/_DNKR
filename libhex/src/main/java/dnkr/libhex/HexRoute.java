package dnkr.libhex;
import java.util.ArrayList;

public class HexRoute extends ArrayList<FacedHex> {
public FacedHex getZiel() {
  if (isEmpty()) return null;
  return get(this.size() - 1);
}
}
