package dnkr.appbase.gdx.assets;
import com.badlogic.gdx.assets.AssetManager;
public class DebugAssetManager {
private final AssetManager assetManager;

public DebugAssetManager(AssetManager assetManager) {
  this.assetManager = assetManager;
}

public void printLoadedTextures() {
  System.out.println("printLoadedTextures Begin");
  for (String assetName : assetManager.getAssetNames()) {
    System.out.println("assetName = " + assetName);
  }
  System.out.println("printLoadedTextures End");
}
}
