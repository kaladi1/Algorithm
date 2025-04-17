import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int max = 5;
        for (int i = 0; i < max; i++) {
            int j = Integer.parseInt(br.readLine());
            sum += j;
            list.add(j);
        }

        int average = sum / max;
        System.out.println(average);

        list.sort(Comparator.naturalOrder());
        int mid = list.get(max / 2);
        System.out.println(mid);
    }
}