package dnkr.dpap.data.uistates;
public class UiState {
private final PlaneSelection planeSelection;

public UiState() {
  planeSelection = new PlaneSelection();
}

public PlaneSelection getPlaneSelection() {
  return planeSelection;
}
}
