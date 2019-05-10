package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-10.
 */
public class Main_9012b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String answer;
        Stack<String> stack = new Stack();
        for(int i=0; i<t; i++) {
            answer = "YES";
            String[] str = br.readLine().split("");
            for(String s : str) {
                if("(".equals(s)) {
                    stack.add(s);
                } else {
                    if(stack.empty()) {
                        answer = "NO";
                        break;
                    } else stack.pop();
                }
            }
            if(!stack.empty() || answer.equals("NO")) answer = "NO";
            System.out.println(answer);
            stack.clear();
        }
    }
}
