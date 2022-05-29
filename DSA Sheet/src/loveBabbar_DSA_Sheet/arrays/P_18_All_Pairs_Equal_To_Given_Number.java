package loveBabbar_DSA_Sheet.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class P_18_All_Pairs_Equal_To_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Pairs = " + pairs(arr , k));
    }
    public static int pairs(int[] arr , int k) {
        int res = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i : arr) {
            map.compute(i , (key , value) -> {
               if (value == null)
                   return 1;
               return value + 1;
            });
        }
        for (int ele : arr) {
            if ( ele * 2 == k)
                res += Math.max(map.getOrDefault(ele , 0) - 1 , 0);
            else
                res += map.getOrDefault(k - ele , 0);
        }
        return res/2;
    }
}
