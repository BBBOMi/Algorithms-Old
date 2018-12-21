package backtracking;

import java.io.*;
import java.util.Arrays;

/**
 * Created by bomi on 2018-12-21.
 */

public class Main_6603 {
    static int[] s;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        int k;

        while(true) {
            str = br.readLine().split(" ");
            k = Integer.parseInt(str[0]);

            if(k == 0) {
                break;
            }

            s = new int[k];
            for(int i=0; i<s.length; i++) {
                s[i] = Integer.parseInt(str[i+1]);
            }

            arr = new int[6];
            solution(0, 0);
            System.out.println();
        }
    }

    static void solution(int start, int idx) {
        if(idx == arr.length) {
            for(int i=0; i<6; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=start; i<s.length; i++) {
            arr[idx] = s[i];
            solution(i + 1, idx + 1);
        }
    }
}
