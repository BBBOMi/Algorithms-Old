package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-13.
 */
public class Main_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> left = new Stack<>(), right = new Stack<>();

        for(char c : str.toCharArray()) {
            left.push(c);
        }

        int n = Integer.parseInt(br.readLine());
        while(n-- != 0) {
            String s = br.readLine();
            if("L".equals(s)) {
                if(!left.empty()) {
                    right.push(left.pop());
                }
                continue;
            }
            if("D".equals(s)) {
                if(!right.empty()) {
                    left.push(right.pop());
                }
                continue;
            }
            if("B".equals(s)) {
                if(!left.isEmpty()) {
                    left.pop();
                }
                continue;
            }
            char ch = s.charAt(2);
            left.push(ch);
        }

        while(!left.empty()) {
            right.push(left.pop());
        }

        while(!right.empty()) {
            System.out.print(right.pop());
        }
    }
}
