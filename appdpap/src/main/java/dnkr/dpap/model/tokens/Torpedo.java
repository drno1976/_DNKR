package dnkr.dpap.model.tokens;
import dnkr.appbase.base.Hextoken;
import dnkr.dpap.model.bewegungen.TorpedoBewegungsplan;
import dnkr.libhex.HexOrt;
import dnkr.libhex.routen.Bewegungsplan;

public class Torpedo extends Hextoken {
private final HexOrt hexOrt;
private final Bewegungsplan bewegungsplan;

public Torpedo(String id) {
  super(id);
  hexOrt = new HexOrt();
  bewegungsplan = new TorpedoBewegungsplan(this);
}

@Override
public HexOrt getHexOrt() {
  return hexOrt;
}

public Bewegungsplan getBewegungsplan() {
  return bewegungsplan;
}
}
