package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;

public class CenteredImage extends Image {
public CenteredImage(TextureRegion region) {
  super(region);
  setOrigin(Align.center);
  setPosition(-getWidth() / 2, -getHeight() / 2);
}
}
