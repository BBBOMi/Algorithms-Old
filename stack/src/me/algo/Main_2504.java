package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2504 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int result;
		result = calculate(str);
		System.out.println(result);
	}

	static int calculate(String str) {
		Stack<Character> stack = new Stack<>();
		int sum = 0;
		int multiple = 1;
		char pre = 0;
		for(char c : str.toCharArray()) {
			switch(c) {
				case '(':
					stack.push(c);
					multiple *= 2;
					break;

				case '[':
					stack.push(c);
					multiple *= 3;
					break;

				case ')':
					if(stack.isEmpty()) return 0;
					if(stack.pop() != '(') return 0;
					if(pre == '(') sum += multiple;
					multiple /= 2;
					break;

				case ']':
					if(stack.isEmpty()) return 0;
					if(stack.pop() != '[') return 0;
					if(pre == '[') sum += multiple;
					multiple /= 3;
					break;
			}
			pre = c;
		}
		return stack.isEmpty() ? sum : 0;
	}
}
