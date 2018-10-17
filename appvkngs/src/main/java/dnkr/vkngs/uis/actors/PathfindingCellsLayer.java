package dnkr.vkngs.uis.actors;
import android.support.annotation.NonNull;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import java.util.Queue;
import dnkr.appbase.gdx.actors.TiledActorLayer;
import dnkr.appbase.gdx.actors.TiledActorManager;
import dnkr.appbase.gdx.tiled.CellPos;
import dnkr.vkngs.uis.maps.TiledMapPathFinding;
import dnkr.vkngs.uis.maps.ValueCellPoint;

public class PathfindingCellsLayer extends TiledActorLayer {
private final Vector2 offset;
private final Label.LabelStyle labelStyle;

public PathfindingCellsLayer(TiledActorManager screenActors) {
  super(screenActors);
  offset = new Vector2(64, 64);
  offset.sub(18, 18);
  labelStyle = createLabelStyle();
}

public void updateFrom(TiledMapPathFinding pathFinding) {
  setFrontier(pathFinding.gridData.getFrontier());
  setCameFrom(pathFinding.gridData.getCamefrom());
  setCosts(pathFinding.gridData.getCostfor());
}

private void setFrontier(@NonNull Queue<CellPos> frontier) {
//  clearChildren();
//  removeChildrenFromStage();
//  for (CellPos cellPoint : frontier) {
//    //System.out.println("frontier cellPoint = " + cellPoint);
//    final Image schritt;
////    schritt = new Image(getTextureManager().loadDirekt(VkngsAssets.GREEN_CIRCLE_PNG));
//    Vector2 newpos = screenActors.getMapHelper().getStageCoordinatesFor(cellPoint);
//    newpos.add(offset);
//    schritt.setPosition(newpos.x, newpos.y);
//    this.addActor(schritt);
//  }
}

private void setCameFrom(@NonNull ValueCellPoint[] camefrom) {
//  for (int i = 0; i < camefrom.length; i++) {
//    ValueCellPoint woher = camefrom[i];
//    CellPoint cellPoint = new CellPoint(i % 20, i / 20);
//    if (woher == null) continue;
//    final Image schritt;
//    schritt = new Image(getTextureManager().loadDirekt(RobnAssets.WAYPOINT_DIRECTION_PNG));
//    Vector2 newpos = screenActors.getMapHelper().getStageCoordinatesFor(cellPoint);
//    newpos.add(offset);
//    schritt.setPosition(newpos.x, newpos.y);
//    //schritt.setRotation(90 * woher.getValue());
//    schritt.setRotation(45 * woher.getValue());
//    this.addActor(schritt);
//  }
}

private void setCosts(@NonNull ValueCellPoint[] costfor) {
//  for (int i = 0; i < costfor.length; i++) {
//    ValueCellPoint cost = costfor[i];
//    if (cost == null) continue;
//    Label schritt = new Label("" + cost.getValue(), labelStyle);
//    Vector2 newpos = screenActors.getMapHelper().getStageCoordinatesFor(cost);
//    newpos.add(60, 60);
//    schritt.setPosition(newpos.x, newpos.y);
//    this.addActor(schritt);
//  }
}
}
