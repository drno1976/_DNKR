package dnkr.dpap.ui.screens.sky;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;
import static dnkr.libhex.hex.HexKonstanten.VERSATZX;
import static dnkr.libhex.hex.HexKonstanten.VERSATZY;
import static dnkr.libhex.hex.HexKonstanten.VERSATZYhalb;

class VektorImage extends Image {
public VektorImage(TextureRegion region, FacedHex von, FacedHex zu) {
  super(region);
  setOrigin(Align.bottom);
  setPosition(-getWidth() / 2, 0);
  if (von.isOdd()) {
    moveBy(von.x * VERSATZX, von.y * VERSATZY + VERSATZYhalb);
  } else {
    moveBy(von.x * VERSATZX, von.y * VERSATZY);
  }
  final int degreesFor = getWinkelDegreesFor2(von, zu);
  setRotation(degreesFor);
  System.out.println("degreesFor = " + degreesFor);
}

private int getWinkelDegreesFor2(FacedHex von, FacedHex zu) {
//  if (von.isOdd()) {
  int ax = von.x * VERSATZX;
  int ay = von.y * VERSATZY + (VERSATZYhalb * (von.x & 1));
  int bx = zu.x * VERSATZX;
  int by = zu.y * VERSATZY + (VERSATZYhalb * (zu.x & 1));
  System.out.println("ax = " + ax);
  System.out.println("ay = " + ay);
  System.out.println("bx = " + bx);
  System.out.println("by = " + by);
  double inRads = Math.atan2(by - ay, bx - ax);
  int degrees = (int) Math.round(Math.toDegrees(inRads));
  degrees -= 90;
  return degrees; //TODO Shrapnel Skies
  /*
    if (hex.isOdd()) {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
  } else {
    moveBy(hex.x * VERSATZX, hex.y * VERSATZY);
  }
   */
}

public int getWinkelDegreesFor(Hex von, Hex zu) {
  final int feldkantey = 64;
  final int ax = von.x * VERSATZX;
  final int ay = von.y * feldkantey + (von.x & 1) * VERSATZY;
  final int by = zu.y * feldkantey + (zu.x & 1) * VERSATZY;
  final int bx = zu.x * VERSATZX;
  double inRads = Math.atan2(by - ay, bx - ax);
  int degrees = (int) Math.round(Math.toDegrees(inRads));
  degrees -= 90;
////  degrees += 90; //y nach unten
//  degrees += 30; //y nach unten
//  if (degrees < 0) degrees += 360;
  return degrees;
}
}
