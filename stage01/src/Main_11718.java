import java.util.Scanner;

public class Main_11718 { // #11718

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[100];
		
		for(int i=0; i<100; i++) {
			String str = input.nextLine();
			
			if(str == "")
				break;
			
			arr[i] = str;
		}
		
		for(String s : arr)
			System.out.println(s);
	}
}
