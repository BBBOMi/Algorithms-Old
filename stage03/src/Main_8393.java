import java.util.Scanner;

public class Main_8393 { // #8393

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
