import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = 1;
		
		for(int i=1;i<=N;i++) {
			
			for(int j=N; i<j; j--) {
				System.out.print(" ");
			    }
			for(int k=1; k<=i*2-1;k++) {
				System.out.print("*");
			    }
			System.out.println();
		    } 
		
		for(int i=N-1; 1<=i; i--) {
			for(int j=1; j<=N-i; j++) {
				System.out.print(" ");
		    	}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			    }
			System.out.println();
		    }
	}
}