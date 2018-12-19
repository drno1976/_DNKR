package dnkr.dpap.ui.screens.sky.layers;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.appbase.gdx.actors.FacedHexCenteredImage;
import dnkr.appbase.gdx.actors.HexCenteredImage;
import dnkr.appbase.gdx.actors.Layer;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.data.uistates.PlaneSelection;
import dnkr.dpap.ui.assets.DpapAssets;
import static dnkr.dpap.ui.assets.DpapAssets.MARKER_ENDPUNKTRICHTUNG;
import dnkr.dpap.ui.screens.sky.Bewegungsfeld;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;

public class WegplanungLayer extends Layer {
private Bewegungsfeld bewegungsfeld;

public WegplanungLayer(ActorManager actorManager) {
  super(actorManager);
}

public void setBewegungsfeld(Bewegungsfeld bewegungsfeld) {
  this.bewegungsfeld = bewegungsfeld;
}

public void doModelChanged() {
  this.removeChildrenFromStage();
  if (bewegungsfeld == null) return;
  for (Hex hex : bewegungsfeld.getFeldHexes()) {
    createFeldmarkerAt(hex);
  }
  for (FacedHex zielHex : bewegungsfeld.getZielHexes()) {
    this.addActor(new FacedHexCenteredImage(getTexture(MARKER_ENDPUNKTRICHTUNG), zielHex));
  }
}

private void createFeldmarkerAt(Hex hex) {
  final CenteredImage marker = new HexCenteredImage(getTexture(DpapAssets.MARKER_HEX_GREEN), hex);
  this.addActor(marker);
}

private PlaneSelection getPlaneSelection() {
  return Games.getGameData().getUiState().getPlaneSelection();
}
}
