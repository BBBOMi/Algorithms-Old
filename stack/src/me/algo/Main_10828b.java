package stack;

import java.io.*;
import java.util.Stack;

/**
 * Created by bomi on 2019-05-09.
 */


public class Main_10828b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        String[] str;
        for(int i=0; i<n; i++) {
            str = br.readLine().split(" ");

            switch(str[0]) {
                case "push":
                    stack.add(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    System.out.println(stack.empty() ? -1 : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.empty() ? -1 : stack.peek());
            }
        }
    }
}
