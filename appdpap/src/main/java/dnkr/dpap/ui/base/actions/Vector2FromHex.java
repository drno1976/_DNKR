package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.math.Vector2;
import dnkr.libhex.hex.Hex;
import static dnkr.libhex.hex.HexKonstanten.VERSATZX;
import static dnkr.libhex.hex.HexKonstanten.VERSATZY;
import static dnkr.libhex.hex.HexKonstanten.VERSATZYhalb;

public class Vector2FromHex extends Vector2 {
public Vector2FromHex(Hex hex) {
  super();
  if (hex.isOdd()) {
    this.set(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
  } else {
    this.set(hex.x * VERSATZX, hex.y * VERSATZY);
  }
}
}
