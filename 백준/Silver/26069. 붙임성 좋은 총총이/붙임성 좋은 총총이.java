import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if(set.contains(s1))
                set.add(s2);
            else if(set.contains(s2))
                set.add(s1);
        }

        str.append(set.size());

        System.out.print(str);
        br.close();
    }
}