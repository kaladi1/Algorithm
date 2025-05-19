import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; ++i)
		{
			boolean ans = func(sc.next());
			if(ans == true) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	public static boolean func(String str)
	{
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); ++i)
		{
			char tmp = str.charAt(i);
			if (tmp == '(') stack.push(tmp);
			else if (stack.empty()) return false;
			else stack.pop(); 
		}
		if (stack.empty()) return true;
		else return false;
	}
}