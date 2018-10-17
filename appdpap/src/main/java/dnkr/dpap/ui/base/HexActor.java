package dnkr.dpap.ui.base;
import dnkr.appbase.base.IdObject;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.IdObjectActor;
import dnkr.libhex.FacedHex;
import dnkr.libhex.Hex;
import static dnkr.libhex.HexKonstanten.VERSATZX;
import static dnkr.libhex.HexKonstanten.VERSATZY;
import static dnkr.libhex.HexKonstanten.VERSATZYhalb;

public class HexActor extends IdObjectActor {
public HexActor(ActorManager actorManager, IdObject idObject) {
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
    case 1:
      setRotation(-60);
    case 2:
      setRotation(-120);
    case 3:
      setRotation(180);
    case 4:
      setRotation(+120);
    case 5:
      setRotation(60);
  }
}
}
