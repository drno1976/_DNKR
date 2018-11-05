package dnkr.appbase.gdx.actors;
import android.support.annotation.NonNull;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;
import dnkr.appbase.gdx.tiled.TiledMapHelper;

public class TiledManagedGroup extends Layer {
private final TiledMapHelper mapHelper;

public TiledManagedGroup(TiledActorManager actorManager) {
  super(actorManager);
  mapHelper = actorManager.getMapHelper();
}

public TiledMapHelper getMapHelper() {
  return mapHelper;
}

public Actor getCenteredImageActor(String name) {
  final Image image = getCenteredInTile(new Image(getTexture(name)));
  image.setOrigin(Align.center);
  return image;
}

public Image getCenteredInTile(@NonNull Image img) {
  img.setPosition((mapHelper.getTilePixel().getWidth() - img.getWidth()) / 2,
          (mapHelper.getTilePixel().getHeight() - img.getHeight()) / 2);
  return img;
}

@Override
public void doModelChanged() {
}
}
