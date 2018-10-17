package dnkr.dpap.data;
class MetaDaten {
private int idCounter=1000;

public String getNextId() {
  idCounter++;
  return ""+idCounter;
}
}
