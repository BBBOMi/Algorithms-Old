package me.algo;

import java.io.*;
import java.util.Stack;

/**
 * Created by bomi on 2019-07-09.
 */
public class Main_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();
            if(".".equals(s)) {
                break;
            }

            bw.write(solution(s) ? "yes \n" : "no \n");
        }
        bw.close();
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[') {
                stack.push(c);
                continue;
            }

            if(c == ')' || c == ']') {
                if(stack.isEmpty()) {
                    return false;
                }

                char compare = stack.peek();
                if((compare == '(' && c == ')')
                || (compare == '[' && c == ']')) {
                    stack.pop();
                    continue;
                }
                break;
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
