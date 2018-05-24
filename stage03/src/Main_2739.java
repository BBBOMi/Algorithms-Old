import java.util.Scanner;

public class Main_2739 { //#2739

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=1; i<=9; i++)
			System.out.println(n + " * " + i + " = " + n*i);
	}
}
