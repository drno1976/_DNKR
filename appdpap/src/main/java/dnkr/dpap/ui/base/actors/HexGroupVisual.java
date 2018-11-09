package dnkr.dpap.ui.base.actors;
import dnkr.appbase.base.IdObject;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.IdGroupVisual;
import dnkr.libhex.hex.FacedHex;
import dnkr.libhex.hex.Hex;
import static dnkr.libhex.hex.HexKonstanten.VERSATZX;
import static dnkr.libhex.hex.HexKonstanten.VERSATZY;
import static dnkr.libhex.hex.HexKonstanten.VERSATZYhalb;

public abstract class HexGroupVisual extends IdGroupVisual {
public HexGroupVisual(ActorManager actorManager, IdObject idObject) {
  super(actorManager, idObject);
}

public void setPositionWithHex(Hex hex) {
  if (hex.isOdd()) {
    setPosition(hex.x * VERSATZX, hex.y * VERSATZY + VERSATZYhalb);
  } else {
    setPosition(hex.x * VERSATZX, hex.y * VERSATZY);
  }
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
