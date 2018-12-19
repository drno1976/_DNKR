package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.ui.assets.DpapAssets;

public class GenericHextokenVisual extends HextokenVisual {
public GenericHextokenVisual(ActorManager actorManager, Hextoken hextoken) {
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
}
