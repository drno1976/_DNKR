package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

class AnimatedActor extends Image {
private final AnimationImage animationImage;

public AnimatedActor(AnimationImage animationImage) {
  super(animationImage);
  this.animationImage = animationImage;
}

public AnimatedActor(Animation<TextureRegion> animation) {
  this(new AnimationImage(animation));
}

@Override
public void act(float delta) {
  animationImage.act(delta);
  super.act(delta);
}

public void setAnimation(Animation<TextureRegion> animation) {
  animationImage.setAnimation(animation);
}
}
