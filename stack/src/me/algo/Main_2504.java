package stack;

import java.util.*;

public class Main_2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		int result;
		result = calculate(str);
		System.out.println(result);
	}
	
	public static int calculate(String str) {
		if(testPair(str)) {
			Stack<Character> s = new Stack<>();
			Stack<Integer> result = new Stack<>();
			char ch;
			boolean optPop = false;

			for(int i=0; i<str.length(); i++) {
				ch = str.charAt(i);
				if(ch == '(' || ch == '[') {
					s.push(ch);
					optPop = false;
				} else {
					if(ch == ')') {
						s.pop();
						result.push(2);
					} else {
						s.pop();
						result.push(3);
					}
					
					if(optPop) {
						int opr1 = result.pop();
						int opr2 = result.pop();
						result.push(opr1 * opr2);
					}
					optPop = true;
				}
			}
			
			
			
			return result.pop();
		} else return 0;
	}
	
	public static boolean testPair(String str) {
		Stack<Character> s = new Stack<>();
		char ch, pair;
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch == '(' || ch == '[') {
				s.push(ch);
			} else {
				if(s.isEmpty())
					return false;
				else {
					pair = s.peek();
					if(pair == '(' && ch == ')' || pair == '[' && ch == ']')
						s.pop();
					else 
						return false;
				}
			}
		}
		
		if(s.isEmpty()) return true;
		else return false;
	}
}
