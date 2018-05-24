import java.util.Scanner;

public class Main_2839 { // #2839

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count = 0;
		
		if((n%5 == 0) || (n%3 == 0)) {
			if(n%5 == 0)
				count = n/5;
			
			else if(n%3 == 0) {
				count = n/5;
				n = n%5;
				
				if(n%3 == 0)
					count += n/3;
				else {
					n += (count*5);
					count = n/3;
				}
			}
		}
		
		else {
			while(true) { 
				if(n >= 5) {
					n -= 5;
					count++;
					//n %= 5;
				} else if(n >= 3) {
					count += (n/3);
					n %= 3;
				}
			
				if(n == 0)
					break;
				
				else if(n < 3) {
					count = -1;
					break;
				}
			}
		}
		
		System.out.println(count);	
	}
}
