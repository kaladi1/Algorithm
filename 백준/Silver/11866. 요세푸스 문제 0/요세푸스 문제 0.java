import java.io.*;
import java.util.*;

public class Main {
    
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
       
        for(int i = 1; i <= N; i++) {
            queue.offer(i);        
        }
        
        int count = 0;
        sb.append("<");
        while(!queue.isEmpty()) {
            check(K);     
        }
        
        System.out.println(sb.toString());
    }
    
    public static void check(int k) {
        int num = queue.poll();
        
        for(int i = 1; i < k; i++) {
            queue.offer(num);
            num = queue.poll();
        }   
        
        if(!queue.isEmpty()) {
            sb.append(num).append(", ");    
        } else {
            sb.append(num).append(">");
        }
    }
}