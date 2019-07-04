package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by bomi on 2019-07-02.
 */
public class Main_2983 {
    static Map<Long, List<Pair>> direct = new HashMap<>();
    static Map<Long, List<Pair>> inverse = new HashMap<>();
    static Pair current = null;

    static class Pair implements Comparable<Pair> {
        long x, y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            long r = this.x - o.x;
            if(r != 0) return (int)r;
            return (int)(this.y - o.y);
        }

        public long directKey() {
            return x - y;
        }

        public long inverseKey() {
            return x + y;
        }
    }

    static void add(Pair p) {
        if(current == null) {
            current = p;
        }

        List<Pair> directList = direct.get(p.directKey());
        if(directList == null) {
            directList = new ArrayList<>();
            direct.put(p.directKey(), directList);
        }

        List<Pair> inverseList = inverse.get(p.inverseKey());
        if(inverseList == null) {
            inverseList = new ArrayList<>();
            inverse.put(p.inverseKey(), inverseList);
        }

        directList.add(p);
        inverseList.add(p);
    }

    static void sort(Map<Long, List<Pair>> map) {
        for(long key : map.keySet()) {
            Collections.sort(map.get(key));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String cmd = br.readLine();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            add(new Pair(x, y));
        }

        sort(direct);
        sort(inverse);

        for(char c : cmd.toCharArray()) {
            List<Pair> directList = direct.get(current.directKey());
            List<Pair> inverseList = inverse.get(current.inverseKey());

            if(c == 'A' || c == 'D') {
                int index = Collections.binarySearch(directList, current);
                if((c == 'A' && index < directList.size() - 1)
                || (c == 'D' && index > 0)) {
                    Pair next = directList.get(index + (c == 'A' ? 1 : -1));
                    directList.remove(index);
                    inverseList.remove(Collections.binarySearch(inverseList, current));
                    current = next;
                }
                continue;
            }

            int index = Collections.binarySearch(inverseList, current);
            if((c == 'B' && index < inverseList.size() - 1)
            || (c == 'C' && index > 0)) {
                Pair next = inverseList.get(index + (c == 'B' ? 1 : -1));
                inverseList.remove(index);
                directList.remove(Collections.binarySearch(directList, current));
                current = next;
            }
        }

        System.out.println(current.x + " " + current.y);
    }
}
