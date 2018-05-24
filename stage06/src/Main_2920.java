import java.util.Scanner;

public class Main_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int[] arr = new int[8];
		boolean[] test = new boolean[8];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == i+1)
				test[i] = true;
			else if(arr[i] == arr.length-i)
				test[i] = false;
		}
		
		for(int i=0; i<test.length; i++) {
			if(test[i] == true)
				count++;
		}
		
		System.out.println((count == 8? "ascending" : (count == 0)? "descending" : "mixed"));
	}
}
