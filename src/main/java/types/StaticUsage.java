package types;

import java.util.ArrayList;
import java.util.List;

public class StaticUsage {
  public static List<Double> list = new ArrayList();

  public void populateList() {
    for (int i = 0; i < 10000000; i++) {
      list.add(Math.random());
    }
  }
}
