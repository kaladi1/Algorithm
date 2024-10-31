import java.util.*;

public class Main {
    public static void main(String[] args) {
        int A, B, C;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        sc.close();

        StringBuilder sb = new StringBuilder();

        sb.append((A+B)%C);
        sb.append("\n");

        sb.append(((A%C) + (B%C))%C);
        sb.append("\n");

        sb.append((A*B)%C);
        sb.append("\n");

        sb.append(((A%C)*(B%C))%C);
        sb.append("\n");

        System.out.println(sb);
    }
}