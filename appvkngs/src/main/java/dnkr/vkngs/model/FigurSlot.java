package dnkr.vkngs.model;
import dnkr.appbase.gdx.tiled.CellPos;

public class FigurSlot { //enthält alle current werte der figur bezüglich Welt
private final String slotid;
final private CellPos cellPoint = new CellPos();
private Figur figur;

public FigurSlot(String slotid, Figur figur) {
  this.slotid = slotid;
  this.figur = figur;
}

public Figur getFigur() {
  return figur;
}

public void setFigur(Figur figur) {
  this.figur = figur;
}

public String getSlotid() {
  return slotid;
}

public CellPos getCellPos() {
  return cellPoint;
}
}
