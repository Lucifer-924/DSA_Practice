package loveBabbar_DSA_Sheet.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class P_21_SubarrayWithSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subarrayWithSumZero(arr , n));
    }
    public static boolean subarrayWithSumZero(int[] arr , int n) {
        int currSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if(currSum == 0)
                return true;
            if (set.contains(currSum))
                return true;
            set.add(currSum);
        }
        return false;
    }
}
