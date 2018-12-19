package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.MovingHextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.ui.assets.DpapAssets;
import dnkr.dpap.ui.base.actions.StraightMovingActions;

public class GenericMovingHextokenVisual extends MovingHextokenVisual {
public GenericMovingHextokenVisual(ActorManager actorManager, MovingHextoken movingHextoken) {
  super(actorManager, movingHextoken);
  doModelChanged();
//  resetMoving();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
  final Image main = new CenteredImage(getTexture(DpapAssets.GENERICTEXTURE_PNG));
  addActor(main);
  resetMoving();
}

@Override
public void prepareMoving() {
  resetMoving();
  this.addAction(new StraightMovingActions(getMovingHextoken()).getActions());
}

@Override
public void resetMoving() {
  this.clearActions();
  placeByHexOrt();
}
}
