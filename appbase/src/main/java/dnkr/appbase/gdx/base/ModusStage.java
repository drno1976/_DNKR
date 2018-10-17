package dnkr.appbase.gdx.base;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class ModusStage extends com.badlogic.gdx.scenes.scene2d.Stage {
private Modus modus;

public ModusStage() {
  modus = new Modus();
  //addActor(new FpsLabel());
}

public void setModus(Modus modus) {
  this.modus = modus;
}

StageInputListener getInputListener() {
  return modus;
}

public void zoomTo(float zoomNew) {
  ((OrthographicCamera) getCamera()).zoom=zoomNew;
}

public void setCameraPosition(int x, int y) {
  getCamera().position.x=x;
  getCamera().position.y=y;
}
}
