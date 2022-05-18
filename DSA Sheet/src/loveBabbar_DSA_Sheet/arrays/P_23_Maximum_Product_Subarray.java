package loveBabbar_DSA_Sheet.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P_23_Maximum_Product_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxProduct(arr , n));
    }
    public static long maxProduct(int[] arr , int n) {
        long max = Integer.MIN_VALUE , prod = 1;
        for (int i = 0 ; i < n ; i++) {
            prod = prod * arr[i];
            max = Math.max(max , prod);
            if (prod == 0)
                prod = 1;
        }
        prod = 1;
        for (int i = n - 1 ; i >= 0 ; i--) {
            prod = prod * arr[i];
            max = Math.max(max , prod);
            if (prod == 0)
                prod = 1;
        }
        return max;
    }
}
