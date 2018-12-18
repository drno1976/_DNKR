package dnkr.dpap.logik.turns;
import dnkr.dpap.data.games.GameData;
import dnkr.dpap.data.games.Games;

abstract class AbstractResolver implements Resolver {
protected GameData getData() {
  return Games.getGameData();
}
}
