package dnkr.vkngs.data;
import dnkr.vkngs.data.raids.RaidState;
import dnkr.vkngs.data.uistates.UiState;

public class GameData {
private UiState uiState;
private final RaidState raidState;

public GameData() {
  uiState = new UiState();
  raidState = new RaidState();
}

public UiState getUiState() {
  return uiState;
}

public RaidState getRaidState() {
  return raidState;
}
}
