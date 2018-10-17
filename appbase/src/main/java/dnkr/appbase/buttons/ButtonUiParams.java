package dnkr.appbase.buttons;
import android.widget.RelativeLayout;

public class ButtonUiParams {
private static final ButtonUiParams ourInstance = new ButtonUiParams();
private int margin;

private ButtonUiParams() {
  margin = 16;
}

public static ButtonUiParams getFabrik() {
  return ourInstance;
}

public RelativeLayout.LayoutParams getLayoutParamsForRechtsOben() {
  RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
          RelativeLayout.LayoutParams.WRAP_CONTENT,
          RelativeLayout.LayoutParams.WRAP_CONTENT);
  params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
  params.addRule(RelativeLayout.ALIGN_PARENT_END);
  params.setMargins(margin, margin, margin, margin);
  return params;
}

public RelativeLayout.LayoutParams getLayoutParamsForRechtsUnten() {
  RelativeLayout.LayoutParams params =
          new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                  RelativeLayout.LayoutParams.WRAP_CONTENT);
  params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
  params.addRule(RelativeLayout.ALIGN_PARENT_END);
  params.setMargins(margin, margin, margin, margin);
  return params;
}
}
