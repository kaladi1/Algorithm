import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true){

            st = new StringTokenizer(br.readLine());

            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            int thr = Integer.parseInt(st.nextToken());

            if(fir==0&&sec==0&&thr==0){
                break;
            }

            if(fir < sec+thr && sec < fir+thr && thr < fir+sec ){
                if(fir==sec && sec == thr){
                    System.out.println("Equilateral");
                } else if (fir == sec || fir == thr || sec == thr) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene ");
                }

            }else {
                System.out.println("Invalid");
            }
        }
    }
}