package types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class UnclosedStreams {
  public void uncloseStream() throws IOException {
    String str = "";
    URLConnection conn
        = new URL("http://norvig.com/big.txt").openConnection();
    BufferedReader br = new BufferedReader(
        new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

    while (br.readLine() != null) {
      str += br.readLine();
    }
  }
}
