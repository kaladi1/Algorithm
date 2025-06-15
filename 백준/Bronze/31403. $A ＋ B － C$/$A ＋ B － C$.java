import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int calInt = A+B-C;

        String D = "";
        D += A;
        D += B;
        int AB = Integer.parseInt(D);
        int calString = AB - C;

        sb.append(calInt).append("\n");
        sb.append(calString);

        System.out.println(sb);
    }
}