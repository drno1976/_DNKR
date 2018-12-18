package dnkr.appbase.base;
import java.util.HashMap;

public class HextokenMap extends HashMap<String, Hextoken> {
public void put(Hextoken hextoken) {
  put(hextoken.getId(), hextoken);
}
}
