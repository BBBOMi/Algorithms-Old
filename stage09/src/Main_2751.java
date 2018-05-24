import java.util.*;

public class Main_2751 { // #2751

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length-1);
		
		for(int i : arr)
			System.out.println(i);
	}
	
	static void mergeSort(int[] arr, int start, int end) {
		if((arr == null) || start >= end) return;
		int middle = (end + start) / 2;
		mergeSort(arr, start, middle);
		mergeSort(arr, middle+1, end);
		merge(arr, start, middle, end);
	}
	
	static void merge(int[] arr, int start, int middle, int end) {
		int length = end - start + 1;
		int[] tmp = new int[length];
		int i = 0;
		int index1 = start;
		int index2 = middle + 1;
		
		while(index1 <= middle && index2 <= end) {
			if(arr[index1] < arr[index2]) tmp[i++] = arr[index1++];
			else tmp[i++] = arr[index2++];
		}
		
		while(index1 <= middle) {
			tmp[i++] = arr[index1++];
		}
		
		while(index2 <= end) {
			tmp[i++] = arr[index2++];
		}
		
		for(int j=0; j<tmp.length; j++) {
			arr[start + j] = tmp[j];
		}
	}
}
