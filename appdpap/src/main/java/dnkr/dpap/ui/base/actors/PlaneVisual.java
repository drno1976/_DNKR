package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.ui.assets.PlaneTextureIds;
import dnkr.dpap.ui.base.actions.HexpfadMovingActions;

public class PlaneVisual extends MovingHextokenVisual {
public PlaneVisual(ActorManager actorManager, Plane plane) {
  super(actorManager, plane);
  doModelChanged();
}

@Override
public void buildVisual() {
  final Image main = new CenteredImage(getTexture(PlaneTextureIds.getIds().getIdFor(getPlane())));
  addActor(main);
}

@Override
public void prepareMoving() {
  resetMoving();
  this.addAction(new HexpfadMovingActions(getPlane()).getActions());
}

private Plane getPlane() {
  return (Plane) getUserObject();
}
}
