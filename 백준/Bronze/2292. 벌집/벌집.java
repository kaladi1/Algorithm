import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.print(1);
            return;
        }
        n -= 1;
        int count = 1;
        int minus = 6;
        while (n > 0) {
            n -= minus;
            count++;
            minus += 6;
        }
        System.out.print(count);
    }
}