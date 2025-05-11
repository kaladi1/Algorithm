import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j <= a.length(); j++) {
                map.put(a.substring(i, j), i);
            }
        }

        bw.write(String.valueOf(map.size()));


        bw.flush();
        bw.close();
    }
}