package dnkr.vkngs.uis.screens.btt;
import com.badlogic.gdx.math.Vector2;
import dnkr.vkngs.uis.maps.TiledMapPathFinding;

class BlaupauseModusDebug extends BlaupauseModus {
private int tiefe;
private TiledMapPathFinding pathFinding;

public BlaupauseModusDebug(BttScreen blaupause) {
  super(blaupause);
//  if (getUiState().getSlotSelection().isNone()) {
//    final FigurSlot slot = getBlaupause().getGameData().getHeistPlanung().getFigurSlots().get(0);
//    getUiState().getSlotSelection().setSelected(slot);
//  }
  pathFinding = blaupause.getPathFinding();
  tiefe = 0;
}

@Override
public void tappedAt(Vector2 stageCoordinates) {
//  final CellPos tappedCellPoint = getMapHelper().getCellCoordinatesFor(stageCoordinates);
//  if (isClickedOutOfMap(tappedCellPoint)) return;
//  if (isClickedSelectedGoon(tappedCellPoint)) return;
//  if (isClickedGoonGoto(tappedCellPoint)) return;
}

//private boolean isClickedOutOfMap(CellPos tappedCellPoint) {
//  if (getMapHelper().isOnMap(tappedCellPoint))
//    return false;
//  Log.v(getClass().getSimpleName(), "Tapped out of map: " + tappedCellPoint);
//  final CellPos from = getUiState().getSlotSelection().getSelected().getCellPos();
//  pathFinding.setMaxDepth(tiefe);
//  pathFinding.gridData.doFloodfill(from);
//  getBlaupause().getBttActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
//  tiefe++;
//  return true;
//}

//private boolean isClickedSelectedGoon(@NonNull CellPos tappedCellPoint) {
//  if (tappedCellPoint.equals(getUiState().getSlotSelection().getSelected().getCellPos())) {
//    Log.v(getClass().getSimpleName(), "Tapped selectedgoon at: " + tappedCellPoint);
//    return true;
//  }
//  return false;
//}

//private boolean isClickedGoonGoto(CellPos tappedCellPoint) {
//  if (getSelectedGoonActor().isBusy()) return true; //zuende gehen lassen
//  Log.v(getClass().getSimpleName(), "Figur goto: " + tappedCellPoint);
//  final CellPoint from = getUiState().getSlotSelection().getSelected().getCellPos();
//  pathFinding.gridData.doFloodfill(from);
//  getBlaupause().getBttActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
//  final ArrayList<CellPoint> path = pathFinding.getPath(from, tappedCellPoint);
//  if (path.size() > 1) {
//    doGoonGoto(tappedCellPoint, path);
//  } else {
//    Log.v(getClass().getSimpleName(), "No path found to: " + tappedCellPoint);
//  }
//  return true;
//}

//private FigurActor getSelectedGoonActor() {
//  return (FigurActor) findActor(getUiState().getSlotSelection().getSelected().getSlotid());
//}

//private void doGoonGoto(CellPos tappedCellPoint, ArrayList<CellPos> path) {
//  Log.v(getClass().getSimpleName(), "Pfad zu : " + path);
//  getBlaupause().getBttActorManager().getPfadSchritteGroup().setPfad(path);
//  FigurActor actor = getSelectedGoonActor();
//  actor.addMoveToActionsFor(getMapHelper().getStageCoordinatesFor(path));
//  getUiState().getSlotSelection().getSelected().getCellPos().set(tappedCellPoint);
//  pathFinding.gridData.doFloodfill(tappedCellPoint);
//}

@Override
public void longPressedAt(Vector2 stageCoordinates) {
//  tiefe = 3;
//  pathFinding.setMaxDepth(tiefe);
//  pathFinding.gridData.doFloodfill(getUiState().getSlotSelection().getSelected().getCellPos());
//  getBlaupause().getBttActorManager().getPathfindingCellsLayer().updateFrom(pathFinding);
}
}
