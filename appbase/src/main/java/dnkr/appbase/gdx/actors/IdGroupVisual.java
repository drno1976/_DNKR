package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.Texture;
import dnkr.libbase.IdObject;

public abstract class IdGroupVisual extends Layer {
public IdGroupVisual(ActorManager actorManager, IdObject idObject) {
  super(actorManager);
  setName(idObject.getId());
  setUserObject(idObject);
}

protected Texture loadTexture(String path) {
  return getTextureManager().loadDirekt(path);
}
}
