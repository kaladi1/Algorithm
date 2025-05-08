import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < 1; i++) {

                String[] x = bf.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(x[j]);
            }
        }

        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);
        copyArr = Arrays.stream(copyArr).distinct().toArray();


        HashMap<Integer, Integer> ascArr = new HashMap<>();
                for (int i = 0; i < copyArr.length; i++) {
            ascArr.put(copyArr[i],i);
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(ascArr.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}