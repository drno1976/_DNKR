package dnkr.libbase;
public class IdObject implements HasId {
private final String id;

public IdObject(String id) {
  this.id = id;
}

@Override
public String toString() {
  return  id;
}

@Override
public String getId() {
  return id;
}
}
