package dnkr.dpap.ui.screens.sky.layers;
import dnkr.appbase.gdx.actors.ActorManager;
import dnkr.appbase.gdx.actors.Layer;

public abstract class HideableLayer extends Layer {
private boolean hiding = false;

public HideableLayer(ActorManager actorManager) {
  super(actorManager);
}

public void doModelChanged() {
  this.removeChildrenFromStage();
  if (isHiding()) return;
  createVisuals();
}

public boolean isHiding() {
  return hiding;
}

public abstract void createVisuals();

public void show() {
  this.hiding = false;
}

public void hide() {
  this.hiding = true;
}
}
