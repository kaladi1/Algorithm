import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0; 

        for (int i = 0; i < N; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        int min = max;

        for (int i = 0; i < N; i++) {
            if (min > arr[i])
                min = arr[i];
        }

       
        if (N == 1) {
            System.out.println(max * max);
        } else {
            System.out.println(max * min);
        }


    }

}