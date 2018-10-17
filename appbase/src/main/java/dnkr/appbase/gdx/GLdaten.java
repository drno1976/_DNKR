package dnkr.appbase.gdx;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.util.Log;

public class GLdaten {
public static void printeGLDaten() {
  //  Gdx.gl.glClearColor(0, 0, 0, 1);
  //  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
  int[] maxTextureSize = new int[1];
  //Gdx.gl.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0);
  GLES10.glGetIntegerv(GLES10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0);
  Log.i("glinfo", "Max texture size (GL10)= " + maxTextureSize[0]);
  int[] max = new int[1];
  GLES20.glGetIntegerv(GLES20.GL_MAX_TEXTURE_SIZE, max, 0);
  Log.i("glinfo", "Max texture size (GL20) = " + max[0]);
}
}
