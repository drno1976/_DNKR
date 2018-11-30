package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import dnkr.dpap.model.planes.Plane;
import dnkr.dpap.ui.UiPreferences;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hexes.GeparsteHexRoute;

public class HexpfadMovingActions extends MovingModusActions {
private final float movingDuration;

public HexpfadMovingActions(Plane plane) {
  super(plane);
  movingDuration = UiPreferences.getPrefs().getMovingDuration();
}

@Override
public Action getActions() {
  final SequenceAction sequence = Actions.sequence();
  FacedHex start = plane.getHexOrt().getHex();
  float lastfacingDegrees = start.getFacingDegrees();
  final GeparsteHexRoute hexRoute = plane.getBewegungsplan().getGeparsteHexRoute();
  final float duration = movingDuration / hexRoute.size();
  for (int schritt = 0; schritt < hexRoute.size(); schritt++) {
    final FacedHex hex = hexRoute.get(schritt);
    if (lastfacingDegrees != hex.getFacingDegrees()) {
      lastfacingDegrees = hex.getFacingDegrees();
      final Vector2FromHex pos = getPosFor(hex);
      sequence.addAction(Actions.sequence(
              Actions.rotateTo(hex.getFacingDegrees()),
              Actions.moveTo(pos.x, pos.y, duration)
      ));
    } else {
      final Vector2FromHex pos = getPosFor(hex);
      sequence.addAction(Actions.moveTo(pos.x, pos.y, duration));
    }
    final Vector2FromHex pos = getPosFor(hex);
    sequence.addAction(Actions.moveTo(pos.x, pos.y, duration));
  }
  return sequence;
}

public Action getActionsOld() {
  final SequenceAction sequence = Actions.sequence();
  FacedHex start = plane.getHexOrt().getHex();
  final FacedHex zielHex =           plane.getBewegungsplan().getZielHex();
  final Vector2FromHex pos = getPosFor(zielHex);
  sequence.addAction(Actions.moveTo(pos.x, pos.y, movingDuration ));
//  for (int i = 0; i < 6; i++) {
//    final FacedHex hex = start.getNextHex();
//    final Vector2FromHex pos = getPosFor(hex);
//    sequence.addAction(Actions.moveTo(pos.x, pos.y, movingDuration / 6));
//    start = hex;
//  }
  return sequence;
}
}
