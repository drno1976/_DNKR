package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class FpsLabel extends Label {
@Override
public void act(float delta) {
  super.act(delta);
  setText(String.valueOf(Gdx.graphics.getFramesPerSecond()));
//  setText(String.valueOf(Gdx.graphics.getFramesPerSecond()) + " " + stageModus.toString());
}

public FpsLabel() {
  super("FPS", createStyle());
  //text.setBounds(0,.2f,Room.WIDTH,2);
  setFontScale(3f, 3f);
}

private static LabelStyle createStyle() {
  LabelStyle textStyle;
  BitmapFont font = new BitmapFont();
//font.setUseIntegerPositions(false);(Optional)
  textStyle = new LabelStyle();
  textStyle.font = font;
  return textStyle;
}
}
