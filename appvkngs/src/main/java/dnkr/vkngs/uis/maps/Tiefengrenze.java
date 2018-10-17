package dnkr.vkngs.uis.maps;
class Tiefengrenze {
private int counter;
private int maxDepth;

public Tiefengrenze() {
  counter = 0;
  maxDepth = -1;
}

public void setMaxDepth(int maxDepth) {
  this.maxDepth = maxDepth;
}

public void reset() {
  counter = 0;
}

public void inc() {
  counter++;
}

public boolean isInMaxDepth() {
  if (maxDepth == -1) return true;
  return counter < maxDepth;
}
}
