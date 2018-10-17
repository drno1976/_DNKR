package dnkr.appbase.gdx.base;
public class ZoomGrenzen {
private float min, max;

public ZoomGrenzen(float min, float max) {
  this.min = min;
  this.max = max;
}

float getMin() {
  return min;
}

public void setMin(float min) {
  this.min = min;
}

public float getMax() {
  return max;
}

public void setMax(float max) {
  this.max = max;
}
}
