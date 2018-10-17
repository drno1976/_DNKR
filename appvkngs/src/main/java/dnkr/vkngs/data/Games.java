package dnkr.vkngs.data;
import dnkr.vkngs.uis.ActivityVkngsGdxUi;

public class Games {
private static GameData gameData;

public static GameData getGameData() {
  return gameData;
}

public static void checkGameData(ActivityVkngsGdxUi gdxUi) {
  if (gameData == null) loadGameData();
}

private static void loadGameData() {
  //chooser
  gameData = new TestGameData();
}
}
