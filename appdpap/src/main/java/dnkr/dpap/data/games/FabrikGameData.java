package dnkr.dpap.data.games;
class FabrikGameData extends GameData {
protected final PlaneFabrik planes;

public FabrikGameData() {
  super();
  planes = new PlaneFabrik(this);
}
}
