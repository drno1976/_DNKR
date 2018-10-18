package dnkr.dpap.ui.base;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.model.Plane;
import dnkr.dpap.ui.assets.PlaneTextureIds;
import dnkr.dpap.ui.base.actions.HexpfadMovingActions;

public class PlaneActor extends HexActor {
public PlaneActor(ActorManager actorManager, Plane plane) {
  super(actorManager, plane);
  final Image main = new CenteredImage(getTexture(PlaneTextureIds.getIds().getIdFor(plane)));
  addActor(main);
  setPositionWithHex(plane.getHexOrt().getHex());
  setRotationWithHex(plane.getHexOrt().getHex());
}

public void prepareMoving() {
  this.clearActions();
  setPositionWithHex(getPlane().getHexOrt().getHex());
  setRotationWithHex(getPlane().getHexOrt().getHex());
  this.addAction(new HexpfadMovingActions(getPlane()).getActions());
  
  
}

private Plane getPlane() {
  return (Plane) getUserObject();
}
}
