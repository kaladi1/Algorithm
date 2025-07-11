import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long a = Long.valueOf(st.nextToken());
        Long b = Long.valueOf(st.nextToken());

        System.out.println(Math.abs(a - b));
    }
}