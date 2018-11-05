package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import dnkr.appbase.gdx.actors.CenteredImage;
import dnkr.libhex.Hex;
import static dnkr.libhex.HexKonstanten.VERSATZX;
import static dnkr.libhex.HexKonstanten.VERSATZY;
import static dnkr.libhex.HexKonstanten.VERSATZYhalb;

public class HexCenteredImage extends CenteredImage {
public HexCenteredImage(TextureRegion region, Hex hex) {
  super(region);
//  setPosition(-getWidth() / 2, -getHeight() / 2);
  if (hex.isOdd()) {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
  } else {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY);
  }
}

public void setPositionWithHex(Hex hex) {
  setPosition(-getWidth() / 2, -getHeight() / 2);
  if (hex.isOdd()) {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
  } else {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY);
  }
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
