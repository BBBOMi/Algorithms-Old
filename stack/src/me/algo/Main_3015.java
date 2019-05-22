package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-21.
 */
public class Main_3015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Pair> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            while(!stack.isEmpty() && stack.peek().value <= num) {
                count += stack.pop().count;
            }

            if(stack.isEmpty()) {
                stack.push(new Pair(num));
                continue;
            }

            if(stack.peek().value == num) {
                Pair p = stack.pop();
                count += p.count;

                if(!stack.isEmpty()) {
                    count++;
                }

                p.count++;
                stack.push(p);
                continue;
            }

            stack.push(new Pair(num));
            count++;
        }

        System.out.println(count);
    }
}

class Pair {
    int value;
    int count;

    Pair(int value) {
        this(value, 1);
    }

    Pair(int value, int count) {
        this.value = value;
        this.count = count;
    }
}
