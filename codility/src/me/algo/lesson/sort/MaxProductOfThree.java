package me.algo.lesson.sort;

import java.util.Arrays;

/**
 * Created by bomi on 2019-04-11.
 */
public class MaxProductOfThree {
    public static void main(String[] args) {

    }

    static int soltion(int[] A) {
        Arrays.sort(A);
        int result = A[A.length-1] * A[A.length-2] * A[A.length-3];
        if(A[1] < 0) {
            int n = A[0] * A[1] * A[A.length-1];
            if(n > result) result = n;
        }
        return result;
    }
}
