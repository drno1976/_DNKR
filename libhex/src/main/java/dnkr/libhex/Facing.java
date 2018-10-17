package dnkr.libhex;
import java.awt.Point;

public class Facing {
private final int facing;
public static final float[] degreesForFacing = {0, -60, -120, 180, 120, 60};

public Facing(int facing) {
  this.facing = facing;
  final Point p = new Point();
  
}

public double getAngleAsRadians() {
  return Math.toRadians(degreesForFacing[facing]);
}

public double getAngleAsDegree() {
  return degreesForFacing[facing];
}
}
