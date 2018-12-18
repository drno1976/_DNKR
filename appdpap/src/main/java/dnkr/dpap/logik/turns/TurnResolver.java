package dnkr.dpap.logik.turns;
public class TurnResolver extends AbstractResolver {

public TurnResolver(){
}

@Override
public void doResolve() {
//  new ShootingResolver().doResolve();
  new MovementResolver().doResolve();
//  new SpielendeResolver().doResolve();
  getData().getMetaDaten().increaseTurnNumber();

}
}
