package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import dnkr.appbase.base.MovingHextoken;
import dnkr.dpap.ui.UiPreferences;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hexes.GeparsteHexRoute;

public class HexpfadMovingActions extends MovingModusActions {
private final float movingDuration;

public HexpfadMovingActions(MovingHextoken hextoken) {
  super(hextoken);
  movingDuration = UiPreferences.getPrefs().getMovingDuration();
}

@Override
public Action getActions() {
  final SequenceAction sequence = Actions.sequence();
  FacedHex start = getHextoken().getHexOrt().getHex();
  float lastfacingDegrees = start.getFacingDegrees();
  final GeparsteHexRoute hexRoute = getBewegungsplan().getGeparsteHexRoute();
  final float duration = movingDuration / hexRoute.size();
  for (int schritt = 0; schritt < hexRoute.size(); schritt++) {
    final FacedHex zu = hexRoute.get(schritt);
    final Vector2FromHex pos = getPosFor(zu);
    if (lastfacingDegrees != zu.getFacingDegrees()) {
      sequence.addAction(Actions.parallel(
              Actions.moveTo(pos.x, pos.y, duration),
              Actions.rotateTo(zu.getFacingDegrees(), duration, Interpolation.pow5In
              )));
    } else {
      sequence.addAction(Actions.moveTo(pos.x, pos.y, duration));
    }
    lastfacingDegrees = zu.getFacingDegrees();
  }
  return sequence;
}
}
