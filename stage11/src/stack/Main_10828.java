package stack;

import java.util.*;

public class Main_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		String[] order;
		StringBuffer sb = new StringBuffer(100); 
		MyStack s = new MyStack();
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine().trim();
			sb.append(str + " ");
		}
		
		order = sb.toString().split(" ");
		
		for(int i=0; i<order.length; i++) {
			switch(order[i]) {
			case "push" :
				s.push(Integer.parseInt(order[++i]));
				break;
			case "pop" :
				System.out.println(s.pop());
				break;
			case "size" :
				System.out.println(s.size());
				break;
			case "empty" :
				System.out.println(s.empty());
				break;
			case "top" :
				System.out.println(s.top());
				break;
			}
		}

	}
}

class MyStack extends Vector<Integer> {
	public void push(int x) {
		super.addElement(x);
	}
	
	public int pop() {
		if(empty() == 0) {
			int n = peek();
			super.remove(size()-1);
			return n;
		}
		return -1;
	}
	
	public int peek() {
		int length = size();
		
		return (int)super.elementAt(length-1);
	}
	
	public int size() {
		return super.size();
	}
	
	public int empty() {
		return (size() == 0) ? 1 : 0;
		// stack이 비어있으면 1, 아니면 0
	}
	
	public int top() {
		return (empty() == 0) ? peek() : -1;
	}
	
}