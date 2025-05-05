import java.io.*;
import java.util.*;

public class Main {
	static class Point implements Comparable<Point>{
		int x;
		int y;
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point o) {
			if(this.y==o.y) {
				return this.x-o.x;
			}
			return this.y-o.y;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Point> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			String[] split = br.readLine().split(" ");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			pq.offer(new Point(x, y));
		}
		
		while(!pq.isEmpty()) {
			Point p = pq.poll();
			System.out.println(p.x+" "+p.y);
		}
		
	}
}