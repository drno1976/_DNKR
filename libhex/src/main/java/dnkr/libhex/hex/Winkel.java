package dnkr.libhex.hex;
public class Winkel {
public static int getWinkelDegreesFor(Hex von, Hex zu) {
  final int feldkantey = 64;
  final int versatzy = 32;
  final int versatzx = 56;
  final int ax = von.x * versatzx;
  final int ay = von.y * feldkantey + (von.x & 1) * versatzy;
  final int by = zu.y * feldkantey + (zu.x & 1) * versatzy;
  final int bx = zu.x * versatzx;
  double inRads = Math.atan2(by - ay, bx - ax);
  int degrees = (int) Math.round(Math.toDegrees(inRads));
//  degrees += 90; //y nach unten
  degrees += 30; //y nach unten
  if (degrees < 0) degrees += 360;
  return degrees;
}

/*
import static dnkr.libhex.hex.HexKonstanten.VERSATZX;
import static dnkr.libhex.hex.HexKonstanten.VERSATZY;
import static dnkr.libhex.hex.HexKonstanten.VERSATZYhalb;
 */
//public static int getWinkelDegreesFor(FacedHex von, FacedHex zu) {
//  final int feldkantey = 64;
//  final int versatzy = 32;
//  //int radiusDiff = (int) (64 / WURZEL3) - 32;
//  final int versatzx = 56;//64 - (radiusDiff << 1);
////  System.out.println("z = " + zu);
//  final int ax = von.x * versatzx;
//  final int ay = von.y * feldkantey + (von.x & 1) * versatzy;
//  final int by = zu.y * feldkantey + (zu.x & 1) * versatzy;
//  final int bx = zu.x * versatzx;
//  //a.x = a.x * versatzx;
//  //a.y = a.y * feldkantey;
//  //if (von.isOdd()) a.offset(0, versatzy);
//  //b.x = b.x * versatzx;
//  //b.y = b.y * feldkantey;
//  //if (z.isOdd()) b.offset(0, versatzy);
////  Point d = new Point(b.x - a.x, (b.y - a.y));
//  double inRads = Math.atan2(by - ay, bx - ax);
//  int degrees = (int) Math.round(Math.toDegrees(inRads));
////  degrees += 90; //y nach unten
//  degrees += 45; //y nach unten
//  if (degrees < 0) degrees += 360;
////  Log.d("WINKEL","vx: "+versatzx);
////  Log.d("WINKEL","a: "+a.toString());
////  Log.d("WINKEL","b: "+b.toString());
////  Log.d("WINKEL","d: "+d.toString());
////  Log.d("WINKEL","r: "+inRads);
////  Log.d("WINKEL","g: "+degrees);
//  return degrees;
//}
}
