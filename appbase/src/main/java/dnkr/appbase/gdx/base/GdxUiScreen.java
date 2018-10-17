package dnkr.appbase.gdx.base;
import com.badlogic.gdx.Screen;

public abstract class GdxUiScreen implements Screen {
private final GdxUi gdxUi;

public GdxUiScreen(GdxUi gdxUi) {
  this.gdxUi = gdxUi;
}

public GdxUi getGdxUi() {
  return gdxUi;
}


public void resize(int width, int height) {
}


public void pause() {
}


public void resume() {
}


public void hide() {
}


public void dispose() {
}
}
