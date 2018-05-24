import java.util.*;

public class Main_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int[] numbers = new int[number.length()];
		
		for(int i=0; i<numbers.length; i++) {	
			numbers[i] = Integer.parseInt(number.charAt(i)+"");
		}
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i; j<numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		
		for(int i : numbers)
			System.out.print(i);
	}

}
