import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isGroupString()) count++;
        }
        System.out.println(count);
    }

    public static boolean isGroupString() throws IOException {
        boolean[] alphabetArr = new boolean[26];
        int previousChar = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != previousChar) {
                if (!alphabetArr[ch - 'a']) {
                    alphabetArr[ch - 'a'] = true;
                    previousChar = ch;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}