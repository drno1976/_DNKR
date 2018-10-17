package dnkr.appbase.gdx.tiled;
public class CellPos {
public int x, y;

public CellPos() {
  this(0, 0);
}

public CellPos(int x, int y) {
  this.x = x;
  this.y = y;
}

public CellPos(CellPos src) {
  this(src.x, src.y);
}

public void set(int x, int y) {
  this.x = x;
  this.y = y;
}

public final CellPos translate(int dx, int dy) {
  x += dx;
  y += dy;
  return this;
}

public final boolean equals(int x, int y) {
  return this.x == x && this.y == y;
}

@Override
public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  CellPos point = (CellPos) o;
  if (x != point.x) return false;
  if (y != point.y) return false;
  return true;
}

@Override
public String toString() {
  return "CellPos{" +
          "x=" + x +
          ", y=" + y +
          '}';
}

public int getX() {
  return x;
}

public int getY() {
  return y;
}

public CellPos cloned() {
  return new CellPos(this);
}

public void set(CellPos src) {
  set(src.x,src.y);
}

public void translate(CellPos d) {
  translate(d.x,d.y);
}

public void sub(CellPos s) {
  translate(-s.x,-s.y);
}

public CellPos getDelta(CellPos sub) {
  return new CellPos(x-sub.x,y-sub.y);
}

public byte getRichtungAsByte() {
  if (x ==0){
    if (y==1) return 0;
    if (y==-1) return 4;
  }
  if (x ==1){
    if (y==1) return 1;
    if (y==0) return 2;
    if (y==-1) return 3;
  }
  if (x ==-1){
    if (y==-1) return 5;
    if (y==0) return 6;
    if (y==1) return 7;
  }

  return -1;
}

public boolean isAt(CellPos from) {
  return equals(from.x,from.y);
}

public boolean isNotAt(CellPos from) {
  return !isAt(from);
}
}
