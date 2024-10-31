import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        sc.close();

        StringBuilder sb = new StringBuilder();

        sb.append(a - 543);

        System.out.println(sb);
    }
}