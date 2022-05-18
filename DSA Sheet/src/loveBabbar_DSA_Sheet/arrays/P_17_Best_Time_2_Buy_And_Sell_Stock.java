package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_17_Best_Time_2_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit = " + maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int profit = 0 , min = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < min)
                min = arr[i];
            if (arr[i] - min > profit)
                profit = arr[i] - min;
        }
        return profit;
    }
}
