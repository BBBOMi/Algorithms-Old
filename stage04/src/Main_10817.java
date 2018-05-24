import java.util.Scanner;

public class Main_10817 { // #10817

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if((a >= b && a >= c)) {
			if(b >= c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		else if(b >= a && b >= c) {
			if(a >= c)
				System.out.println(a);
			else
				System.out.println(c);
		} else if(c >= a && c >= b) {
			if(a >= b)
				System.out.println(a);
			else
				System.out.println(b);
		} /*else
			System.out.println(a);
*/
	}
}
