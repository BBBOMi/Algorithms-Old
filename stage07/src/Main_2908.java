import java.util.Scanner;

public class Main_2908 { // #2908

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(a);
		a = buffer.reverse().toString();
		
		buffer = new StringBuffer();
		
		buffer.append(b);
		b = buffer.reverse().toString();
		
		if(Integer.parseInt(a) > Integer.parseInt(b))
			System.out.println(a);
		
		else if(Integer.parseInt(a) < Integer.parseInt(b))
			System.out.println(b);
	}
}
