import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int deno = 0; 
        int nume = 0; 

        int k = 1;
        while (n > fact(k)) {
            k++;
        }

        if(k%2 != 0) { 
            deno = n - fact(k-1);
            nume = k + 1 - deno;
        }
        else { 
            deno = fact(k) - n + 1;
            nume = k + 1 - deno;
        }

        sb.append(nume);
        sb.append('/');
        sb.append(deno);

        System.out.println(sb);
    }

    static int fact(int n) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            result += i;
        }
        return  result;
    }
}