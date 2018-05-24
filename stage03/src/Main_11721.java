import java.util.Scanner;

public class Main_11721 { // #11721

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		String tmp = "";
		
		for(int i=1; i<=s.length(); i++) {
			tmp += s.charAt(i-1);
			
			if((i!=0) && (i%10==0)) {
				System.out.println(tmp);
				tmp = "";
			}
		}
		
		if(s.length() % 10 != 0)
			System.out.println(tmp);
	}
}
