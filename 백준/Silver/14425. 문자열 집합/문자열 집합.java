import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] target = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < target[0]; i++) {
      set.add(br.readLine());
    }

    int ans = 0;
    for (int i = 0; i < target[1]; i++) {
      if (set.contains(br.readLine())) {
        ans++;
      }
    }

    System.out.println(ans);
    
  }
}