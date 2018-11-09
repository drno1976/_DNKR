package dnkr.dpap.ui.screens.sky;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.data.Games;
import dnkr.dpap.data.uistates.PlaneSelection;
import static dnkr.dpap.ui.assets.DpapAssets.ENDPUNKT_RICHTUNG_HUD;
import dnkr.dpap.ui.base.actors.FacedHexCenteredImage;
import dnkr.libhex.hex.FacedHex;

public class WegplanLayer extends Layer {
public WegplanLayer(ActorManager actorManager) {
  super(actorManager);
}

public void doModelChanged() {
  this.removeChildrenFromStage();
  if (getPlaneSelection().isNone()) return;
  final FacedHex zielHex = getPlaneSelection().getSelected().getBewegungsplan().getZielHex();
  createZielmarkerAt(zielHex);
}

private void createZielmarkerAt(FacedHex hex) {
  final CenteredImage marker = new FacedHexCenteredImage(getTexture(ENDPUNKT_RICHTUNG_HUD),hex);
  this.addActor(marker);
}

private PlaneSelection getPlaneSelection() {
  return Games.getGameData().getUiState().getPlaneSelection();
}
}
