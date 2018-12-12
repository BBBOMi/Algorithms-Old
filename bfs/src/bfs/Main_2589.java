package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2018-12-12.
 */

public class Main_2589 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] len = br.readLine().split(" ");

        int c = Integer.parseInt(len[0]);
        int r = Integer.parseInt(len[1]);

        int[][] map = new int[c][r];

        StringTokenizer st;
        for(int i=0; i<map.length; i++) {
            st = new StringTokenizer(br.readLine(), "");
            for(int j=0; j<map[0].length; j++) {
                if(st.nextToken().equals("W")) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = 1;
                }
            }
        }

        solution(map);
    }

    static void solution(int[][] map) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<map.length; i++) {
        }

    }
}
