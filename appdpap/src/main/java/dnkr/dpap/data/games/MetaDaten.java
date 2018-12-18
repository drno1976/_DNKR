package dnkr.dpap.data.games;
public class MetaDaten {
private int idCounter=1000;
private int turnCounter = 1;


public String getNextId() {
  idCounter++;
  return ""+idCounter;
}

public int getTurnCounter() {
  return turnCounter;
}

public void increaseTurnNumber() {
  turnCounter++;
}
}
