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

public PlaneManoever getMirrored() {
  StringBuilder mirror = new StringBuilder();
  for (int i = 0; i < schrittString.length(); i++) {
    final char c = schrittString.charAt(i);
    switch (c) {
      case 'v':
        mirror.append('v');
        break;
      case 'l':
        mirror.append('r');
        break;
      case 'r':
        mirror.append('l');
        break;
      default:
        mirror.append(c);
    }
  }
  System.out.println("mirror = " + mirror);
  return new PlaneManoever(mirror.toString());
}
}
