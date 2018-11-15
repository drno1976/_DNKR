package dnkr.dpap.model;
import static dnkr.dpap.model.PlaneTypes.KYRASSIER;
import static dnkr.dpap.model.PlaneTypes.VALKYR;

class PlaneTypesManoverFabrik {
private final PlaneTypes types;
private PlaneType type;

public PlaneTypesManoverFabrik(PlaneTypes types) {
  this.types = types;
  setType(VALKYR);
  add("vw", 6);
  addMirrored("r1", new PlaneManoever("vvvrlvv"));
  addMirrored("r2", new PlaneManoever("vvvrvv"));
  addMirrored("r3", new PlaneManoever("vvrvrv"));
  setType(KYRASSIER);
  add("vw", 4);
  addMirrored("r1", new PlaneManoever("vvrlv"));
  addMirrored("r2", new PlaneManoever("vvrv"));
  addMirrored("r3", new PlaneManoever("vrvrv"));
  //"vvvvv,vvlrvv,vvvlvv,vvlvv,vvrlvv,vvvrvv,vvrvv");
}

private void add(String art, int speed) {
  type.getPlaneManoevers().put(art, new PlaneManoever(speed));
}

private void addMirrored(String art, PlaneManoever manoever) {
  type.getPlaneManoevers().put(art, manoever);
  type.getPlaneManoevers().put(art.replace("r", "l"), manoever.getMirrored());
}

private void add(String art, PlaneManoever manoever) {
  type.getPlaneManoevers().put(art, manoever);
}

public PlaneType getType() {
  return type;
}

public void setType(String typeId) {
  this.type = types.getById(typeId);
}
}

/*
"vvvvvv,vvvlrvv,vvvlvv,vvvrlvv,vvvvrvv,vvvrvv,vvrvv,vvrvrv");
 */
