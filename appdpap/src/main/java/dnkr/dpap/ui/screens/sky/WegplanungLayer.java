package dnkr.dpap.ui.screens.sky;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.data.Games;
import dnkr.dpap.data.uistates.PlaneSelection;
import dnkr.dpap.ui.assets.DpapAssets;
import static dnkr.dpap.ui.assets.DpapAssets.ENDPUNKT_RICHTUNG_HUD;
import dnkr.dpap.ui.base.actors.FacedHexCenteredImage;
import dnkr.dpap.ui.base.actors.HexCenteredImage;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;

public class WegplanungLayer extends Layer {
public WegplanungLayer(ActorManager actorManager) {
  super(actorManager);
}

public void doModelChanged() {
  this.removeChildrenFromStage();
  if (getPlaneSelection().isNone()) return;
  final Bewegungsfeld bewegungsfeld = new Bewegungsfeld(getPlaneSelection().getSelected());
  for (Hex hex : bewegungsfeld.getHexes()) {
    createFeldmarkerAt(hex);
  }
  final FacedHex zielHex = getPlaneSelection().getSelected().getBewegungsplan().getZielHex();
  createZielmarkerAt(zielHex);
}

private void createFeldmarkerAt(Hex hex) {
  final CenteredImage marker = new HexCenteredImage(getTexture(DpapAssets.MARKER_HEX_GREEN),hex);
  this.addActor(marker);
}

private void createZielmarkerAt(FacedHex hex) {
  final CenteredImage marker = new FacedHexCenteredImage(getTexture(ENDPUNKT_RICHTUNG_HUD),hex);
  this.addActor(marker);
}

private PlaneSelection getPlaneSelection() {
  return Games.getGameData().getUiState().getPlaneSelection();
}
}
