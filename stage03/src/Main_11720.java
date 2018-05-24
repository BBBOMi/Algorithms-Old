import java.util.Scanner;

public class Main_11720 { // #11720

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String num = input.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int var = (num.charAt(i) - '0');
			sum += var;
		}
		
		System.out.println(sum);
	}
}
