import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int currentNum = 1; 

        while (true) {

            if (stack.peek() == currentNum) {
                stack.pop();
                currentNum++;
                continue;
            }

            if (!queue.isEmpty()) {
                if (queue.peek() == currentNum) {
                    queue.poll();
                    currentNum++;
                } else {
                    stack.push(queue.poll());
                }
            }

            if (queue.isEmpty() && stack.peek() != currentNum) {
                break;
            }
        }

        if (currentNum == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}