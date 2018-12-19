package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.scenes.scene2d.Action;
import dnkr.appbase.base.MovingHextoken;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.routen.Bewegungsplan;

public abstract class MovingModusActions {
private final MovingHextoken hextoken;

MovingModusActions(MovingHextoken hextoken) {
  this.hextoken = hextoken;
}

public MovingHextoken getHextoken() {
  return hextoken;
}

public abstract Action getActions();

public Vector2FromHex getPosFor(Hex hex) {
  return new Vector2FromHex(hex);
}

protected Bewegungsplan getBewegungsplan() {
  return hextoken.getBewegungsplan();
}
}
