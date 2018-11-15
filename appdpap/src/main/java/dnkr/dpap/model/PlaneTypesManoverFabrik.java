package dnkr.dpap.model;
import static dnkr.dpap.model.PlaneTypes.KYRASSIER;
import static dnkr.dpap.model.PlaneTypes.VALKYR;

class PlaneTypesManoverFabrik {
private final PlaneTypes types;

public PlaneTypesManoverFabrik(PlaneTypes types) {
  this.types = types;
  add(VALKYR, "vw", 6);
  addMirrored(VALKYR, "r1", new PlaneManoever("vvvrlvv"));
  addMirrored(VALKYR, "r2", new PlaneManoever("vvvrvv"));
  addMirrored(VALKYR, "r3", new PlaneManoever("vvrvrv"));
  
  
  types.getById(KYRASSIER).getPlaneManoevers().put("vw", new PlaneManoever(4));
  //"vvvvv,vvlrvv,vvvlvv,vvlvv,vvrlvv,vvvrvv,vvrvv");
}

private void add(String typeId, String art, int speed) {
  types.getById(typeId).getPlaneManoevers().put(art, new PlaneManoever(speed));
}

private void addMirrored(String typeId, String art, PlaneManoever manoever) {
  types.getById(typeId).getPlaneManoevers().put(art, manoever);
  types.getById(typeId).getPlaneManoevers().put(art.replace("r", "l"), manoever.getMirrored());
}

private void add(String typeId, String art, PlaneManoever manoever) {
  types.getById(typeId).getPlaneManoevers().put(art, manoever);
}
}

/*
"vvvvvv,vvvlrvv,vvvlvv,vvvrlvv,vvvvrvv,vvvrvv,vvrvv,vvrvrv");
 */
