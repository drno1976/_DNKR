package dnkr.appbase.gdx.base;
import com.badlogic.gdx.math.Vector2;
import dnkr.libhex.hex.Hex;
import dnkr.libhex.hex.HexFromStageXY;

public class HexScreenModus extends StageScreenModus {
public HexScreenModus(ModusStageScreen stageScreen) {
  super(stageScreen);
}

public Hex getHexFor(Vector2 stagepos) {
  return new HexFromStageXY(stagepos.x,stagepos.y);
}
}
