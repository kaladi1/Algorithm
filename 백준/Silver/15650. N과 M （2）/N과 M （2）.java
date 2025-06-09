import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int[] list;
	static boolean[] isUsed;
	static StringBuilder sb;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		sb = new StringBuilder();
		list = new int[N];
		isUsed = new boolean[N+1];
		print(0);
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	
	public static void print(int cnt) {
		if(cnt==M) {
			StringBuilder sb2 = new StringBuilder();
			for(int i=0; i<M; i++) {
				if(((i+1)!=M) && list[i]>list[i+1]) return;
				sb2.append(list[i] +" "); 
			}
			sb.append(sb2.toString() + "\n");
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(!isUsed[i]) { 
				list[cnt] = i;
				isUsed[i] = true;
				print(cnt+1); 
				isUsed[i] = false;
			}
		}
	}
	
}