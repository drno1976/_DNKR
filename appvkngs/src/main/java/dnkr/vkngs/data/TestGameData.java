package dnkr.vkngs.data;
import dnkr.vkngs.model.HeldFigur;
import dnkr.vkngs.model.FigurSlot;

class TestGameData extends GameData {
public TestGameData() {
  createParty();
}

private void createParty() {
  createBlack();
}

private void createBlack() {
  final FigurSlot slot = new FigurSlot("1000", new HeldFigur());
  slot.getCellPos().set(5,13);
  getRaidState().getFigurSlots().add(slot);
}

}
