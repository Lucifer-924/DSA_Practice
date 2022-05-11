package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_15_NextPermutation {

	public static void nextPermutation(int[] arr, int n) {
		
		if(n <= 1) return;
		
		int i = n-2;
		while(i >= 0 && arr[i] >= arr[i+1])
			i--;
		
		if(i >= 0) {
			int j = n-1;
			while(arr[j] <= arr[i]) 
				j--;
			swap(arr, i, j);
		}
		
		reverse(arr, i+1, n-1);
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static void reverse(int[] arr, int i, int j) {
		while(i < j) {
			swap(arr, i++, j--);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		nextPermutation(arr, n);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
