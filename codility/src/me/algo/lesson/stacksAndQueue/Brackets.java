package me.algo.lesson.stacksAndQueue;

import java.util.Stack;

/**
 * Created by bomi on 2019-04-11.
 */
public class Brackets {
    public static void main(String[] args) {

    }

    static int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='[' || c=='{' || c=='(') {
                stack.push(c);
            } else {
                if(!stack.isEmpty()) {
                    char p = stack.peek();
                    if((p == '[' && c == ']')
                            || (p == '{' && c == '}')
                            || (p == '(') && c == ')' ) {
                        stack.pop();
                    } else return 0;
                } else return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
