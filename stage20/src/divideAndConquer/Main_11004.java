/* <문제> 수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다. 둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)
 * <출력> A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.
 */
package divideAndConquer;

import java.util.*;

public class Main_11004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		
		int n = Integer.parseInt(line.split(" ")[0]);
		int k = Integer.parseInt(line.split(" ")[1]);
		if(!(1<=k && k<=n && n<=5000000)) return;
		
		int[] intArr = new int[n];
		for(int i=0; i<intArr.length; i++)
			intArr[i] = sc.nextInt();
		
		mergeSort(intArr, 0, intArr.length-1);
		
		System.out.println(intArr[k-1]);
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(start == end) return;
		int middle = (start + end) / 2;
		mergeSort(a, start, middle);
		mergeSort(a, middle+1, end);
		merge(a, start, middle, end);
	}
	
	public static void merge(int[] a, int start, int middle, int end) {
		int length = end - start + 1;
		int[] sorted = new int[length];
		int i = 0;
		int ind1 = start;
		int ind2 = middle + 1;
		
		while(ind1 <= middle && ind2 <= end) {
			if(a[ind1] < a[ind2])
				sorted[i++] = a[ind1++];
			else sorted[i++] = a[ind2++];
		}
		
		while(ind1 <= middle) sorted[i++] = a[ind1++];
		while(ind2 <= end) sorted[i++] = a[ind2++];
		
		for(int j=0; j<sorted.length; j++)
			a[start + j] = sorted[j];
	}
}
