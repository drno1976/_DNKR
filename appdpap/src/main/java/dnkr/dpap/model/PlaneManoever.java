package dnkr.dpap.model;
public class PlaneManoever {
private final String schrittString;

public PlaneManoever(int speed) {
  schrittString = "vvvvvvvvvvvvvvv".substring(0, speed);
}

public PlaneManoever(String schritte) {
  schrittString = schritte;
}

public String getSchrittString() {
  return schrittString;
}
}
