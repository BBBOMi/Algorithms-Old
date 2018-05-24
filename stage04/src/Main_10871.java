import java.util.Scanner;

public class Main_10871 { // #10871

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int x = input.nextInt();
		input.nextLine();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(a[i] < x)
				System.out.print(a[i] + " ");
		}
	}
}
