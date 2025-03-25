import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int result=0;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			int m=n%i;
			if(m==0) {
				
				result=i;
				
				count++;
				if(count==k) {
					System.out.println(result);
				}
			}
		}
		if(count<k){
			System.out.println(0);
		}
	}
}