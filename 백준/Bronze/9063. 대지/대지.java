import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int minX = 10001;
		int maxX = -10001;
		
		int minY = 10001;
		int maxY = -10001;
		
		for(int i=0; i<N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x > maxX)
				maxX = x;
			if(x < minX)
				minX = x;
			if(y > maxY)
				maxY = y;
			if(y < minY)
				minY = y;
		}
		
		int area = (maxX - minX) * (maxY - minY);
		System.out.print(area);
	}
}