package dnkr.dpap.data.games;
class MetaDaten {
private int idCounter=1000;

public String getNextId() {
  idCounter++;
  return ""+idCounter;
}
}
