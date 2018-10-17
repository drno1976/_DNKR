package dnkr.vkngs.uis.actors;
import android.support.annotation.NonNull;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import java.util.ArrayList;
import dnkr.appbase.gdx.actors.FigurAnimations;
import dnkr.appbase.gdx.actors.LpcAnimatedActor;
import dnkr.appbase.gdx.actors.LpcFigurAnimations;
import dnkr.appbase.gdx.actors.TiledActorLayer;
import dnkr.appbase.gdx.actors.TiledActorManager;
import dnkr.vkngs.model.FigurSlot;

public class FigurActor extends TiledActorLayer {
private static final String PEOPLE_RAGNAR_PNG = "people/ragnar.png";
private boolean busy;
public final LpcFigurAnimations figurAnimations; //in 4 richtungen
private final LpcAnimatedActor body;

public FigurActor(@NonNull TiledActorManager actorManager, FigurSlot figurSlot) {
  super(actorManager);
  setUserObject(figurSlot);
  setName(figurSlot.getSlotid());
//  String textureId = figurSlot.getFigur().getTextureId();
  figurAnimations = new LpcFigurAnimations(getTextureManager().loadSheetDirekt(PEOPLE_RAGNAR_PNG));
  body = new LpcAnimatedActor(figurAnimations);
  body.setAnimationTo(FigurAnimations.ATTACK);
  addActor(body);
}

private Action getActionsForHead() {
  final SequenceAction kopfdrehen = Actions.sequence(Actions.rotateBy(-45, 1f),
          Actions.rotateBy(+90, 1f),
          Actions.rotateBy(-45, 1f));
  final RepeatAction forever = Actions.forever(kopfdrehen);
  return forever;
}

public boolean isBusy() {
  return busy;
}

public void addMoveToActionsFor(ArrayList<Vector2> path) {
  this.busy = true;
  SequenceAction sequence = new SequenceAction();
  for (int i = 1; i < path.size(); i++) {
    Vector2 newpos = path.get(i);
    sequence.addAction(Actions.moveTo(newpos.x, newpos.y, 0.2f));
  }
  RunnableAction finished = new RunnableAction();
  finished.setRunnable(() -> this.busy = false);
  sequence.addAction(finished);
  addAction(sequence);
}
}
