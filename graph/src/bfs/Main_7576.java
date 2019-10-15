package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-15.
 */
public class Main_7576 {
    static class Pair {
        int x;
        int y;

        public Pair() {

        }

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static Queue<Pair> queue = new LinkedList<>();
    private static Pair[] direction = {new Pair(0, 1), new Pair(0, -1), new Pair(-1, 0), new Pair(1, 0)};

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] numbers = br.readLine().split(" ");

        int w = Integer.parseInt(numbers[0]);
        int h = Integer.parseInt(numbers[1]);

        int[][] box = makeBox(h, w);

        int date = countDate(box);
        System.out.println(date);
    }

    private static int[][] makeBox(int h, int w) throws IOException {
        StringTokenizer st;
        int[][] array = new int[h][w];

        for(int i=0; i<h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<w; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());

                if(array[i][j] == 1) {
                    queue.offer(new Pair(i, j));
                }
            }
        }

        br.close();
        return array;
    }

    private static int countDate(int[][] box) {
        int h = box.length;
        int w = box[0].length;

        if(queue.isEmpty()) return -1;

        while(true) {
            Pair p = queue.poll();

            for(int i=0; i<4; i++) {
                int nextX = direction[i].x + p.x;
                int nextY = direction[i].y + p.y;

                if(nextX < 0 || h <= nextX || nextY < 0 || w <= nextY) {
                    continue;
                }

                if(box[nextX][nextY] == 0) {
                    box[nextX][nextY] = box[p.x][p.y] + 1;

                    queue.offer(new Pair(nextX, nextY));
                }
            }

            if(queue.isEmpty()) {
                return box[p.x][p.y] - 1;
            }
        }
    }
}
