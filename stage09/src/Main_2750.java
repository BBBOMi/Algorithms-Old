import java.util.*;

public class Main_2750 { // #2750

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
