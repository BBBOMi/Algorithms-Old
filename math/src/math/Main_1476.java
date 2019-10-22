package math;

import java.io.*;

/**
 * Created by bomi on 2019-10-22.
 * 문제 출처 : https://www.acmicpc.net/problem/1476
 *
 * 시간 복잡도 : O(N)
 * 공간 복잡도 : O(1)
 * 사용한 알고리즘 : 브루트포스
 * 사용한 자료구조 : 배열
 */
public class Main_1476 {
    private static final int E = 15;
    private static final int S = 28;
    private static final int M = 19;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int e = Integer.parseInt(numbers[0]);
        int s = Integer.parseInt(numbers[1]);
        int m = Integer.parseInt(numbers[2]);

        int year = calculateYear(e, s, m);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(year + "\n");
        bw.flush();

        bw.close();
        br.close();

    }

    private static int calculateYear(int e, int s, int m) {
        int earthYear, sunYear, moonYear;
        for(int year=1; ; year++) {
            earthYear = year - e;
            sunYear = year - s;
            moonYear = year - m;

            if((earthYear%E == 0) && (sunYear%S == 0) && (moonYear%M == 0)) {
                return year;
            }
        }
    }
}
