import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int distance = Integer.parseInt(br.readLine());

        System.out.print(findMinTime(distance));
    }

    private static int findMinTime(int distance) {
        final int MOVEMENT_PER_MINUTE = 5;
        return distance / MOVEMENT_PER_MINUTE + (distance % MOVEMENT_PER_MINUTE > 0 ? 1 : 0);
    }
    
}