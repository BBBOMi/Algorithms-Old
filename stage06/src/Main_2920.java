import java.util.Arrays;
import java.util.Scanner;

public class Main_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int[] arr = new int[8];
		String check = "mixed";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] arrCheck = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCheck);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[arr.length-1-i] == arrCheck[i] && (check != "ascending")) {
				//System.out.println(arr[arr.length-1] + " " + arrCheck[i]);
				check = "descending";
			} else if (arr[i] == arrCheck[i] && (check != "descending")) {
				//System.out.println(arr[i] + " " + arrCheck[i]);
				check = "ascending";
			} else {
				//System.out.println(arr[i] + " " + arrCheck[i]);
				check = "mixed";
				break;
			}
		}
		
		System.out.println(check);
		
	}
}
