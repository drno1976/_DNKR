package dnkr.appbase.gdx.assets;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureSheet {
private final Texture texture;
private int tilesizeX, tilesizeY;

public TextureSheet(Texture texture) {
  this(texture, 32);
}

public TextureSheet(Texture texture, int tilesize) {
  this.texture = texture;
  this.tilesizeX = tilesize;
  this.tilesizeY = tilesize;
}

public TextureSheet(TextureSheet sheet) {
  this(sheet.texture, sheet.tilesizeX);
}

public void setTilesize(int tilesizeX, int tilesizeY) {
  this.tilesizeX = tilesizeX;
  this.tilesizeY = tilesizeY;
}

public TextureRegion getRegion(int a, int b, int c, int d) {
  return new TextureRegion(texture, a, b, c, d);
}

public void setZeilen(int rows) {
  tilesizeY = texture.getHeight() / rows;
}

public void setSpalten(int spalten) {
  tilesizeX = texture.getWidth() / spalten;
}

public TextureRegion[] getFrames(int zeile, int frames) {
  final TextureRegion[] regions = new TextureRegion[frames];
  for (int i = 0; i < frames; i++) {
    regions[i] = getTileAt(zeile, i);
  }
  return regions;
}

public TextureRegion getTileAt(int zeile, int spalte) {
  return new TextureRegion(texture, spalte * tilesizeX, zeile * tilesizeY, tilesizeX, tilesizeY);
}
}
