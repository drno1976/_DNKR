package dnkr.appbase.gdx.assets;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class LpcSheet extends TextureSheet {
public LpcSheet(TextureSheet sheet) {
  super(sheet);
  setTilesize(64,64);
}

public Animation<TextureRegion> getAnimationIdle() {
  final Animation<TextureRegion> animation =
          new Animation<>(1 / 2f, getFrames(10, 2));
  animation.setPlayMode(Animation.PlayMode.LOOP);
  return animation;
}

public Animation<TextureRegion> getAnimationHurt() {
  final Animation<TextureRegion> animation =
          new Animation<>(1 / 2f, getFrames(20, 6));
  animation.setPlayMode(Animation.PlayMode.LOOP);
  return animation;
}

public Animation<TextureRegion> getAnimationAttack() {
  final Animation<TextureRegion> animation =
          new Animation<>(1 / 4f, getFrames(14, 6));
  animation.setPlayMode(Animation.PlayMode.LOOP);
  return animation;
}
}

/*
•sc: spellcast
•th: thrust
•wc: walkcycle
•sl: slash
•sh: shoot
•hu: hurt

 */
