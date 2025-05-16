import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean isPrime[] = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Arrays.fill(isPrime, true);
        for (int i = 2; i < 1000; i++) {
            if (!isPrime[i])
                continue;
            for (int j = 2; i * j < 1000001; j++)
                isPrime[i * j] = false;
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 2; i * 2 <= num; i++)
                if (isPrime[i] && isPrime[num - i])
                    sum++;
            sb.append(sum + "\n");
        }
        System.out.print(sb);
    }
}