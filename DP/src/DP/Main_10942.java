package DP;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-11-13.
 * 문제 출처 : https://www.acmicpc.net/problem/10942
 *
 * 시간 복잡도 : O(N)
 * 사용한 알고리즘 : DP
 * 사용한 자료구조 : 배열
 */
public class Main_10942 {
    private static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] numbers = makeNumberArray(n);
        boolean[][] palindromeResults = makePalindromeResults(n, numbers);

        int m = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(playGame(m, palindromeResults));

        bw.close();
        br.close();
    }

    private static int[] makeNumberArray(int n) throws IOException {
        int[] array = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        return array;
    }

    private static boolean[][] makePalindromeResults(int n, int[] numbers) {
        boolean[][] result = new boolean[n+1][n+1];
        for(int i=1; i<=n; i++) {
            result[i][i] = true;
        }

        for(int i=1; i<n; i++) {
            if(numbers[i] == numbers[i+1]) {
                result[i][i+1] = result[i+1][i] = true;
            }
        }

        return checkPalindrome(n, numbers, result);
    }

    private static boolean[][] checkPalindrome(int n, int[] numbers, boolean[][] palindromeResults) {
        for(int i=1; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                if(numbers[j] == numbers[j+i] && palindromeResults[j+1][j+i-1]) {
                    palindromeResults[j][j+i] = palindromeResults[j+i][j] = true;
                }
            }
        }
        return palindromeResults;
    }

    private static String playGame(int m, boolean[][] results) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0, result; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            result = results[s][e] ? 1 : 0;
            sb.append(result + "\n");
        }
        return sb.toString();
    }

}
