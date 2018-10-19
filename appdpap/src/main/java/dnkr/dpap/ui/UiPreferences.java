package dnkr.dpap.ui;
public class UiPreferences {
private static final UiPreferences ourInstance = new UiPreferences();

public static UiPreferences getPrefs() {
  return ourInstance;
}

private UiPreferences() {
}

public float getMovingDuration() {
  return 6f;
}
}
