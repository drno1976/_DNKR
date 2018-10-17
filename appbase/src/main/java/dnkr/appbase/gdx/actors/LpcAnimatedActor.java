package dnkr.appbase.gdx.actors;
public class LpcAnimatedActor extends AnimatedActor {
private final LpcFigurAnimations figurAnimations;

public LpcAnimatedActor(LpcFigurAnimations figurAnimations) {
  super(new AnimationImage(figurAnimations.get(FigurAnimations.IDLE)));
  this.figurAnimations = figurAnimations;
}

public void setAnimationTo(String animationId) {
  setAnimation(figurAnimations.get(animationId));
}
}
