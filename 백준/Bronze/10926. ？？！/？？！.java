import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a;

        Scanner sc = new Scanner(System.in);
        a = sc.next();

        sc.close();

        StringBuilder sb = new StringBuilder();

        sb.append(a + "??!");

        System.out.println(sb);
    }
}