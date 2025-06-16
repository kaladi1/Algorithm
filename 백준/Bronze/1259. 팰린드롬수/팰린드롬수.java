    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> arrayList = new ArrayList<>();

            while(true){

                String s = br.readLine();
                if(s.equals("0")) {
                    break;
                }
                StringBuilder sb = new StringBuilder(s);
                String s2 = sb.reverse().toString();

                if(s.equals(s2))
                    arrayList.add("yes");
                else arrayList.add("no");

            }

            for(int i=0;i<arrayList.size();i++){
                System.out.println(arrayList.get(i));
            }

        }
    }