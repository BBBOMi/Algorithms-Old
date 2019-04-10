package me.algo.lesson.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bomi on 2019-04-10.
 */
public class Distinct {
    public static void main(String[] args) {

    }

    static int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0; i<A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}
