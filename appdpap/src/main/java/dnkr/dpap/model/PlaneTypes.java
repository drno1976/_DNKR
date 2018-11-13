package dnkr.dpap.model;
import java.util.HashMap;

public class PlaneTypes {
public static final String VALKYR = "Valkyr";
public static final String KYRASSIER = "Kyrassier";
public static final String HORNET = "Hornet";
public static final String WASP = "Wasp";
private final HashMap<String, PlaneType> map;

public PlaneTypes() {
  map = new HashMap<>();
  fill();
}

private void fill() {
  add(new PlaneType(VALKYR));
  add(new PlaneType(KYRASSIER));
  add(new PlaneType(HORNET));
  add(new PlaneType(WASP));
  new PlaneTypesManoverFabrik(this);
}

private PlaneType add(PlaneType type) {
  map.put(type.getId(), type);
  return type;
}

public PlaneType getById(String typeID) {
  return map.get(typeID);
}
}
