package dnkr.vkngs.uis.actors;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import dnkr.appbase.gdx.actors.TiledActorLayer;
import dnkr.vkngs.model.FigurSlot;
import dnkr.vkngs.uis.screens.btt.BttActorManager;

public class FigurLayer extends TiledActorLayer {
private final BttActorManager bttActorManager;

public FigurLayer(BttActorManager bttActorManager) {
  super(bttActorManager);
  this.bttActorManager = bttActorManager;
  create();
}

private void create() {
//  getTextureManager().loadAtlas(VkngsAssets.GOONS_ATLAS);
  for (FigurSlot figurSlot : bttActorManager.getGameData().getRaidState().getFigurSlots()) {
    this.addActor(getFigurActorForSlot(figurSlot));
  }
}

private Actor getFigurActorForSlot(FigurSlot figurSlot) {
  Actor figur = new FigurActor(bttActorManager, figurSlot);
  Vector2 newpos = getMapHelper().getStageCoordinatesFor(figurSlot.getCellPos());
  figur.setPosition(newpos.x, newpos.y);
  return figur;
}
}
