import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(a.indexOf(c) + " ");
        }
        System.out.println(sb);
    }
}