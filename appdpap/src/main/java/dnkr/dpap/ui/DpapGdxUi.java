package dnkr.dpap.ui;
import android.content.Context;
import android.widget.RelativeLayout;
import com.badlogic.gdx.Screen;
import dnkr.appbase.gdx.base.GdxUi;
import dnkr.dpap.ui.screens.sky.SkyScreen;

public class DpapGdxUi extends GdxUi {


public DpapGdxUi(Context context, RelativeLayout layoutGameUi) {
  super(context, layoutGameUi);
  
}

@Override
public Screen chooseScreenAtCreate() {
  return new SkyScreen(this);
}


}
