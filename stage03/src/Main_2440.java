import java.util.Scanner;

public class Main_2440 { // #2440

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--)
				System.out.print("*");
			System.out.println();
		}		
	}
}
