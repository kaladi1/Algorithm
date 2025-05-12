import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String s = st.nextToken();

            if(s.equals("enter")) {
              treeSet.add(name);
            } else {
                treeSet.remove(name);
            }
        }

        for (String val : treeSet) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }
}