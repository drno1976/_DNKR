package dnkr.dpap.data.uistates;
import dnkr.dpap.data.Games;
import dnkr.dpap.model.Plane;
import dnkr.dpap.model.PlaneNotFound;
public class PlaneSelection {
private Plane selected;

public void setSelected(Plane selected) {
  this.selected = selected;
  System.out.println("selected = " + selected);
}

public Plane getSelected() {
  return selected;
}

public boolean isNone() {
  return selected == null;
}

public void clearSelection() {
  selected = null;
}

//public void scrollToFor(Hexsicht hexsicht) {
//  if (isNone()) return;
//  FacedHex hex = selected.getStandort().getHex();
//  hexsicht.getScrolling().scrollToHex(hex);
//}

public Plane setSelectedById(String planeId) throws PlaneNotFound {
  final Plane byId = Games.getGameData().getPlaneListen().getPlanesOnMap().getById(planeId);
  setSelected(byId);
  return byId;
}

}
