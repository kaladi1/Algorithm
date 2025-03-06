import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String voca = sc.nextLine();

        IntStream spellings= voca.chars();

        List<Integer> origin = spellings.boxed().collect(Collectors.toList());

        List<Integer> reverse = origin.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list;
                }));

        if(origin.equals(reverse)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}