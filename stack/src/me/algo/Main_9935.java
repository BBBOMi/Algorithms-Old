package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-13.
 */
public class Main_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            stack.push(ch);
            boolean flag = false;

            if(ch==bomb.charAt(0) && stack.size()>=bomb.length()) {
                for(int j=0; j<bomb.length(); j++) {
                    flag = true;
                    if(bomb.charAt(j) != stack.get(stack.size()-1-j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    for(int j=0; j<bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            System.out.println("FRULA");
            return;
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
