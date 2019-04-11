package me.algo.lesson.sort;

import java.util.Arrays;

/**
 * Created by bomi on 2019-04-11.
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{}));

    }

    static int solution(int[] A) {
        Arrays.sort(A);
        for(int i=0; i<A.length-2; i++) {
            if(A[i+2]-A[i+1] < A[i]) return 1;
        }
        return 0;
    }
}
