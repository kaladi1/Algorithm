import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int max = 0;
        int count = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            count++;
            if (arr[i] > max) {
                max = arr[i];
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}