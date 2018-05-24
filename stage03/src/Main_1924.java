import java.util.Scanner;

public class Main_1924 { // #1924

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int d = 0;
		
		for(int i=1; i<x; i++) {
			switch(i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				d += 31;

				break;

			case 2:
				d += 28;

				break;

			case 4: case 6: case 9: case 11:
				d+= 30;

				break;
			}
		}
		
		d += y;
		d %= 7;
		
		switch(d) {
		case 0:
			System.out.println("SUN");
			
			break;
			
		case 1:
			System.out.println("MON");
			
			break;
			
		case 2:
			System.out.println("TUE");
			
			break;
			
		case 3:
			System.out.println("WED");
			
			break;
		
		case 4:
			System.out.println("THU");
			
			break;
			
		case 5:
			System.out.println("FRI");
			
			break;
			
		case 6:
			System.out.println("SAT");
			
		}		
	}
}
