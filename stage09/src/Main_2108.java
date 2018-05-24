import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main_2108 { // #2108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0, mode = 0;
		Map<Integer, Integer> map = new HashMap<>(); // 최빈값 저장
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
				
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {		
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		
		Set<Integer> value = new TreeSet<>(); 
		for(int i=0; i<arr.length; i++) {
			if(mode < map.get(arr[i])) {
				mode = map.get(arr[i]);
				value.clear();
				value.add(arr[i]);
			} else if(mode == map.get(arr[i])) {
				value.add(arr[i]);
			}
		}
			
		Iterator it = value.iterator();
		if(value.size() == 1) mode = (int)it.next();
		else {
			int index = 0;
			while(index != 2) {
				if(it.hasNext()) mode = (int)it.next();
				index++;
			}
		}

		System.out.println(Math.round((double)sum/arr.length));
		System.out.println(arr[arr.length/2]);
		System.out.println(mode);
		System.out.println(arr[arr.length-1] - arr[0]);
	}

}