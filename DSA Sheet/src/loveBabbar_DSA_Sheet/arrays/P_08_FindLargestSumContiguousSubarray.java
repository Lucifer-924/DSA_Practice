package loveBabbar_DSA_Sheet.arrays;

public class P_08_FindLargestSumContiguousSubarray {

	public static void main(String[] args) {
		
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	     System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	public static int maxSubArraySum(int[] arr) {
		
		int n = arr.length;
		int max_so_far = Integer.MIN_VALUE;
		int max_ends_here = 0;
		
		for(int i = 0; i < n; i++) {
			
			max_ends_here += arr[i];
			
			if(max_ends_here > max_so_far)
				max_so_far = max_ends_here;
			
			if(max_ends_here < 0)
				max_ends_here = 0;
		}
		return max_so_far;
	}
}
