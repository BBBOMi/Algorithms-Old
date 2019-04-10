package me.algo;

import java.util.Stack;

/**
 * Created by bomi on 2019-04-10.
 */
public class Fish {
    public static void main(String[] args) {
        int result = solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0});
        System.out.println(result);
    }

    public static int solution(int[] A, int[] B) {
        Stack<Integer> zero = new Stack<Integer>();
        Stack<Integer> one = new Stack<Integer>();

        for(int i=0 ; i<A.length; i++) {
            if(zero.isEmpty() || one.isEmpty()) {
                if(B[i] == 0) {
                    zero.push(A[i]);
                } else {
                    one.push(A[i]);
                }
            } else {
                if(B[i] == 0) {
                    int n = one.peek();
                    if(A[i] > n) {
                        one.pop();
                        zero.push(A[i]);
                    }
                } else {
                    int n = zero.peek();
                    if(A[i] < n) {
                        zero.pop();
                        one.push(A[i]);
                    }
                }
            }
        }
        return (one.isEmpty() ? zero.size() : one.size());
    }
}
