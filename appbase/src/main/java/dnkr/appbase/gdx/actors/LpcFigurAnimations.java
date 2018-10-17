package dnkr.appbase.gdx.actors;
import dnkr.appbase.gdx.assets.LpcSheet;
import dnkr.appbase.gdx.assets.TextureSheet;

public class LpcFigurAnimations extends FigurAnimations {
public LpcFigurAnimations(TextureSheet textureSheet) {
  super();
  final LpcSheet lpcSheet = new LpcSheet(textureSheet);
  map.put(FigurAnimations.IDLE, lpcSheet.getAnimationIdle());
  map.put(FigurAnimations.HURT, lpcSheet.getAnimationHurt());
  map.put(FigurAnimations.ATTACK, lpcSheet.getAnimationAttack());
}
}
