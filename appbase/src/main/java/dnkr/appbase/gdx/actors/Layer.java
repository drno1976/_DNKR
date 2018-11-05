package dnkr.appbase.gdx.actors;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public abstract class Layer extends ManagedGroup implements VisualForModel {
public Layer(ActorManager actorManager) {
  super(actorManager);
}

public void removeChildrenFromStage() {
  for (Actor child : getChildren()) {
    child.addAction(Actions.removeActor());
  }
}
}
