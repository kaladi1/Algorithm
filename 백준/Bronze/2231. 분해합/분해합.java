import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		System.out.println(apartSum(N));
	}
 
	
	static int apartSum(int N) {
		int number = 0;
		int sum = 0;
		int result = 0;
		
		for(int i=0; i<N; i++) {
		number = i;
		sum = 0;
		while(number > 0) {
			sum += number%10;
			number /= 10;
			}
		if(sum + i == N) {
			result = i;
			break;
			
		}
		}
		return result;
	}
}