package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.scenes.scene2d.Action;
import dnkr.dpap.model.Plane;
import dnkr.libhex.hex.Hex;

public abstract class MovingModusActions {
protected final Plane plane;

MovingModusActions(Plane plane) {
  this.plane = plane;
}

public abstract Action getActions();

public Vector2FromHex getPosFor(Hex hex) {
  return new Vector2FromHex(hex);
}
}
