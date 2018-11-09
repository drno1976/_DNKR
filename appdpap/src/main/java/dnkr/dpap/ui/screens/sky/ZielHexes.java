package dnkr.dpap.ui.screens.sky;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;

public class ZielHexes extends java.util.ArrayList<dnkr.libhex.FacedHex> {
public boolean hasHexAt(Hex hex) {
  for (FacedHex facedHex : this) {
    if (facedHex.isAt(hex)) return true;
  }
  return false;
}
}
