package dnkr.dpap.model;
import java.util.ArrayList;
import java.util.Arrays;

class RoutenAsSchrittStrings extends ArrayList<String> {
public RoutenAsSchrittStrings() {
//  add("vvvvvv");
}

public void fillWith(String allRoutes) {
  this.clear();
  this.addAll(Arrays.asList(allRoutes.split(",")));
  System.out.println("this = " + this);
}
}
