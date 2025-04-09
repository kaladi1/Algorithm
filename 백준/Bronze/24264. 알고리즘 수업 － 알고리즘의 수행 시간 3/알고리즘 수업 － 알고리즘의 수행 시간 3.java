import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        System.out.println(n.multiply(n));
        System.out.println(2);
    }
}