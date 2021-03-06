package dnkr.libhex.hex;
import static dnkr.libhex.hex.HexKonstanten.VERSATZX;
import static dnkr.libhex.hex.HexKonstanten.VERSATZY;
import static dnkr.libhex.hex.HexKonstanten.VERSATZYhalb;

public class Hex {
public int x, y;

public Hex() {
  this(0, 0);
}

public Hex(int x, int y) {
  this.x = x;
  this.y = y;
}

public Hex(Hex hex) {
  this(hex.x,hex.y);
}

public boolean isNotAt(Hex atHex) {
  return !isAt(atHex);
}

public boolean isAt(Hex at) {
  return ((x == at.x) && (y == at.y));
}

public boolean isEven() {
  return ((x & 1) == 0);
}

public boolean isOdd() {
  return ((x & 1) != 0);
}

@Override
public String toString() {
  return "{" + x + ":" + y + "}";
}

public int distanceTo(Hex hex) {
  int cx1 = x;
  int cz1 = y - (x - (x & 1)) / 2;
  int cy1 = -cx1 - cz1;
  int cx2 = hex.x;
  int cz2 = hex.y - (hex.x - (hex.x & 1)) / 2;
  int cy2 = -cx2 - cz2;
  final int deltax = Math.abs(cx1 - cx2);
  final int deltay = Math.abs(cy1 - cy2);
  final int deltaz = Math.abs(cz1 - cz2);
  return Math.max(Math.max(deltax, deltay), deltaz);
}

public int distanceTo(int hexx, int hexy) {
  int cx1 = x;
  int cz1 = y - (x - (x & 1)) / 2;
  int cy1 = -cx1 - cz1;
  int cx2 = hexx;
  int cz2 = hexy - (hexx - (hexx & 1)) / 2;
  int cy2 = -cx2 - cz2;
  final int deltax = Math.abs(cx1 - cx2);
  final int deltay = Math.abs(cy1 - cy2);
  final int deltaz = Math.abs(cz1 - cz2);
  return Math.max(Math.max(deltax, deltay), deltaz);
}

public int getWinkelDegreesZu(Hex zu) {
  double inRads = Math.atan2(zu.getPixelY() - getPixelY(), zu.getPixelX() - getPixelX());
  int degrees = (int) Math.round(Math.toDegrees(inRads));
  degrees -= 90;
  return degrees;
}

public String getSimplePosition() {
  return x + ":" + y;
}

public Hex cloned() {
  return new Hex(x, y);
}

public Hex getDeltaZu(Hex zuHex) {
  return new Hex(x - zuHex.x, y - zuHex.y);
}

public Hex translate(int dx, int dy) {
  x += dx;
  y += dy;
  return this;
}

public Hex setLike(Hex neu) {
  setTo(neu.x, neu.y);
  return this;
}

public Hex setTo(int x, int y) {
  this.x = x;
  this.y = y;
  return this;
}

public Hex translated(int dx, int dy) {
  return cloned().translate(dx,dy);
}

public int getPixelY() {
  return y * VERSATZY + (VERSATZYhalb * (x & 1));
}

public int getPixelX() {
  return x * VERSATZX;
}
}
