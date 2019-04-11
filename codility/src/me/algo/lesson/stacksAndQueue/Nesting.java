package me.algo.lesson.stacksAndQueue;

import java.util.Stack;

/**
 * Created by bomi on 2019-04-11.
 */
public class Nesting {
    public static void main(String[] args) {

    }

    static int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return 0;
                char p = stack.peek();
                if(p == '(') stack.pop();
                else return 0;
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
}
