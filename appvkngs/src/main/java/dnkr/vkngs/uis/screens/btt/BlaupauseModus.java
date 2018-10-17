package dnkr.vkngs.uis.screens.btt;
import dnkr.appbase.gdx.tiled.TiledStageScreenModus;
import dnkr.vkngs.data.uistates.UiState;

class BlaupauseModus extends TiledStageScreenModus {
private final BttScreen blaupause;

public BlaupauseModus(BttScreen blaupause) {
  super(blaupause);
  this.blaupause = blaupause;
  
}

public BttScreen getBlaupause() {
  return blaupause;
}

public UiState getUiState() {
  return getBlaupause().getGameData().getUiState();
}
}
