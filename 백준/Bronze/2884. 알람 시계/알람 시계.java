import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        
        if(H==0 && M<45){
            System.out.print(23+" "+(M+15));
        } else if(M<45){
            System.out.print((H-1)+" "+(M+15));
        } else{
            System.out.print(H+" "+(M-45));
        }
    }
}