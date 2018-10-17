package dnkr.dpap.model;
import java.util.Collection;
import java.util.HashMap;
import dnkr.libhex.Hex;

public class PlaneMap {
private final HashMap<String, Plane> map;

public PlaneMap() {
  map = new HashMap<>();
}

public void add(Plane plane) {
  map.put(plane.getId(), plane);
}

public Collection<Plane> asList() {
  return map.values();
}

public void clear() {
  map.clear();
}

public Plane getById(String planeId) throws PlaneNotFound {
  if (map.containsKey(planeId))
    return map.get(planeId);
  throw new PlaneNotFound(" byId: " +planeId);
  
}

public Plane getByHex(Hex atHex) throws PlaneNotFound {
  for (Plane plane : map.values()) {
    if (plane.getHexOrt().isAt(atHex))
      return plane;
  }
  throw new PlaneNotFound(" atHex: "+ atHex);
}
}
