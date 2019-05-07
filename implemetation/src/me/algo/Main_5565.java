package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5565 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        for(int i=0; i<9; i++) {
            int money = Integer.parseInt(br.readLine());
            total -= money;
        }

        System.out.println(total);
    }
}
