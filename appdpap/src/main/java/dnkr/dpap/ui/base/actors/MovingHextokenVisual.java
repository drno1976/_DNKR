package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.MovingHextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.ui.assets.DpapAssets;
import dnkr.dpap.ui.base.actions.StraightMovingActions;

public class MovingHextokenVisual extends MovingReplayHextokenVisual {
public MovingHextokenVisual(ActorManager actorManager, MovingHextoken movingHextoken) {
  super(actorManager, movingHextoken);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
  buildVisual();
  placeByHexOrt();
}

public void buildVisual() {
  final Image main = new CenteredImage(getTexture(DpapAssets.GENERICTEXTURE_PNG));
  addActor(main);
}

@Override
public void prepareMoving() {
  resetMoving();
  this.addAction(new StraightMovingActions(getMovingHextoken()).getActions());
}

private MovingHextoken getMovingHextoken() {
  return (MovingHextoken) getUserObject();
}

@Override
public void resetMoving() {
  this.clearActions();
  placeByHexOrt();
}
}
