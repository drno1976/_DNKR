package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.ui.assets.DpapAssets;
import dnkr.dpap.ui.base.actions.HexpfadMovingActions;

public class GenericHextokenVisual extends HextokenVisual {
public GenericHextokenVisual(ActorManager actorManager, Hextoken hextoken) {
  super(actorManager, hextoken);
  final Image main = new CenteredImage(getTexture(DpapAssets.GENERICTEXTURE_PNG));
  addActor(main);
//  resetMoving();
}

@Override
public void doModelChanged() {
}

@Override
public void prepareMoving() {
  resetMoving();
  this.addAction(new HexpfadMovingActions(getHextoken()).getActions());
}

private Hextoken getHextoken() {
  return (Hextoken) getUserObject();
}

@Override
public void resetMoving() {
  this.clearActions();
  setPositionWithHex(getHextoken().getHexOrt().getHex());
  setRotationWithHex(getHextoken().getHexOrt().getHex());
}
}
