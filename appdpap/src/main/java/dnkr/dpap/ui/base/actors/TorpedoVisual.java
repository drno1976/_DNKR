package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.model.tokens.Torpedo;
import dnkr.dpap.ui.assets.DpapAssets;
import dnkr.dpap.ui.base.actions.StraightMovingActions;

public class TorpedoVisual extends MovingHextokenVisual {
public TorpedoVisual(ActorManager actorManager, Torpedo plane) {
  super(actorManager, plane);
  doModelChanged();
}

@Override
public void buildVisual() {
  final Image main = new CenteredImage(getTexture(DpapAssets.TORPEDO));
  addActor(main);
}

@Override
public void prepareMoving() {
  resetMoving();
  this.addAction(new StraightMovingActions(getTorpedo()).getActions());
}

private Torpedo getTorpedo() {
  return (Torpedo) getUserObject();
}
}
