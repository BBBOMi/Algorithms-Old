import java.util.Scanner;

public class Main_9498 { // #9498

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(90 <= n && n <=100)
			System.out.println("A");
		else if(80 <= n)
			System.out.println("B");
		else if(70 <= n)
			System.out.println("C");
		else if(60 <= n)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
