package dnkr.appbase.gdx.tiled;
import android.support.annotation.NonNull;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import dnkr.appbase.gdx.base.GdxUi;
import dnkr.appbase.gdx.base.ModusStageScreen;

public abstract class TiledStageScreen extends ModusStageScreen {
private final TiledMapHelper mapHelper;
protected OrthogonalTiledMapRenderer tiledMapRenderer;
private OrthographicCamera camera;

public TiledStageScreen(GdxUi gdxUi) {
  super(gdxUi);
  mapHelper = new TiledMapHelper(ladeTmxMap());
}

protected abstract TiledMap ladeTmxMap();

public TiledMapHelper getMapHelper() {
  return mapHelper;
}

@Override
public void show() {
  super.show();
  getStage().setModus(chooseModusAtShow());
  camera = (OrthographicCamera) getStage().getCamera();
  tiledMapRenderer = new OrthogonalTiledMapRenderer(mapHelper.getTiledMap(), getStage().getBatch());
  tiledMapRenderer.setView(camera);
  getScreenInput().setPanningChecker(new TiledMapPanningChecker(camera, mapHelper.getTiledMap()));
  getScreenInput().getZoomGrenzen().setMax(new TiledMapZoomGrenzen(mapHelper.getTiledMap()).getMaxFor(camera));
}

@NonNull
protected TiledStageScreenModus chooseModusAtShow() {
  return new TiledStageScreenModus(this);
}

@Override
public void render(float delta) {
  Gdx.gl.glClearColor(0, 0, 0, 1);
//  Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
  //camera.update();
  tiledMapRenderer.setView(camera);
  tiledMapRenderer.render();
  getStage().act();
  getStage().draw();
  
/*  Rectangle scissors = new Rectangle();
Rectangle clipBounds = new Rectangle(x,y,w,h);
ScissorStack.calculateScissors(camera, spriteBatch.getTransformMatrix(), clipBounds, scissors);
ScissorStack.pushScissors(scissors);
spriteBatch.draw(...);
spriteBatch.flush();
ScissorStack.popScissors();*/
}

@Override
public void dispose() {
  if (tiledMapRenderer != null) tiledMapRenderer.dispose();
  super.dispose();
}

@Override
public void resize(int width, int height) {
  // TODO Auto-generated method stub
}

@Override
public void pause() {
  // TODO Auto-generated method stub
}

@Override
public void resume() {
  // TODO Auto-generated method stub
}
//@Override
//public void hide() {
//  dispose();
//}
}
