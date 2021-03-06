package loveBabbar_DSA_Sheet.arrays;

public class P_12_Merge2sortedArraysWithoutUsingExtraSpace {

	public static int nextGap(int gap) {
		if(gap <= 1) return 0;
		
		return (gap / 2) + (gap % 2);
	}
	
	public static void merge(int[] arr1, int[] arr2, int n, int m) {
		
		int i, j, gap = n + m;
		
		for(gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
			
			// arranging elements in 1st array
			for(i = 0; i+gap < n; i++) {
				
				if(arr1[i] > arr1[i+gap]) {
					int temp = arr1[i+gap];
					arr1[i+gap] = arr1[i];
					arr1[i] = temp;
				}
			}
			// arranging elements of both loveBabbar_DSA_Sheet.arrays
			for(j = (gap > n) ? gap-n : 0; i < n && j < m; i++, j++) {
				
				if(arr1[i] > arr2[j]) {
					int temp = arr2[j];
					arr2[j] = arr1[i];
					arr1[i] = temp;
				}
			}
			if(j < m) {
				// arranging elements of 2nd array
				for(j = 0; j+gap < m; j++) {
					
					if(arr2[j] > arr2[j + gap]) {
						int temp = arr2[j+gap];
						arr2[j+gap] = arr2[j];
						arr2[j] = temp;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int[] a1 = { 10, 27, 38, 43, 82 };
		int[] a2 = { 3, 9 };

		// Function Call
		merge(a1, a2, a1.length, a2.length);

		System.out.print("First Array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		System.out.print("Second Array: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
	}
	
}
