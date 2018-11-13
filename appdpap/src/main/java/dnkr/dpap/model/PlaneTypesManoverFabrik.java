package dnkr.dpap.model;
import static dnkr.dpap.model.PlaneTypes.KYRASSIER;
import static dnkr.dpap.model.PlaneTypes.VALKYR;

class PlaneTypesManoverFabrik {
public PlaneTypesManoverFabrik(PlaneTypes types) {
  types.getById(VALKYR).getPlaneManoevers().put("vw", new PlaneManoever(6));
  types.getById(VALKYR).getPlaneManoevers().put("r1", new PlaneManoever("vvvrlvv"));
  types.getById(VALKYR).getPlaneManoevers().put("r2", new PlaneManoever("vvvrvv"));
  types.getById(VALKYR).getPlaneManoevers().put("r3", new PlaneManoever("vvrvrv"));
  types.getById(KYRASSIER).getPlaneManoevers().put("vw", new PlaneManoever(4));
  //"vvvvv,vvlrvv,vvvlvv,vvlvv,vvrlvv,vvvrvv,vvrvv");
}
}

/*
"vvvvvv,vvvlrvv,vvvlvv,vvvrlvv,vvvvrvv,vvvrvv,vvrvv,vvrvrv");
 */
