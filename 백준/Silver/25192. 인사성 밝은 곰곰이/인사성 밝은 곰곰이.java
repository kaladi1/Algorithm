import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> user = new HashSet<String>(); 

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) { 
                count += user.size();   
                user.clear();

            } else {
                user.add(input);
            }
        }
        System.out.println(user.size() + count);

        br.close();
    }

}