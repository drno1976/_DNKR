package dnkr.dpap.ui.base;
import com.badlogic.gdx.math.Vector2;
import dnkr.appbase.gdx.base.ModusStageScreen;
import dnkr.appbase.gdx.base.StageScreenModus;
import dnkr.libhex.Hex;
import dnkr.libhex.HexFromStageXY;

public class HexScreenModus extends StageScreenModus {
public HexScreenModus(ModusStageScreen stageScreen) {
  super(stageScreen);
}

public Hex getHexFor(Vector2 stagepos) {
  return new HexFromStageXY(stagepos.x,stagepos.y);
}
}
