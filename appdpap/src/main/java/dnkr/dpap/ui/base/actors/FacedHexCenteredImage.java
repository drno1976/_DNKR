package dnkr.dpap.ui.base.actors;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import dnkr.libhex.hex.FacedHex;

public class FacedHexCenteredImage extends HexCenteredImage {
public FacedHexCenteredImage(TextureRegion region, FacedHex hex) {
  super(region,hex);
  setRotationForFacing(hex.facing);
//  if (hex.isOdd()) {
//    moveBy(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
//  } else {
//    moveBy(hex.x * VERSATZX, hex.y * VERSATZY);
//  }
}
//public void setPositionWithHex(FacedHex hex) {
//  setPosition(-getWidth() / 2, -getHeight() / 2);
//  setRotationForFacing(hex.facing);
//  if (hex.isOdd()) {
//    moveBy(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
//  } else {
//    moveBy(hex.x * VERSATZX, hex.y * VERSATZY);
//  }
//}
}
