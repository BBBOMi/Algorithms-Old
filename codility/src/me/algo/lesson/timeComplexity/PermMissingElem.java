package me.algo.lesson.timeComplexity;

import java.util.Arrays;

/**
 * Created by bomi on 2019-04-11.
 */
public class PermMissingElem {
    public static void main(String[] args) {

    }

    static int solution(int[] A) {
        Arrays.sort(A);

        int i=0;
        for( ; i<A.length; i++) {
            if(A[i] != i+1) break;
        }
        return A[i];
    }
}
