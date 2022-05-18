package loveBabbar_DSA_Sheet.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class P_24_LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(consecutiveSubsequence(arr));
    }
    public static int consecutiveSubsequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int longestStreak = 0;
        for (int i : arr) {
            if (!set.contains(i - 1)) {
                int currNum = i;
                int currStreak = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }
}
