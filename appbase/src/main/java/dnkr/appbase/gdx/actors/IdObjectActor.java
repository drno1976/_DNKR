package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.Texture;
import dnkr.appbase.base.IdObject;

public class IdObjectActor extends ActorLayer {
public IdObjectActor(ActorManager actorManager, IdObject idObject) {
  super(actorManager);
  setName(idObject.getId());
  setUserObject(idObject);
}

protected Texture loadTexture(String path) {
  return getTextureManager().loadDirekt(path);
}
}
