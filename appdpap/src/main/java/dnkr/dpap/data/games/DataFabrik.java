package dnkr.dpap.data.games;
class DataFabrik {
private final GameData data;

DataFabrik(GameData data) {
  this.data = data;
}

public GameData getData() {
  return data;
}
}
