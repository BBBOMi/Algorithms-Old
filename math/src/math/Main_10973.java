package math;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-23.
 * 문제 출처 : https://www.acmicpc.net/problem/10973
 *
 * 시간 복잡도 : O(N^2)
 * 공간 복잡도 : O(N)
 * 사용한 알고리즘 : 정렬(BubbleSort)
 * 사용한 자료구조 : 배열
 */
public class Main_10973 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        makePermutation(numbers, st);

        String answer = findPrePermutation(numbers);
        answer = "-1".equals(answer) ? answer : answer.substring(1, answer.length()-1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);

        bw.close();
        br.close();

    }

    private static void makePermutation(int[] numbers, StringTokenizer st) {
        for(int i=0, length=numbers.length; i<length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static String findPrePermutation(int[] numbers) {
        int index = findIndex(numbers);
        if(index == 0) return "-1";

        findValueAndChange(index-1, numbers);

        sort(index, numbers);

        return Arrays.toString(numbers).replace(",", "");
    }

    private static void findValueAndChange(int index, int[] numbers) {
        for(int i=numbers.length-1; i>=index; i--) {
            if(numbers[index] > numbers[i]) {
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

    private static int findIndex(int[] numbers) {
        for(int i=numbers.length-1; i>0; i--) {
            if(numbers[i] < numbers[i-1]) {
                return i;
            }
        }
        return 0;
    }

    private static void sort(int start, int[] numbers) {
        for(int i=start, length=numbers.length; i<length-1; i++) {
            for(int j=i+1; j<length; j++) {
                if(numbers[i] < numbers[j]) {
                    swap(i, j, numbers);
                }
            }
        }
    }
}
