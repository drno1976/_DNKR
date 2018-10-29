package dnkr.dpap.model.turns;
public class TurnResolver implements Resolver {


public TurnResolver(){
}

@Override
public void doResolve() {
//  new ShootingResolver().doResolve();
  new MovementResolver().doResolve();
//  new SpielendeResolver().doResolve();
//  gameData.getTurnData().increaseTurnNumber();
}
}
