import java.util.Scanner;

public class Main_1546 { // #1546

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		float[] score = new float[n];
		float m = score[0];
		float sum = 0;
		//float ave;
		
		for(int i=0; i<n; i++)
			score[i] = input.nextInt();

		for(int i=0; i<n; i++) {
			if(score[i] > m)
				m = score[i];
		}
		
		for(int i=0; i<n; i++) {
			if(score[i] != 0)
				score[i] = (score[i] / m) * 100; 
			
			sum += score[i];
		}
		
		System.out.printf("%.2f" , sum/n);
	}
}
