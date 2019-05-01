package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-01.
 */
public class Main_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int a = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);
        int r = 0;

        while(a != b) {
            a = (a+1)/2;
            b = (b+1)/2;
            r++;
        }

        System.out.println(r == 0 ? -1 : r);

    }
}
