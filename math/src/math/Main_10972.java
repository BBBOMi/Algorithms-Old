package math;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-22.
 * 출처 : https://www.acmicpc.net/problem/10972
 *
 * 시간 복잡도 : O(N logN)
 * 공간 복잡도 : O(N)
 * 사용한 알고리즘 : 정렬(QuickSort)
 * 사용한 자료구조 : 배열
 */
public class Main_10972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] prePermutation = makePrePermutation(n, st);

        String answer = findPermutation(prePermutation);
        answer = "-1".equals(answer) ? answer : answer.substring(1, answer.length()-1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);

        bw.close();
        br.close();

    }

    private static int[] makePrePermutation(int n, StringTokenizer st) {
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }
        return result;
    }

    private static String findPermutation(int[] numbers) {
        int index = findIndex(numbers);
        if(index == 0) return "-1";

        findValueAndChange(index-1, numbers);

        Arrays.sort(numbers, index, numbers.length);

        return Arrays.toString(numbers).replace(",", "");
    }

    private static int findIndex(int[] numbers) {
        for(int i=numbers.length-1; i>0; i--) {
            if(numbers[i] > numbers[i-1]) {
                return i;
            }
        }
        return 0;
    }

    private static void findValueAndChange(int index, int[] numbers) {
        for(int i=numbers.length-1; i>=index; i--) {
            if(numbers[i] > numbers[index]) {
                swap(i, index, numbers);
                return;
            }
        }
    }

    private static void swap(int i, int j, int[] numbers) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
