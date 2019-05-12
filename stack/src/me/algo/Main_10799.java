package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-12.
 */
public class Main_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();

        char ch;
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            if(ch == '(') {
                stack.push(ch);
                continue;
            }

            stack.pop();
            if(str.charAt(i-1) == '(') {
                count += stack.size();
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
