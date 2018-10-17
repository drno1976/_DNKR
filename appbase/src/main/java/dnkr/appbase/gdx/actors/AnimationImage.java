package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable;

class AnimationImage extends BaseDrawable {
private Animation<TextureRegion> animation;
private float stateTime = 0;

public AnimationImage(Animation<TextureRegion> animation) {
  setAnimation(animation);
//  this.animation = animation;
//  setMinWidth(animation.getKeyFrames()[0].getRegionWidth());
//  setMinHeight(animation.getKeyFrames()[0].getRegionHeight());
}

public void setAnimation(Animation<TextureRegion> animation) {
  reset();
  this.animation = animation;
  setMinWidth(animation.getKeyFrames()[0].getRegionWidth());
  setMinHeight(animation.getKeyFrames()[0].getRegionHeight());
}

public void act(float delta) {
  stateTime += delta;
}

public void reset() {
  stateTime = 0;
}

@Override
public void draw(Batch batch, float x, float y, float width, float height) {
  batch.draw(animation.getKeyFrame(stateTime), x, y, width, height);
}
}
