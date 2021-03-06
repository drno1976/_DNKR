package dnkr.dpap.ui.screens.sky.layers;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.appbase.gdx.actors.FacedHexCenteredImage;
import dnkr.dpap.data.games.Games;
import dnkr.dpap.data.uistates.PlaneSelection;
import dnkr.dpap.model.tokens.planes.Plane;
import dnkr.dpap.ui.assets.DpapAssets;
import static dnkr.dpap.ui.assets.DpapAssets.MARKER_ENDPUNKTRICHTUNG;
import dnkr.dpap.ui.screens.sky.VektorImage;
import dnkr.dpap.ui.screens.sky.layers.base.HideableLayer;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hexes.GeparsteHexRoute;

public class WegplanLayer extends HideableLayer {
public WegplanLayer(ActorManager actorManager) {
  super(actorManager);
}

public void createVisuals() {
  for (Plane plane : Games.getGameData().getPlaneListen().getPlanesOnMap().asList()) {
    createWegmarkerFor(plane.getBewegungsplan().getGeparsteHexRoute());
    createZielmarkerAt(plane.getBewegungsplan().getZielHex());
  }
}

private void createWegmarkerFor(GeparsteHexRoute geparsteHexRoute) {
  FacedHex start = geparsteHexRoute.getStart();
  for (FacedHex facedHex : geparsteHexRoute) {
    this.addActor(new VektorImage(getTexture(DpapAssets.MARKER_WEG), start, facedHex));
    start = facedHex;
  }
}

private void createZielmarkerAt(FacedHex hex) {
  final CenteredImage marker = new FacedHexCenteredImage(getTexture(MARKER_ENDPUNKTRICHTUNG), hex);
  this.addActor(marker);
}

private PlaneSelection getPlaneSelection() {
  return Games.getGameData().getUiState().getPlaneSelection();
}
}
