package dnkr.dpap.ui.base;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.IdObject;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.data.Games;

public class SelectionMarker extends HexActor {
public SelectionMarker(ActorManager actorManager) {
  super(actorManager,new IdObject("selectionmarker"));
  final Image glow1 = new CenteredImage(getTexture("markers/glow3.png"));
  addActor(glow1);
//  glow1.addAction(Actions.forever(Actions.sequence(Actions.scaleBy(0.3f,0.3f,2),Actions.scaleBy(-0.3f,-0.3f))));
  glow1.addAction(Actions.forever(Actions.rotateBy(360,3)));
}

public void doActivate() {
  this.setVisible(true);
  this.setPositionWithHex(Games.getGameData().getUiState().getPlaneSelection().getSelected().getHexOrt().getHex());
}
}
