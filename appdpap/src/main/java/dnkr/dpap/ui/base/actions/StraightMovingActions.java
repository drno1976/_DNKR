package dnkr.dpap.ui.base.actions;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import dnkr.appbase.base.MovingHextoken;
import dnkr.dpap.ui.UiPreferences;
import dnkr.libhex.hex.FacedHex;

public class StraightMovingActions extends MovingModusActions {
private final float movingDuration;

public StraightMovingActions(MovingHextoken hextoken) {
  super(hextoken);
  movingDuration = UiPreferences.getPrefs().getMovingDuration();
}

@Override
public Action getActions() {
  FacedHex start = getHextoken().getHexOrt().getHex();
  //rotate gemäß vektor
  final FacedHex zu = getHextoken().getBewegungsplan().getZielHex();
  final Vector2FromHex pos = getPosFor(zu);
  return Actions.parallel(
          Actions.moveTo(pos.x, pos.y, movingDuration),
          Actions.rotateTo(zu.getFacingDegrees(), movingDuration, Interpolation.pow5In
          ));
}
}
