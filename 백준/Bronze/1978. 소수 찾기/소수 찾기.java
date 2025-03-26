import java.util.*;

public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int cnt = 0; 
        
        for(int i=0; i<n; i++) { 
            int k = sc.nextInt();
            boolean isPrime = true;
            
            if(k == 1)
                continue; 
            
            for(int j=2; j<=Math.sqrt(k); j++) { 
                if(k % j == 0) {
                    isPrime = false;    
                }
            }
            if(isPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}