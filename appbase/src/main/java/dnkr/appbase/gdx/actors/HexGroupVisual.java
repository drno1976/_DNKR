package dnkr.appbase.gdx.actors;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.ids.IdObject;

public abstract class HexGroupVisual extends IdGroupVisual {
public HexGroupVisual(ActorManager actorManager, IdObject idObject) {
  super(actorManager, idObject);
}

public void setPositionWithHex(Hex hex) {
  setPosition(hex.getPixelX(), hex.getPixelY());
}

public void setRotationWithHex(FacedHex hex) {
  setRotationForFacing(hex.facing);
}

public void setRotationForFacing(byte facing) {
  switch (facing) {
    case 0:
      setRotation(0);
      break;
    case 1:
      setRotation(-60);
      break;
    case 2:
      setRotation(-120);
      break;
    case 3:
      setRotation(180);
      break;
    case 4:
      setRotation(+120);
      break;
    case 5:
      setRotation(60);
      break;
  }
}
}
