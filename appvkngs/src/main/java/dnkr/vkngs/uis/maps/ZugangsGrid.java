package dnkr.vkngs.uis.maps;
import android.support.annotation.NonNull;
import android.util.Size;
import dnkr.appbase.gdx.tiled.CellPos;

public abstract class ZugangsGrid {
protected final Size size;
protected final byte[] grid;

public ZugangsGrid(@NonNull Size size) {
  this.size = size;
  grid = new byte[size.getWidth()*size.getHeight()];
}

public abstract boolean isAccess(CellPos current, CellPos next);
}
