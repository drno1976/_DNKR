package dnkr.libhex.hex;
import static java.lang.Math.round;

public class HexFromStageXY extends Hex {
public HexFromStageXY(float stageX, float stageY) {
  final int spalte = round(stageX / HexKonstanten.VERSATZX);
  setTo(spalte, 0);
  if (isOdd()) {
    final int zeile = round((stageY - HexKonstanten.VERSATZYhalb) / HexKonstanten.VERSATZY);
    setTo(spalte, zeile);
  } else {
    final int zeile = round(stageY / HexKonstanten.VERSATZY);
    setTo(spalte, zeile);
  }
}
}
