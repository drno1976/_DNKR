package dnkr.dpap.model.bewegungen;
import java.util.HashMap;

public class PlaneManoevers extends HashMap<String, PlaneManoever> {
public PlaneManoever getVorwaerts() {
  return get("vw");
}
}
