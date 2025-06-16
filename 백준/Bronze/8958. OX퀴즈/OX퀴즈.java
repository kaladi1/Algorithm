import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int count = 1;
        for (int i = 0; i < N; i++) { 
            String str = br.readLine();
            String arr[] = new String[str.length()];
            StringBuilder sb = new StringBuilder();
            sum = 0;
            count = 1;
            for (int j = 0; j < str.length(); j++) { 
                arr[j] = str.substring(j, j + 1);
                if (arr[j].equals("O")) {
                    if (j > 0) {
                        if (arr[j].equals(arr[j - 1])) {
                            count++;
                            sum += count;
                        } else {
                            count = 1;
                            sum += count;
                        }
                    } else {
                        sum += count;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}