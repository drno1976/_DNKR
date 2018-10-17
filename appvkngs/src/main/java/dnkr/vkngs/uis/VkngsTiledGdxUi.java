package dnkr.vkngs.uis;
import android.content.Context;
import android.widget.RelativeLayout;
import com.badlogic.gdx.Screen;
import dnkr.appbase.gdx.base.GdxUi;
import dnkr.vkngs.uis.screens.btt.BttScreen;

public class VkngsTiledGdxUi extends GdxUi {
public VkngsTiledGdxUi(Context context, RelativeLayout layoutGameUi) {
  super(context, layoutGameUi);
}

@Override
public Screen chooseScreenAtCreate() {
  return new BttScreen(this);
}
}
