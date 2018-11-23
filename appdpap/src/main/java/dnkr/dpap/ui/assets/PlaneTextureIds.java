package dnkr.dpap.ui.assets;
import dnkr.dpap.model.planes.Plane;

public class PlaneTextureIds {
public static final PlaneTextureIds ourInstance = new PlaneTextureIds();

public static PlaneTextureIds getIds() {
  return ourInstance;
}

private PlaneTextureIds() {
}

public String getIdFor(Plane plane) {
  return "pfeil.png";
}
}
