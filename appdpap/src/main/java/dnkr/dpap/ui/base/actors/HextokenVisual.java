package dnkr.dpap.ui.base.actors;
import dnkr.appbase.base.Hextoken;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.HexGroupVisual;

abstract class HextokenVisual extends HexGroupVisual {
public HextokenVisual(ActorManager actorManager, Hextoken hextoken) {
  super(actorManager, hextoken);
}

public void placeByHexOrt() {
  setPositionWithHex(getHextoken().getHexOrt().getHex());
  setRotationWithHex(getHextoken().getHexOrt().getHex());
}

public Hextoken getHextoken() {
  return (Hextoken) getUserObject();
}
}
