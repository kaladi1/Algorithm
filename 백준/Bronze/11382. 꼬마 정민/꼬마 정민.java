import java.util.*;

public class Main {
    public static void main(String[] args) {
        Long A, B, C;

        Scanner sc = new Scanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();


        sc.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A+B+C);

        
        System.out.println(sb);
    }
}