import java.util.Scanner;
public class Feb26th {
	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if (a > c) 
			return a;
		else if (b > c)
			return c;
		else 
			return b;
			
		}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		System.out.println(med3(a, b, c));
 }
}