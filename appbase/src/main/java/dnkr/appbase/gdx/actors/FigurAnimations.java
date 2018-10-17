package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import java.util.HashMap;

public class FigurAnimations {
public static final String IDLE = "idle";
public static final String HURT = "hurt";
public static final String ATTACK = "attack";
protected final HashMap<String, Animation<TextureRegion>> map;

public FigurAnimations() {
  map = new HashMap<>();
}


public Animation<TextureRegion> get(String key) {
  return map.get(key);
}
}
