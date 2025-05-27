import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] qs_type = br.readLine().split(" ");
        String[] qs_val = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] addVar = br.readLine().split(" ");

        Queue<String> q = new LinkedList();
        for (int i=n-1; i>=0; i--){
            if (qs_type[i].equals("0"))   q.add(qs_val[i]);
        }

        for (String cvar : addVar){
            q.add(cvar);
            bw.write(q.remove()+" ");
        }
        bw.flush();
        bw.close();
    }
}