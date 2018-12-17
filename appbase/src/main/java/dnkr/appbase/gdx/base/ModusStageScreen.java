package dnkr.appbase.gdx.base;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.input.GestureDetector;

public class ModusStageScreen extends GdxUiScreen {
private final StageScreenInput screenInput;
private final ModusStage modusStage;

public ModusStageScreen(GdxUi gdxUi) {
  super(gdxUi);
  modusStage = new ModusStage();
  screenInput = new StageScreenInput(modusStage);
}

public StageScreenInput getScreenInput() {
  return screenInput;
}

public ModusStage getStage() {
  return modusStage;
}

public void show() {
  Gdx.input.setInputProcessor(new GestureDetector(screenInput));
  //GLdaten.printeGLDaten();
}

public void render(float delta) {
//  Gdx.gl.glClearColor(0, 0, 128, 1); BLUE
//  Gdx.gl.glClearColor(43, 43, 43, 1);
  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
  modusStage.act();
  modusStage.draw();
}

@Override
public void dispose() {
  modusStage.dispose();
  super.dispose();
}

public void setModusTo(Modus modus) {
  modusStage.setModus(modus);
  modus.begin();
  System.out.println("modus = " + modus.getClass().getSimpleName());
}
}
