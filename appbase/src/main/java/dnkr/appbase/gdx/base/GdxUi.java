package dnkr.appbase.gdx.base;
import android.content.Context;
import android.widget.RelativeLayout;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import dnkr.appbase.gdx.assets.TextureManager;

public abstract class GdxUi extends Game {
private final Context context;
private final RelativeLayout layoutGameUi;
private final AssetManager assetManager;
private final TextureManager textureManager;

public GdxUi(Context context, RelativeLayout layoutGameUi) {
  super();
  this.context = context;
  this.layoutGameUi = layoutGameUi;
  assetManager = new AssetManager();
  textureManager = new TextureManager(assetManager);
}

@Override
public void create() {
  setScreen(chooseScreenAtCreate());
}

public abstract Screen chooseScreenAtCreate(); //new PlanungScreen(this)

public AssetManager getAssetManager() {
  return assetManager;
}

public TextureManager getTextureManager() {
  return textureManager;
}

public Context getContext() {
  return context;
}

public RelativeLayout getLayoutGameUi() {
  return layoutGameUi;
}
}
