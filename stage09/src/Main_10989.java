import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_10989 {
	int[] numbers; // 입력된 숫자
	int[] countArr; // 숫자 세기
	
	int max = 0;
	int index = 0;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	void inputNumbers() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine().trim());
		numbers = new int[size];
		for(int i=0; i<numbers.length; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			numbers[i] = num;
			if(max < num) max = num;
		}
	}
	
	void sort() throws IOException {
		inputNumbers();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> count = new TreeMap();
		int max = 0;
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			if(count.containsKey(input))
				count.put(input, count.get(input) + 1);
			else
				count.put(input, 1);
		}
		
		Iterator<Integer> keys = count.keySet().iterator();
		while(keys.hasNext()) {
			int k = keys.next();
			int v = count.get(k);
			for(int i=0; i<v; i++) {
				System.out.println(k);
			}
		}
*/	}

}
