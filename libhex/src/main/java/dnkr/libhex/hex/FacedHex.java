package dnkr.libhex.hex;
public class FacedHex extends Hex {
//http://www.redblobgames.com/grids/hexagons/
public static final byte N = 0, NE = 1, SE = 2, S = 3, SW = 4, NW = 5;
public static final String[] facingSymbol = {"N ", "NE", "SE", "S ", "SW", "NW"};
public byte facing;

public FacedHex(int x, int y) {
  this(x, y, (byte) 0);
}

public FacedHex(FacedHex hex) {
  this(hex.x, hex.y, hex.facing);
}

public FacedHex() {
  this(0, 0, (byte) 0);
}

FacedHex(int x, int y, byte facing) {
  super(x, y);
  this.facing = facing;
}

public FacedHex setFacing(byte facing) {
  this.facing = facing;
  return this;
}

public FacedHex setLike(FacedHex ziel) {
  if (ziel != null)
    setTo(ziel.x, ziel.y, ziel.facing);
  return this;
}

public FacedHex setTo(int x, int y, byte facing) {
  this.facing = facing;
  return setTo(x, y);
}

public FacedHex setTo(int x, int y) {
  super.setTo(x, y);
  return this;
}

public FacedHex setTo(FacedHex zu) {
  return setTo(zu.x,zu.y,zu.facing);
}


@Override
public String toString() {
  return "{" + x + ":" + y + ":" + facingSymbol[facing]+"}";
}

public FacedHex cloned() {
  return new FacedHex(x, y, facing);
}

public FacedHex translate(int dx, int dy) {
  super.translate(dx, dy);
  return this;
}

public boolean isNotIdentisch(FacedHex at) {
  return !isIdentisch(at);
}

public boolean isIdentisch(FacedHex at) {
  return ((x == at.x) && (y == at.y) && (facing == at.facing));
}

public int getWinkeldifferenzeFacedZu(Hex ziel) {
  return Math.abs(getWinkelDegreesFacedZu(ziel));
}

public int getWinkelDegreesFacedZu(Hex ziel) {
  int winkel = Winkel.getWinkelDegreesFor(this, ziel);
  winkel -= facing * 60;
  if (winkel > 180) winkel -= 360; //kann nicht größer 180 sein
  if (winkel < -179) winkel += 360; //kann nicht kleiner -180 sein
  return winkel; //-179 bis +180
}

public int getFacingDifferenzTo(FacedHex ziel) {
  if (facing == ziel.facing) return 0;
  int diff = facing - ziel.facing;
  if (diff < -3) diff = diff + 6;
  if (diff > 3) diff = diff - 6;
  return Math.abs(diff);
}

public float getFacingDegrees() {
  return Facing.degreesForFacing[facing];
}

public FacedHex getNextHex() {
  FacedHex next = this.cloned();
  if (facing == N) {
    return next.translate(0, 1);
  }
  if (facing == NE) {
    if (isEven()) {
      return next.translate(1, 0);
    } else {
      return next.translate(1, 1);
    }
  }
  if (facing == SE) {
    if (isEven()) {
      return next.translate(1, -1);
    } else {
      return next.translate(1, 0);
    }
  }
  if (facing == S) {
    return next.translate(0, -1);
  }
  if (facing == SW) {
    if (isEven()) {
      return next.translate(-1, -1);
    } else {
      return next.translate(-1, 0);
    }
  }
  if (facing == NW) {
    if (isEven()) {
      return next.translate(-1, 0);
    } else {
      return next.translate(-1, 1);
    }
  }
  return next;
}

public FacedHex turnedLeft() {
  return cloned().turnLeft();
}

public FacedHex turnLeft() {
  facing--;
  if (facing < 0)
    facing = 5;
  return this;
}

public FacedHex translated(int dx, int dy) {
  return new FacedHex(x + dx, y + dy, facing);
}

public FacedHex turnedRight() {
  return cloned().turnRight();
}

public FacedHex turnRight() {
  facing++;
  if (facing > 5)
    facing = 0;
  return this;
}

public FacedHex turnedReverse() {
  return cloned().turnReverse();
}

public FacedHex turnReverse() {
  facing = (byte) (facing - 3);
  if (facing < 0) facing += 6;
  return this;
}

public Facing getFacing() {
  return new Facing(facing);
}


}
