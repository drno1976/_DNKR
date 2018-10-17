package dnkr.dpap.data;
import dnkr.appbase.activitys.FullscreenApplication;

public class Games {
private static GameData gameData;

public static GameData getGameData() {
  return gameData;
}

public static void checkGameData(FullscreenApplication gdxUi) {
  if (gameData == null) loadGameData();
}

private static void loadGameData() {
  //chooser
  gameData = new TestGameData();
}
}
