package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by bomi on 2019-12-01.
 * 문제 출처 : https://www.acmicpc.net/problem/2407
 *
 * 시간 복잡도 : O(N^2)
 * 사용한 알고리즘 : memoization
 * 사용한 자료구조 : 배열
 */

public class Main_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        BigInteger[][] array = new BigInteger[n+1][m+1];
        BigInteger one = new BigInteger("1");

        array[1][0] = array[1][1] = one;
        for(int i=2; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                if(j > m) break;
                if(i == j || j == 0) {
                    array[i][j] = one;
                    continue;
                }
                array[i][j] = array[i-1][j-1].add(array[i-1][j]);
            }
        }
        System.out.println(array[n][m]);
    }
}
