package dnkr.dpap.ui.screens.sky;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.HasHexAt;
import dnkr.libhex.hex.Hex;

public class ZielHexes extends java.util.ArrayList<FacedHex> implements HasHexAt {
@Override
public boolean hasHexAt(Hex hex) {
  for (FacedHex facedHex : this) {
    if (facedHex.isAt(hex)) return true;
  }
  return false;
}
}
