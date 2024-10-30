import java.util.*;

public class Main {
    public static void main(String[] args) {
        int A,B;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        sc.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A+B);
        sb.append("\n");

        sb.append(A-B);
        sb.append("\n");

        sb.append(A*B);
        sb.append("\n");

        sb.append(A/B);
        sb.append("\n");

        sb.append(A%B);

        System.out.println(sb);
    }
}