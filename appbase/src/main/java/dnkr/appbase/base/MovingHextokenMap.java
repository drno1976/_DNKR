package dnkr.appbase.base;
import java.util.HashMap;

public class MovingHextokenMap extends HashMap<String, MovingHextoken> {
public void put(MovingHextoken movingHextoken) {
  put(movingHextoken.getId(), movingHextoken);
}
}
