import java.util.Scanner;

public class Main_4344 { // #4344

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		double[] arrC = new double[c];
		
		for(int i=0; i<c; i++) {
			int n = input.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			
			for(int j=0; j<n; j++) {
				arr[j] = input.nextInt();
				sum += arr[j];
			}
			
			int ave = sum / n;
			int count = 0;
			
			for(int j=0; j<n; j++)
				if(ave < arr[j]) {
					count++;
			}
			
			arrC[i] = ((double)count / n) * 100;
		}
		
		for(double i : arrC) {
			System.out.printf("%.3f", i);
			System.out.println("%");
		}
	}
}
