import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String input = br.readLine();
        int a1 = Integer.parseInt(input.split(" ")[0]);
        int a0 = Integer.parseInt(input.split(" ")[1]);

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int Fn = a1 * n0 + a0;
        int Gn = c * n0;


        if (Fn > Gn || a1 > c)
            System.out.println("0");
        else
            System.out.println("1");
    }
}