import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long gcd = 0;
        long lcm = a * b;

        if (a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        while (true) {
            long tmp = b % a;
            if (tmp == 0) {
                gcd = a;
                break;
            }
            b = a;
            a = tmp;
        }
        lcm = lcm / gcd;
        System.out.println(lcm);

        sc.close();
    }
}