package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import dnkr.appbase.base.IdObject;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.dpap.data.Games;
import dnkr.dpap.data.uistates.PlaneSelection;
import dnkr.dpap.ui.assets.DpapAssets;

public class SelectionMarker extends HexGroupVisual {
public SelectionMarker(ActorManager actorManager) {
  super(actorManager, new IdObject("selectionmarker"));
  final Image glow1 = new CenteredImage(getTexture(DpapAssets.MARKERS_GLOW));
  addActor(glow1);
//  glow1.addAction(Actions.forever(Actions.sequence(Actions.scaleBy(0.3f,0.3f,2),Actions.scaleBy(-0.3f,-0.3f))));
  glow1.addAction(Actions.forever(Actions.rotateBy(360, 6)));
}

public void doActivate() {
  doModelChanged();
  this.setVisible(true);
}

@Override
public void doModelChanged() {
  if (getPlaneSelection().isNone()) {
    doDeactivate();
    return;
  }
  this.setPositionWithHex(getPlaneSelection().getSelected().getHexOrt().getHex());
}

private PlaneSelection getPlaneSelection() {
  return Games.getGameData().getUiState().getPlaneSelection();
}

public void doDeactivate() {
  this.setVisible(false);
}
}
