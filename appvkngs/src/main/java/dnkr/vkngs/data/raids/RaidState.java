package dnkr.vkngs.data.raids;
public class RaidState {
final private FigurSlots figurSlots;

public RaidState() {
  this.figurSlots = new FigurSlots();
}

public FigurSlots getFigurSlots() {
  return figurSlots;
}
}
