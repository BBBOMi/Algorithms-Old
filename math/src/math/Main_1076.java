package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_1076 {
    static final List<String> COLOR =
            Arrays.asList(new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"});

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = COLOR.indexOf(br.readLine()) * 10;
        int second = COLOR.indexOf(br.readLine());
        int third = COLOR.indexOf(br.readLine());

        System.out.println((first+second) * (long)Math.pow(10, third));

    }
}
