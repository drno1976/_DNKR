package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.ui.assets.DpapAssets;

public class StaticHextokenVisual extends MovingReplayHextokenVisual {
public StaticHextokenVisual(ActorManager actorManager, Hextoken hextoken) {
  super(actorManager, hextoken);
  doModelChanged();
}

@Override
public void doModelChanged() {
  removeChildrenFromStage();
  final Image main = new CenteredImage(getTexture(DpapAssets.GENERICTEXTURE_PNG));
  addActor(main);
  placeByHexOrt();
}

@Override
public void prepareMoving() {
  //do nothing
}

@Override
public void resetMoving() {
  //do nothing
}
}
