import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (Integer.parseInt(br.readLine()))%42;
			if (i == 0) {
				continue;
			}
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
		}		
		int count = 0;
		for(int i=0; i<10; i++) {
			if(arr[i] != -1) {
				count++;
			}
		}
		System.out.println(count);		
	}
}