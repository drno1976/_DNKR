package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import dnkr.libhex.hex.Hex;

public class HexCenteredImage extends CenteredImage {
public HexCenteredImage(TextureRegion region, Hex hex) {
  super(region);
  moveBy(hex.getPixelX(), hex.getPixelY());
}

public void setPositionWithHex(Hex hex) {
  setPosition(-getWidth() / 2, -getHeight() / 2);
  moveBy(hex.getPixelX(), hex.getPixelY());
}

public void setRotationForFacing(byte facing) {
  switch (facing) {
    case 0:
      setRotation(0);
      break;
    case 1:
      setRotation(-60);
      break;
    case 2:
      setRotation(-120);
      break;
    case 3:
      setRotation(180);
      break;
    case 4:
      setRotation(+120);
      break;
    case 5:
      setRotation(60);
      break;
  }
}
}
