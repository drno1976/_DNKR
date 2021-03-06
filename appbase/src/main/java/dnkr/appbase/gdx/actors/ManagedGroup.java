package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import dnkr.appbase.gdx.assets.TextureManager;

class ManagedGroup extends Group {
protected final ActorManager actorManager;

ManagedGroup(ActorManager actorManager) {
  this.actorManager = actorManager;
}

public ActorManager getActorManager() {
  return actorManager;
}

public TextureManager getTextureManager() {
  return actorManager.getTextureManager();
}

public Label.LabelStyle createLabelStyle() {
  Label.LabelStyle textStyle;
  BitmapFont font = new BitmapFont();
  textStyle = new Label.LabelStyle();
  textStyle.font = font;
  return textStyle;
}

public TextureRegion getTexture(String name) {
  return actorManager.getTextureManager().getTexture(name);
}
}
