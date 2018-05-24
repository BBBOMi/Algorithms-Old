import java.util.Scanner;

public class Main_1110 { // #1110

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count = 0;
		
		int a = n / 10;
		int b = n % 10;
		
		while(true) {
			count++;
			int tmp = b;
			if((a+b) >= 10)
				b = (a+b) % 10;
			else b += a;
			a = tmp;
			
			if(a*10 + b == n)
				break;
		}
		
		System.out.println(count);
	}
}
