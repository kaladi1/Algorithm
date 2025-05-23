import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
	    var br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    String[] arr = new String[n];          
        
	    for(int i = 0 ; i < n ; i++) {
	        arr[i] = br.readLine();
	    }
	    
	    Arrays.sort(arr, new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) {
	            if(s1.length() == s2.length()) 
	                return s1.compareTo(s2);          
	            else
	                return s1.length() - s2.length();
	        }
	    });
	    
	    var sb = new StringBuilder();
	    sb.append(arr[0]).append('\n');
	    
	    for(int i=1 ; i < n ; i++) {
	        if(!arr[i].equals(arr[i-1]))
	            sb.append(arr[i]).append('\n');
	    }
	 
		System.out.println(sb);
	}
}