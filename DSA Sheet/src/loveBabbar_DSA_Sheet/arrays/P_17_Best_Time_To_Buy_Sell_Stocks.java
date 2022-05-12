package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_17_Best_Time_To_Buy_Sell_Stocks {

    private static int maxProfit(int[] prices, int n){

        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++){

            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int ans = maxProfit(prices, n);
        System.out.println(ans);
    }
}
