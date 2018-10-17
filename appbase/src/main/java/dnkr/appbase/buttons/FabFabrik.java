package dnkr.appbase.buttons;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.LinearLayout;
public class FabFabrik {
protected final Context context;

protected FabFabrik(Context context) {
  this.context = context;
}

@NonNull
protected FloatingActionButton createDefaultFAB(View.OnClickListener onClickListener) {
  FloatingActionButton fab;
  fab = new FloatingActionButton(context);
  fab.setClickable(true);
  fab.setSize(FloatingActionButton.SIZE_MINI);
  setMarginFor(fab);
  fab.setOnClickListener(onClickListener);
  return fab;
}

private void setMarginFor(FloatingActionButton fab) {
  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
          LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
  params.setMargins(0, 30, 0, 0);
  fab.setLayoutParams(params);
}

public Context getContext() {
  return context;
}
}
