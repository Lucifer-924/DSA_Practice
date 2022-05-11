package loveBabbar_DSA_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P_13_MergeIntervals {

	public static int[][] merge(int[][] arr){
		
		List<int[]> res = new ArrayList<>();
		
		if(arr.length == 0 || arr == null) {
			return res.toArray(new int[0][]);
		}
		Arrays.sort(arr, (a,b) -> a[0]-b[0]);
		
		int start = arr[0][0];
		int end = arr[0][1];
		
		for(int i[] : arr) {
			if(i[0] <= end) {
				end = Math.max(i[1], end);
			}
			else {
				res.add(new int[] {start,end});
				start = i[0];
				end = i[1];
			}
		}
		res.add(new int[] {start,end});
		
		return res.toArray(new int[0][]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] ans = merge(arr);
		
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
