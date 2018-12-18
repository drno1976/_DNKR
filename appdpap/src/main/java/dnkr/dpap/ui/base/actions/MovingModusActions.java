package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.scenes.scene2d.Action;
import dnkr.appbase.base.Hextoken;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.routen.Bewegungsplan;

public abstract class MovingModusActions {
final Hextoken plane;

MovingModusActions(Hextoken plane) {
  this.plane = plane;
}

public abstract Action getActions();

public Vector2FromHex getPosFor(Hex hex) {
  return new Vector2FromHex(hex);
}

protected Bewegungsplan getBewegungsplan() {
  return plane.ge; //movingtoken
}
}
