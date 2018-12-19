package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;
import dnkr.libhex.hex.FacedHex;

public class VektorImage extends Image {
public VektorImage(TextureRegion region, FacedHex von, FacedHex zu) {
  super(region);
  setOrigin(Align.bottom);
  setPosition(-getWidth() / 2, 0);
  moveBy(von.getPixelX(), von.getPixelY());
  setRotation(von.getWinkelDegreesZu(zu));
}

}
