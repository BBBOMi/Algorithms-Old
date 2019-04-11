package me.algo.lesson.timeComplexity;

/**
 * Created by bomi on 2019-04-11.
 */
public class FrogJmp {
    public static void main(String[] args) {

    }

    static int solution(int X, int Y, int D) {
        int count = 0;
        while(Y > X) {
            X += D;
            count++;
        }
        return count;
    }
}
