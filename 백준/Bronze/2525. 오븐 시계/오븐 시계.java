import java.util.*;

public class Main {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int Hour = sc.nextInt();
        int Min = sc.nextInt();
        int time = sc.nextInt();
        
        int T = (Hour*60)+Min+time;
        
        Hour = T/60;
        Min =  T%60;
        
        if(Hour >= 24){
            Hour = Hour - 24;
        }
        System.out.printf("%d %d",Hour,Min);
        
    }
}