import java.util.Scanner;

public class Main_1152 { // #1152

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		String str = input.nextLine();
		
		String word = "";
		for(int i=0; i<str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			if(s.equals(" ")) {
				word = "";
			} else {
				if(word.length() == 0) {
					count++;
				}
				word = s;
			}
		}
		
		System.out.println(count);
	}
}
