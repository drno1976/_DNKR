package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import dnkr.dpap.model.Plane;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;

public class HexpfadMovingActions {
private final Plane plane;

public HexpfadMovingActions(Plane plane) {
  this.plane = plane;
}

public Action getActions() {
  final SequenceAction sequence = Actions.sequence();
   FacedHex start = plane.getHexOrt().getHex();
  for (int i = 0; i < 6; i++) {
    final FacedHex turnedLeft = start.turnedLeft();
    final Vector2FromHex pos = getPosFor(turnedLeft);
    sequence.addAction(Actions.moveTo(pos.x,pos.y,2));
    start=turnedLeft;
  }
  return sequence;
}

private Vector2FromHex getPosFor(Hex hex) {
  return new Vector2FromHex(hex);
}
}
