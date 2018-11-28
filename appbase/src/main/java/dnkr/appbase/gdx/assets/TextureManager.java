package dnkr.appbase.gdx.assets;
import android.util.Log;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;

public class TextureManager implements AssetErrorListener {
private final AssetManager assetManager;
private HashMap<String, TextureRegion> atlasTextureMap;

public TextureManager(@NotNull AssetManager assetManager) {
  this.assetManager = assetManager;
  atlasTextureMap = new HashMap<>();
  assetManager.setErrorListener(this);
}

public Texture loadDirekt(String pfad) {
//  if (!assetManager.isLoaded(pfad)){
//    Log.v(TAG,"loadDirekt: "+pfad);
  assetManager.load(pfad, Texture.class);
  assetManager.finishLoading();
//  }else {
//    Log.v(TAG,"already in Assets: "+pfad);
//  }
  
  Texture texture;
  try {
    texture = assetManager.get(pfad, Texture.class);
  } catch (Exception e) {
    e.printStackTrace();
    texture = new Texture(16,16, Pixmap.Format.RGBA8888);  //noch dunkel machen?
    
  }
  return texture;
}

@Override
public void error(AssetDescriptor asset, Throwable throwable) {
  Log.e(getClass().getName(), "ERROR loadDirekt: " + asset.fileName);
}

public void printForDebug() {
  for (String s : assetManager.getAssetNames()) {
    System.out.println("AssetNames= " + s);
  }
}

public TextureSheet loadSheetDirekt(String pfad, int tilesize) {
  assetManager.load(pfad, Texture.class);
  assetManager.finishLoading();
//  }else {
//    Log.v(TAG,"already in Assets: "+pfad);
//  }
  return new TextureSheet(assetManager.get(pfad, Texture.class),tilesize);
  
}

public TextureSheet loadSheetDirekt(String pfad) {
  assetManager.load(pfad, Texture.class);
  assetManager.finishLoading();
//  }else {
//    Log.v(TAG,"already in Assets: "+pfad);
//  }
  return new TextureSheet(assetManager.get(pfad, Texture.class));
}

public void loadAtlas(String atlasPfad) {
  assetManager.load(atlasPfad, TextureAtlas.class);
  assetManager.finishLoading();
  TextureAtlas atlas = assetManager.get(atlasPfad, TextureAtlas.class);
  for (TextureAtlas.AtlasRegion region : atlas.getRegions()) {
    atlasTextureMap.put(region.name,atlas.findRegion(region.name));
  }
  
}

public TextureRegion getTexture(String name) {
  final TextureRegion texture = atlasTextureMap.get(name);
  if (texture==null) {
    System.err.println("Texture not found in atlas: "+name);
    final Texture direkt = loadDirekt(name);
    if (direkt!=null)
      return new TextureRegion(direkt);
    else {
      System.err.println("Texture not found per direkt: " + name);
    }
    
  }
  return texture;
}
}
