package dnkr.dpap.ui.assets;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import dnkr.appbase.buttons.FabFabrik;
import dnkr.dpap.R;
public class DpapFabFabrik extends FabFabrik {
public DpapFabFabrik(Context context) {
  super(context);
}

public FloatingActionButton getPauseFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_pause_white_48dp);
  return fab;
}

public FloatingActionButton getReplayFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_replay_white_48dp);
  return fab;
}

public FloatingActionButton getPlayFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_play_arrow_white_48dp);
  return fab;
}

public FloatingActionButton getDoneFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_done_white_48dp);
  return fab;
}

public FloatingActionButton getDoneAllFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_done_all_white_48dp);
  return fab;
}

public FloatingActionButton getCancelFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_clear_white_48dp);
  return fab;
}

public FloatingActionButton getRemoveFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_delete_white_48dp);
  return fab;
}

public FloatingActionButton getShootFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_shoot);
  return fab;
}

public FloatingActionButton getMoveFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_moveplane);
  return fab;
}

public FloatingActionButton getNextFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_skip_next_white_48dp);
  return fab;
}

public FloatingActionButton getDiceFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_casino_white_48dp);
  return fab;
}
public FloatingActionButton getMenuFab(View.OnClickListener onClickListener) {
  final FloatingActionButton fab = createDefaultFAB(onClickListener);
  fab.setImageResource(R.drawable.ic_menu_white_48dp);
  return fab;
}
}
