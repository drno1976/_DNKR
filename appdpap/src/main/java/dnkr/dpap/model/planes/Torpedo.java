package dnkr.dpap.model.planes;
import dnkr.dpap.model.bewegungen.Bewegungsplan;
import dnkr.dpap.model.bewegungen.TorpedoBewegungsplan;
import dnkr.libbase.IdObject;
import dnkr.libhex.HasHexOrt;
import dnkr.libhex.HexOrt;

public class Torpedo extends IdObject implements HasHexOrt {
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
