import java.util.*;
import java.io.*;

public class Main {
    public static int stoi (String str) {
      return Integer.parseInt(str);
    }
  
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int[] array = new int[10001];
      array[0] = 666;
      
      int lastCount = 0;
      for (int i=0; i<10001; i++) {
        if (Integer.toString(lastCount).contains("666")) {
          for (int j=0; j<1000; j++) {
            if (i+j < 10001) {
              array[i+j] = lastCount*1000 + j;
            }
          }
          i+=999;
        } else if (lastCount%100 == 66) { 
          for (int j=0; j<100; j++) {
            if (i+j < 10001) {
              array[i+j] = lastCount*1000 + 600 + j;
            }
          }
          i+=99;
        } else if (lastCount%10 == 6) {
          for (int j=0; j<10; j++) {
            if (i+j < 10001) {
              array[i+j] = lastCount*1000 + 660 + j;
            }
          }
          i+=9;
        } else {
          array[i] = lastCount*1000 + 666;
        }
        lastCount++;
      }
      
      int N = stoi(br.readLine());
      System.out.println(array[N-1]);
  }
}