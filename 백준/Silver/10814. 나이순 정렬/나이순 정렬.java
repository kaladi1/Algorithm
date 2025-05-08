import java.io.*;
import java.util.*;

public class Main {
    static class Node
    {
        int age;
        String name;
        public Node(int age, String name)
        {
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Node>[]arr = new ArrayList[201];

        for (int i = 1; i <201; i++)
        {
            arr[i] = new ArrayList<Node>();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int curage = Integer.parseInt(st.nextToken());
            String curname = st.nextToken();
            arr[curage].add(new Node(curage,curname));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=200; i++)
        {
            while(!arr[i].isEmpty())
            {
                Node curnod = arr[i].remove(0);
                sb.append(curnod.age+" "+curnod.name+"\n");
            }
        }
        System.out.println(sb);
    }
}