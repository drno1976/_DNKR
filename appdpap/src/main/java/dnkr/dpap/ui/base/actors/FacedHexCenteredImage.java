package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import dnkr.libhex.hex.FacedHex;

public class FacedHexCenteredImage extends HexCenteredImage {
public FacedHexCenteredImage(TextureRegion region, FacedHex hex) {
  super(region, hex);
  setRotationForFacing(hex.facing);
}
}
