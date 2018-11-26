/*
 * <문제> 당신은 매주마다의 랭킹 정보 리스트를 인풋으로 받아 2등 선수가 누구인지 알아내는 프로그램을 짜야 합니다.
 * <입력> 각 선수는 1~10000까지의 정수(선수 번호)로 식별됩니다. 인풋은 여러 테스트 케이스들로 구성됩니다.
		 테스트 케이스의 첫 행에는 두 정수 N과 M이 주어지는데, 다음 행부터 N(2<=N<=500)주 동안의 매주 상위 M(2<=M<=500)명의 랭킹 정보가 주어짐을 의미합니다.
		 그 다음 N행의 인풋이 주어지는데 각 행은 한 주의 랭킹 정보입니다. 각 행은 공백으로 구분되는 M개의 정수들이 주어집니다.  
			•각 테스트 케이스에는 최고점의 선수가 단 한 명만 존재합니다.
			•매주마다의 랭킹 정보에는 서로 다른 M개의 선수 번호가 주어집니다.
		 N과 M이 모두 0으로 주어지는 행이 인풋의 마지막입니다.
 * <출력> 각 테스트 케이스마다, 당신의 프로그램은 한 행에 2등인 선수(들)의 번호를 출력해야 합니다.
  		 2등인 선수가 두 명 이상인 경우(동점자 발생), 각 선수 번호를 공백으로 구분하여 오름차순으로 출력해야 합니다.
 */

package DP;

import java.util.*;

public class Main_5766 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = Integer.parseInt(sc.next().trim());
			int m = Integer.parseInt(sc.next().trim());
			if(n==0 && m==0) break;

			int[][] arr = new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					arr[i][j] = Integer.parseInt(sc.next().trim());
				}
			}
			solution(arr);
		}

	}

	static void solution(int[][] array) {
		if(array.length<2 || 500<array.length || array[0].length<2 || 500<array[0].length)
			return;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				int key = array[i][j];
				int value = !map.containsKey(key) ? 1 : map.get(key)+1;
				map.put(key, value);
			}
		}

		Set<Integer> values = new HashSet<>();
		values.addAll(map.values());
		
		List<Integer> list = new ArrayList<>(values);
		Collections.sort(list);
		int second = list.get(list.size()-2);
		
		List<Integer> entry = new ArrayList<>();
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			if(map.get(key) == second) {
				entry.add(key);
			}
		}

		Collections.sort(entry);
		for(int i=0; i<entry.size(); i++) {
			System.out.print(entry.get(i) + " ");
		}
		System.out.println();	
	}
}
