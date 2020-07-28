package types.equalshashcode;

import java.util.Map;

public class NotOverridenEquelsAndHashCode {

  Map<Object, Object> map = System.getProperties();
  // Use profiler to see how gc stop being able to reclaim memory in some time
  public void show() {
    while (true) {
      map.put(new Key("key"), "value");
    }
  }
}
